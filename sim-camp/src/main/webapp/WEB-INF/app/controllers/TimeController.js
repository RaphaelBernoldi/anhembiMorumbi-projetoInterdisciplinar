angular.module('SimuladorCampeonato')
	.controller('TimeController', function($scope, TimeService){	
		
	$scope.respostaResquest = {};
		
	$scope.CadastrarTime = function(time){
		console.log(time);
		var promise = TimeService.cadastrarTime(time);
			promise.then(
					function(response) {
						$scope.respostaResquest = response.data;
						});
	}	
});	