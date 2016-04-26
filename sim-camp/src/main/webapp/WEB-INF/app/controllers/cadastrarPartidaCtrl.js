angular.module("SimuladorCampeonato")
.controller("cadastrarPartidaCtrl", function($scope, $location){	

	$scope.CadastrarPartida = function(partida){
		console.log(partida);
		delete $scope.partida;
		$location.path("/partidas");
	}	
	
});	