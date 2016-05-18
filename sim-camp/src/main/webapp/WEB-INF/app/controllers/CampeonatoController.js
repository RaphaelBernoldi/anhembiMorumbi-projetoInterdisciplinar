angular.module('SimuladorCampeonato')
	.controller('CampeonatoController', function($scope, CampeonatoService){	
		
	$scope.respostaResquest = {};
	$scope.campeonato={};
	$scope.campeonatos=[];
		
	$scope.cadastrarCampeonato = function(){
		if(validaCadastro()){
		
			var promise = CampeonatoService.cadastrarCampeonato($scope.campeonato);
				promise.then(
						function(response) {
							$scope.respostaResquest = response.data;
							});
		}
	}	
	
	
	
	
	function validaCadastro(){
		if($scope.campeonato.nome == null || $scope.campeonato.nome == ''){
			$scope.respostaResquest.message = 'O nome do campeonato é obrigatório';
			return false;
		}
		return true;
	}
	
});	