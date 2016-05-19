<!DOCTYPE html>
<html ng-app="SimuladorCampeonato">
<head>
	<title>
		Lista de Partidas
	</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/app.css" />
</head>

<div class="jumbotron" >
	<div class="formCadastro" ng-controller="PartidaController">
		<h3>Lista Partidas</h3>
			<form name="listaPartidaForm">
				<label class="form-control" for="campeonato">Campeonato: </label>
 				<select class="form-control" name="campeonato" id="campeonato" ng-change="busaPartidasDoCampeonato()"  ng-model="idCampeonato" placeholder="Time Mandante">
   					<option ng-repeat="campeonato in campeonatos" value="{{campeonato.id}}">{{campeonato.nome}}</option>
  				</select><br/>
  				
  				<table ng-show="partidas.length > 0" class="table table-striped table-bordered">
					<tr>
						<th>Time Mandante</th>
						<th>Gols Mandante</th>
						<th>Time Visitante</th>
						<th>Gols Visitante</th>
					</tr>
					<tr ng-repeat="partida in partidas">
						<td>{{partida.timeMandante.nome}}</td>
						<td>{{partida.golsMandante}}</td>
						<td>{{partida.timeVisitante.nome}}</td>
						<td>{{partida.golsVisitante}}</td>
				</table>
  					
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