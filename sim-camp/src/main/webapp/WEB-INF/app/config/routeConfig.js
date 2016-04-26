angular.module("SimuladorCampeonato").config(function ($routeProvider){

	$routeProvider.when("/partidas", {
		templateUrl: "view/partidas.html",
		controller: "SimuladorCampeonatoCtrl"
	} );

	$routeProvider.when("/cadastrarTime", {
		templateUrl: "view/cadastrarTime.html",
		controller: "cadastrarTimeCtrl"
	} );

	$routeProvider.when("/cadastrarPartida", {
		templateUrl: "view/cadastrarPartida.html",
		controller: "cadastrarPartidaCtrl"
	} );

	$routeProvider.when("/mostrarDados", {
		templateUrl: "view/mostrarDados.html",
		controller: "mostrarDadosCtrl"
	} );

	$routeProvider.otherwise({redirectTo: "/partidas"});

}); 