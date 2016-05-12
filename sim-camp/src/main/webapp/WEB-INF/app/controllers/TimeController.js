angular.module('SimuladorCampeonato')
	.controller('TimeController', function($scope, TimeService){	
		
	$scope.respostaResquest = {};
	$scope.time={};
		
	$scope.CadastrarTime = function(){
		var promise = TimeService.cadastrarTime($scope.time);
			promise.then(
					function(response) {
						$scope.respostaResquest = response.data;
						});
	}	
});	