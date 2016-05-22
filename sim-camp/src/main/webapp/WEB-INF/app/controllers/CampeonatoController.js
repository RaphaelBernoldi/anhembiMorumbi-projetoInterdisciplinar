angular.module('SimuladorCampeonato')
	.controller('CampeonatoController', function($scope, CampeonatoService){	
		
	$scope.respostaResquest = {};
	$scope.campeonato={};
	$scope.campeonatos=[];
	$scope.resultados=[];
	$scope.campeonatoID=0;
	
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
				$scope.campeonato = {nome: ''};
		}
	}	
	
	$scope.buscaResultadosPorCampeonado = function(){
		var promise = CampeonatoService.buscaResultadosPorCampeonado($scope.campeonatoID);
			promise.then(
					function(response) {
						console.log(response.data.lsObjetosEncontrados);
						$scope.resultados = response.data.lsObjetosEncontrados;
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
			$scope.respostaResquest.message = 'O nome do campeonato e obrigatorio';
			return false;
		}
		return true;
	}
	
});	