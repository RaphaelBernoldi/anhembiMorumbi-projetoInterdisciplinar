angular.module('SimuladorCampeonato')
	.controller('PartidaController', function($scope, TimeService, PartidaService){	
		
	$scope.respostaResquest = {};
	$scope.partida={timeMandante:"Selecione", timeVisitante:"Selecione"};
	
	
	
	init();
	
	function init(){
		var promise = TimeService.buscarTodos();
		promise.then(function(response) {
					console.log(response);
					$scope.respostaResquest = response.data;
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