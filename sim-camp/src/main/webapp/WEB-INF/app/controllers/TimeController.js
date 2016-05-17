angular.module('SimuladorCampeonato')
	.controller('TimeController', function($scope, TimeService, CampeonatoService){	
		
	$scope.respostaResquest = {};
	$scope.time={};
	$scope.campeonatos = [];
	$scope.idCampeonato = 0;
	
	init();
	
	function init(){
		buscaCampeonatos();
	}
	
	function buscaCampeonatos() {		
		var promise = CampeonatoService.buscarTodos();
		promise.then(
				function(response) {
					console.log(response);
					$scope.campeonatos = response.data.lsObjetosEncontrados;
					});
	}
		
	$scope.CadastrarTime = function(){
		var promise = TimeService.cadastrarTime($scope.time, $scope.idCampeonato);
			promise.then(
					function(response) {
						$scope.respostaResquest = response.data;
						});
	}	
	
});	