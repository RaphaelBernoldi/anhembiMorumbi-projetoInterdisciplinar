angular.module('SimuladorCampeonato')
	.controller('PartidaController', function($scope, TimeService, PartidaService, CampeonatoService){	
		
	$scope.respostaResquest = {};
	$scope.partida={timeMandante:"Selecione", timeVisitante:"Selecione"};
	$scope.times=[];
	$scope.campeonatos=[];
	
	init();
	
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
	
	
	$scope.cadastrarPartida = function(){
		var valido = validaPartidas();
		if(valido){
		var promise = PartidaService.cadastrarPartida($scope.partida);
			promise.then(function(response) {
						$scope.respostaResquest = response.data;
						});
		
		}
	}
	
	function validaPartidas(){
		if($scope.partida.timeMandante == $scope.partida.timeVisitante){
			$scope.respostaResquest.message = 'Os times devem ser diferentes';
			return false;
		}
		return true;
	}
	
});	