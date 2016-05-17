angular.module('SimuladorCampeonato')
	.service('CampeonatoService', function($http) {

			
		this.cadastrarCampeonato = function(campeonato){
			
			return $http.post('/sim-camp/campeonato/salvar', campeonato)
			 .success(function(data){
				 respostaResquest = data;
			 });
		}
		
		this.buscarTodos = function(){
			return $http.post('/sim-camp/campeonato/buscarTodos')
			 .success(function(data){
				 respostaResquest = data;
			 });
		}
		
		
	});

