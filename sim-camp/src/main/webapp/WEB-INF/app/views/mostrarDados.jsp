<!DOCTYPE html>
<html ng-app="SimuladorCampeonato">
<head>
	<title>
		Resultados
	</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/app.css" />
</head>

<div class="jumbotron" ng-controller="CampeonatoController">
	<h3>Colocação</h3>
	
	<label class="form-control" for="campeonato">Campeonato: </label>
	<select class="form-control" name="campeonato" id="campeonato" ng-change="buscaResultadosPorCampeonado()"  ng-model="campeonatoID" placeholder="Campeonato">
		<option ng-repeat="campeonato in campeonatos" value="{{campeonato.id}}">{{campeonato.nome}}</option>
	</select><br/>
	<table ng-show="resultados.length > 0" class="table table-striped table-bordered">
		<tr>
			<th>Pontuação</th>
			<th>Time</th>
			<th>Vitórias</th>
			<th>Empates</th>
			<th>Derrotas</th>
			<th>Saldo De Gols</th>
		</tr>
		<tr ng-repeat="resultado in resultados | orderBy:'-resultado*1'">
			<td>{{resultado.pontos}}</td>
			<td>{{resultado.time.nome}}</td>
			<td>{{resultado.vitorias}}</td>
			<td>{{resultado.empates}}</td>
			<td>{{resultado.derrotas}}</td>
			<td>{{resultado.saldoGols}}</td>
		</tr>
	</table>
	<a class="btn btn-danger btn-sm btn-block" href="/sim-camp/">voltar</a>
</div>

<script type="text/javascript" src="${pageContext.request.contextPath}/resources/lib/bower_components/angular/angular.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/modules/simuladorCampeonato.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/services/CampeonatoService.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/controllers/CampeonatoController.js"></script>
</html>