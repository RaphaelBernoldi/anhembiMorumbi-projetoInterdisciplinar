<!DOCTYPE html>
<html ng-app="SimuladorCampeonato">
<head>
	<title>
		Lista de Partidas
	</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/app.css" />
</head>

<div class="jumbotron" >
	<h3>Colocação</h3>
	<table ng-show="colocacoes.length > 0" class="table table-striped table-bordered">
		<tr>
			<th>Pontuação</th>
			<th>Time</th>
			<th>Vitórias</th>
			<th>Empates</th>
			<th>Derrotas</th>
			<th>Saldo De Gols</th>
		</tr>
		<tr ng-repeat="colocacao in colocacoes | orderBy:'-pontuacao*1'">
			<td>{{colocacao.pontuacao}}</td>
			<td>{{colocacao.nome}}</td>
			<td>{{colocacao.vitorias}}</td>
			<td>{{colocacao.empates}}</td>
			<td>{{colocacao.derrotas}}</td>
			<td>{{colocacao.gols}}</td>
		</tr>
	</table>
	<a  class="btn btn-danger btn-sm btn-block" href="#/partidas">voltar</a>
</div>

<script type="text/javascript" src="${pageContext.request.contextPath}/resources/lib/bower_components/angular/angular.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/modules/simuladorCampeonato.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/services/CampeonatoService.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/services/TimeService.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/services/PartidaService.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/controllers/PartidaController.js"></script>
</html>