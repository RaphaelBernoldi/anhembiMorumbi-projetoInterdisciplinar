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
		<form name="PartidaForm">
			<input class="form-control" ng-model="partida.timeMandante" type="text" placeholder="Time Mandante"/>
			<input class="form-control" ng-model="partida.timeVisitante" type="text" placeholder="Time Visitante"/>
			<input class="form-control" ng-model="partida.golsMandante" type="text" placeholder="Gol(s) Mandante"/>
			<input class="form-control" ng-model="partida.golsVisitante" type="text" placeholder="Gol(s) visitante"/>
			<button class="btn btn-success btn-sm btn-block" ng-Click="CadastrarPartida(partida)">Cadastrar Partida</button>	
			<a  class="btn btn-danger btn-sm btn-block" href="/sim-camp/">voltar</a>
		</form>
	</div>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/lib/bower_components/angular/angular.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/modules/simuladorCampeonato.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/services/TimeService.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/services/PartidaService.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/controllers/PartidaController.js"></script>
</html>