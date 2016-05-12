angular.module('SimuladorCampeonato')
	.service('PartidaService', function($http) {

			
		this.cadastrarPartida = function(partida){
			
			return $http.post('/sim-camp/partida/salvar', partida)
			 .success(function(data){
				 respostaResquest = data;
			 });
		}
		
		
	});

