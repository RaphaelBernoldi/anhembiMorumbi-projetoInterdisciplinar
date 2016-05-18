angular.module('SimuladorCampeonato')
	.controller('PartidaController', function($scope, TimeService, PartidaService, CampeonatoService){	
		
	$scope.respostaResquest = {};
	$scope.partida={timeMandante:"Selecione", timeVisitante:"Selecione"};
	$scope.times=[];
	$scope.campeonatos=[];
	$scope.idCampeonato=0;
	$scope.partidas=[];
	
	init();
	
	$scope.cadastrarPartida = function(){
		var valido = validaPartidas();
		if(valido){
			console.log($scope.partida);
		var promise = PartidaService.cadastrarPartida($scope.partida);
			promise.then(function(response) {
						$scope.respostaResquest = response.data;
						});
		}
	}
	
	$scope.busaPartidasDoCampeonato = function(){
		var promise = PartidaService.cadastrarPartida($scope.idCampeonato);
		promise.then(function(response) {
					$scope.partidas = response.data.lsObjetosEncontrados;
					});
	}
	
	function init(){
		buscarTimes();
		buscarCampeonatos();
		}
	
	
	function buscarTimes(){
		var promise = TimeService.buscarTodos();
		promise.then(function(response) {
					console.log(response);
					$scope.times = response.data.lsObjetosEncontrados;
					});
	}
	
	function buscarCampeonatos() {		
		var promise = CampeonatoService.buscarTodos();
		promise.then(
				function(response) {
					console.log(response);
					$scope.campeonatos = response.data.lsObjetosEncontrados;
					});
	}
	
	
	
	function validaPartidas(){
		if($scope.partida.idTimeMandante == $scope.partida.idTimeVisitante){
			$scope.respostaResquest.message = 'Os times devem ser diferentes';
			return false;
		}
		return true;
	}
	
});	