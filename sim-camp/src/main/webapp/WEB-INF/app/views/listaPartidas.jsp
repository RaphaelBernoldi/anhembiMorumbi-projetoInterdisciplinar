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
		<table>
			<tr>
				<td>
					<form name="listaCampeonatosForm">
						
					</form>
				</td>
				<td>
					<form name="listaPartidaForm">
		
				</form>
				</td>
			</tr>
			<tr>
				<td>
					<a  class="btn btn-danger btn-sm btn-block" href="/sim-camp/">voltar</a>
				</td>
			</tr>
		</table>
		
		
	</div>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/lib/bower_components/angular/angular.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/modules/simuladorCampeonato.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/services/CampeonatoService.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/services/TimeService.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/services/PartidaService.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/controllers/PartidaController.js"></script>
</html>