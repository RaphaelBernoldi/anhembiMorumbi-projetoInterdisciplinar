<!DOCTYPE html>
<html ng-app="SimuladorCampeonato">
<head>
	<title>
		Cadastrar Partida
	</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/app.css" />
		
	
</head>
<div class="jumbotron" >
	<div class="formCadastro" ng-controller="PartidaController">
		<h3>Cadastrar nova Partida</h3>
		
		{{respostaResquest.message}}
		
		<form name="PartidaForm">
			<label class="form-control" for="campeonato">Campeonato: </label>
   			<select class="form-control" name="campeonato" id="campeonato" ng-model="idCampeonato" placeholder="Time Mandante">
     			<option ng-repeat="campeonato in campeonatos" value="{{campeonato.id}}">{{campeonato.nome}}</option>
    		</select><br/>
			<label class="form-control" for="timeMandante">Time Mandante: </label>
   			<select class="form-control" name="timeMandante" id="timeMandante" ng-model="partida.timeMandante" placeholder="Time Mandante">
     			<option ng-repeat="time in times" value="{{time.nome}}">{{time.nome}} - {{time.cidade}}</option>
    		</select><br/>
			<label class="form-control" for="timeVisitante">Time Visitante: </label>
   			<select class="form-control" name="timeVisitante" id="timeVisitante" ng-model="partida.timeVisitante" placeholder="Time Visitante">
     			<option ng-repeat="time in times" value="{{time.nome}}">{{time.nome}} - {{time.cidade}}</option>
    		</select>
			<input class="form-control" ng-model="partida.golsMandante" type="text" placeholder="Gol(s) Mandante"/>
			<input class="form-control" ng-model="partida.golsVisitante" type="text" placeholder="Gol(s) visitante"/>
			<button class="btn btn-success btn-sm btn-block" ng-Click="cadastrarPartida()">Cadastrar Partida</button>	
			<a  class="btn btn-danger btn-sm btn-block" href="/sim-camp/">voltar</a>
		</form>
	</div>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/lib/bower_components/angular/angular.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/modules/simuladorCampeonato.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/services/CampeonatoService.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/services/TimeService.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/services/PartidaService.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/controllers/PartidaController.js"></script>
</html>