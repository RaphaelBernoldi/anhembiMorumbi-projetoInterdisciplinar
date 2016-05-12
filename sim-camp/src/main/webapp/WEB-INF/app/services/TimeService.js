angular.module('SimuladorCampeonato')
	.service('TimeService', function($http) {

			
		this.cadastrarTime = function(time){
			
			return $http.post('/sim-camp/time/salvar', time)
			 .success(function(data){
				 respostaResquest = data;
			 });
		}
		
		this.buscarTodos = function(){
			return $http.post('/sim-camp/time/buscarTodos')
			 .success(function(data){
				 respostaResquest = data;
			 });
		}
		
		
	});

