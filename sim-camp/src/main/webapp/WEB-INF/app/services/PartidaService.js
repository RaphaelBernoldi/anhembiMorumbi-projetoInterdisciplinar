angular.module('SimuladorCampeonato')
	.service('PartidaService', function($http) {

			
		this.cadastrarPartida = function(partida, idCampeonato){
			console.log('idCampeonato = '+idCampeonato);
			console.log(partida);
			return $http.post('/sim-camp/partida/salvar/'+idCampeonato , partida)
			 .success(function(data){
				 respostaResquest = data;
			 });
		}
		
		
	});

