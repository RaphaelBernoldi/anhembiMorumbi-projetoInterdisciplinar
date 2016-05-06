angular.module("SimuladorCampeonato")
	.controller("cadastrarTimeCtrl", function($scope, cadastraTimeService){	

	$scope.CadastrarTime = function(time){
		console.log('Cadastrando time... '+time.nome +' / ' + time.cidade);
		console.log('Segundo teste' + cadastraTimeService.teste);
	}	
});	