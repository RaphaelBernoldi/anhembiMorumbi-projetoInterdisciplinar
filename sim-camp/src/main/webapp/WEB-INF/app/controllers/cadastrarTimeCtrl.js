angular.module("SimuladorCampeonato").controller("cadastrarTimeCtrl", function($scope , $location){	

	$scope.CadastrarTime = function(time){
		console.log(time);
		delete $scope.time;
		$location.path("/partidas");
	}	
});	