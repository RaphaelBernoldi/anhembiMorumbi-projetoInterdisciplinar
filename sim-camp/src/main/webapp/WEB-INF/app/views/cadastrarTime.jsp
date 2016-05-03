<!DOCTYPE html>
<html ng-app="SimuladorCampeonato">
<head>
	<title>
		Cadastrar novo time
	</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/app.css" />
		
	
</head>
<div class="jumbotron" >
	<div class="formCadastro" ng-controller="cadastrarTimeCtrl">
		<h3>Cadastrar novo time</h3>
		<form name="timeForm">
			<input class="form-control" ng-model="time.nome" name="nome" type="text" placeholder="Nome do Time"/>			
			<input class="form-control" ng-model="time.cidade" name="cidade" type="text" placeholder="Nome da Cidade"/>		
			<button class="btn btn-success btn-sm btn-block" ng-Click="CadastrarTime(time)">Cadastrar Time</button>	
			<a  class="btn btn-danger btn-sm btn-block" href="#/partidas">voltar</a>	
		</form>
	</div>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/lib/bower_components/angular/angular.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/modules/simuladorCampeonato.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/controllers/cadastrarTimeCtrl.js"></script>

</html>