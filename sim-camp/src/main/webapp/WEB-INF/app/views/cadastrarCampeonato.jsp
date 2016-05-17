<!DOCTYPE html>
<html ng-app="SimuladorCampeonato">
<head>
	<title>
		Cadastrar Campeonato
	</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/app.css" />
		
	
</head>
<div class="jumbotron" >
	<div class="formCadastro" ng-controller="PartidaController">
		<h3>Cadastrar nova Partida</h3>
		
		{{respostaResquest.message}}
		
		<form name="CampeonatoForm">
				
			<a  class="btn btn-danger btn-sm btn-block" href="/sim-camp/">voltar</a>
		</form>
	</div>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/lib/bower_components/angular/angular.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/modules/simuladorCampeonato.js"></script>
</html>