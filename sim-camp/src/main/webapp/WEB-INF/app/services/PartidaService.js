angular.module('SimuladorCampeonato')
	.service('PartidaService', function($http) {

			
		this.cadastrarPartida = function(partida){
			console.log(partida);
			return $http.post('/sim-camp/partida/salvar/', partida)
			 .success(function(data){
				 respostaResquest = data;
			 });
		}
		
		this.busaPartidasDoCampeonato = function(idCampeonato){
			console.log(partida);
			return $http.post('/sim-camp/partida/buscar', idCampeonato)
			 .success(function(data){
				 respostaResquest = data;
			 });
		}
		
		
	});

