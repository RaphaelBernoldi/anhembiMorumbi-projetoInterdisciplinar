angular.module('SimuladorCampeonato')
	.controller('CampeonatoController', function($scope, CampeonatoService){	
		
	$scope.respostaResquest = {};
	$scope.campeonato={};
	$scope.campeonatos=[];
	$scope.resultados=[];
	
	init();
	
	function init(){
		buscarCampeonatos();
		console.log($scope.campeonatos);
	}
		
	$scope.cadastrarCampeonato = function(){
		if(validaCadastro()){
		
			var promise = CampeonatoService.cadastrarCampeonato($scope.campeonato);
				promise.then(
						function(response) {
							$scope.respostaResquest = response.data;
							});
		}
	}	
	
	$scope.buscaResultadosPorCampeonado = function(){
		var promise = CampeonatoService.buscaResultadosPorCampeonado($scope.campeonato);
		console.log($scope.campeonato);
			promise.then(
					function(response) {
						console.log(response.data);
						$scope.resultados = response.data;
						});
	}
	
	
	function buscarCampeonatos() {		
		var promise = CampeonatoService.buscarTodos();
		promise.then(
				function(response) {
					console.log(response);
					$scope.campeonatos = response.data.lsObjetosEncontrados;
					});
	}
	
	function validaCadastro(){
		if($scope.campeonato.nome == null || $scope.campeonato.nome == ''){
			$scope.respostaResquest.message = 'O nome do campeonato é obrigatório';
			return false;
		}
		return true;
	}
	
});	