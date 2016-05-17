angular.module('SimuladorCampeonato')
	.controller('CampeonatoController', function($scope, CampeonatoService){	
		
	$scope.respostaResquest = {};
	$scope.campeonato={};
		
	$scope.CadastrarTime = function(){
		var promise = CampeonatoService.cadastrarCampeonato($scope.campeonato);
			promise.then(
					function(response) {
						$scope.respostaResquest = response.data;
						});
	}	
});	