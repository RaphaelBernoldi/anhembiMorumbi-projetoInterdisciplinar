	angular.module("SimuladorCampeonato").controller("SimuladorCampeonatoCtrl", function($scope){	
		$scope.nomeCampeonato="Campeonato Brasileiro"
		$scope.partidas=[
		{timeMandante: "São Paulo", timeVisitante:"corinthians", golsMandante:"5", golsVisitantes:"1"},
		{timeMandante: "Santos", timeVisitante:"São Paulo", golsMandante:"3", golsVisitantes:"4"},
		{timeMandante: "Palmeiras", timeVisitante:"Portuguesa", golsMandante:"2", golsVisitantes:"2"},
		{timeMandante: "Fluminense", timeVisitante:"Flamengo", golsMandante:"3", golsVisitantes:"2"},
		{timeMandante: "corinthians", timeVisitante:"Palmeiras", golsMandante:"3", golsVisitantes:"5"}
		];
		
	});	