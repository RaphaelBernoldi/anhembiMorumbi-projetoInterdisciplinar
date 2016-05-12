angular.module('SimuladorCampeonato')
	.controller('PartidaController', function($scope, TimeService, PartidaService){	
		
	$scope.respostaResquest = {};
	$scope.partida={};
	
	
	init();
	
	function init(){
		console.log('init');
		var promise = TimeService.buscarTodos();
		promise.then(
				function(response) {
					console.log(response);
					$scope.respostaResquest = response.data;
					});
		}
	
	
	$scope.CadastrarTime = function(){
		var promise = PartidaService.cadastrarPartida($scope.partida);
			promise.then(
					function(response) {
						$scope.respostaResquest = response.data;
						});
	}	
});	