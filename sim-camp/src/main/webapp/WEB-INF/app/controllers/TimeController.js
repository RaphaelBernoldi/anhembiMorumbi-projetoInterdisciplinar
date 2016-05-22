angular.module('SimuladorCampeonato')
	.controller('TimeController', function($scope, TimeService, CampeonatoService){	
		
	$scope.respostaResquest = {};
	$scope.time={};
	$scope.campeonatos = [];
	$scope.idCampeonato = 0;
	
	init();
	
	function init(){
		buscaCampeonatos();
	}
	
	function buscaCampeonatos() {		
		var promise = CampeonatoService.buscarTodos();
		promise.then(
				function(response) {
					console.log(response);
					$scope.campeonatos = response.data.lsObjetosEncontrados;
					});
	}
		
	$scope.CadastrarTime = function(){
		if(validaTime()){
			var promise = TimeService.cadastrarTime($scope.time, $scope.idCampeonato);
				promise.then(
						function(response) {
							$scope.respostaResquest = response.data;
							});
				$scope.time={};
		}
	}	
	
	function validaTime(){
		if($scope.idCampeonato == null || $scope.idCampeonato == 0){
			$scope.respostaResquest.message = 'Campeonato e obrigatorio';
			return false;
		}
		if($scope.time.nome == undefined || $scope.time.nome == ''){
			$scope.respostaResquest.message = 'O nome do time e obrigatorio';
			return false;
		}
		if($scope.time.cidade == undefined || $scope.time.cidade == ''){
			$scope.respostaResquest.message = 'O nome da cidade e obrigatorio';
			return false;
		}
		return true;
		
	}
	
});	