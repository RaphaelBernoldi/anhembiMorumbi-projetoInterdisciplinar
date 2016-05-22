angular.module('SimuladorCampeonato')
	.controller('PartidaController', function($scope, TimeService, PartidaService, CampeonatoService){	
		
	$scope.respostaResquest = {};
	$scope.partida={};
	$scope.times=[];
	$scope.campeonatos=[];
	$scope.idCampeonato=0;
	$scope.partidas=[];
	
	init();
	
	$scope.cadastrarPartida = function(){
		var valido = validaPartidas();
		if(valido){
		var promise = PartidaService.cadastrarPartida($scope.partida);
			promise.then(function(response) {
						$scope.respostaResquest = response.data;
						});
		}
	}
	
	$scope.busaPartidasDoCampeonato = function(){
		var promise = PartidaService.busaPartidasDoCampeonato($scope.idCampeonato);
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
		console.log($scope.partida);	
		if($scope.partida.idTimeMandante == $scope.partida.idTimeVisitante){
			$scope.respostaResquest.message = 'Os times devem ser diferentes';
			return false;
		}
		if($scope.partida.idCampeonato == undefined || $scope.partida.idCampeonato == 0){
			$scope.respostaResquest.message = 'O campo campeonato e obrigatorio';
			return false;
		}
		if($scope.partida.golsMandante  == undefined  || $scope.partida.golsMandante < 0){
			$scope.respostaResquest.message = 'Gols mandante deve ser igual ou maior que 0';
			return false;
		}
		if($scope.partida.golsVisitante  == undefined || $scope.partida.golsVisitante < 0){
			$scope.respostaResquest.message = 'Gols visitante deve ser igual ou maior que 0';
			return false;
		}
		return true;
	}
	
});	