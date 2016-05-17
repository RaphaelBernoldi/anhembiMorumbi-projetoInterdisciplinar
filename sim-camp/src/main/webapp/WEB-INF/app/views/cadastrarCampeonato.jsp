<!DOCTYPE html>
<html ng-app="SimuladorCampeonato">
<head>
	<title>
		Cadastrar Campeonato
	</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/app.css" />
		
	
</head>
<div class="jumbotron" >
	<div class="formCadastro" ng-controller="CampeonatoController">
		<h3>Cadastrar novo Campeonato</h3>
		
		{{respostaResquest.message}}
		
		<form name="CampeonatoForm">
			<input class="form-control" ng-model="campeonato.nome" type="text" placeholder="Nome Campeontato"/>
			<button class="btn btn-success btn-sm btn-block" ng-Click="cadastrarCampeonato()">Cadastrar Campeonato</button>
			<a  class="btn btn-danger btn-sm btn-block" href="/sim-camp/">voltar</a>
		</form>
	</div>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/lib/bower_components/angular/angular.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/modules/simuladorCampeonato.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/services/CampeonatoService.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/controllers/CampeonatoController.js"></script>
</html>