angular.module('SimuladorCampeonato')
	.service('TimeService', function($http) {

			
		this.cadastrarTime = function(time){
			
			return $http.post('/sim-camp/rest/time/save', time)
			 .success(function(data){
				 respostaResquest = data;
			 });
		}
		
		
	});

