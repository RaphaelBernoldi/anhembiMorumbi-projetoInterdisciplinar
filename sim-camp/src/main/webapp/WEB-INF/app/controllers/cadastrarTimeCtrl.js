angular.module("SimuladorCampeonato")
	.controller("cadastrarTimeCtrl", function($scope){	

	$scope.CadastrarTime = function(time){
		console.log('Cadastrando time... '+time.nome +' / ' + time.cidade);
	}	
});	