<!DOCTYPE html>
<html ng-app="SimuladorCampeonato">
<head>
	<title>
		Cadastrar novo time
	</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/app.css" />
		
	
</head>
<div class="jumbotron" >
	<div class="formCadastro" ng-controller="TimeController">
		<h3>Cadastrar novo time</h3>
		
		{{respostaResquest.message}}
		
		<form name="timeForm">
			<label class="form-control" for="campeonato">Campeonato: </label>
   			<select class="form-control" name="campeonato" id="campeonato" ng-model="idCampeonato" placeholder="Time Mandante">
     			<option ng-repeat="campeonato in campeonatos" value="{{campeonato.id}}">{{campeonato.nome}}</option>
    		</select><br/>
    		<label class="form-control">Nome time: </label>
			<input class="form-control" ng-model="time.nome" name="nome" type="text" placeholder="Nome do Time"/><br/>			
			<label class="form-control">Cidade time: </label>
			<input class="form-control" ng-model="time.cidade" name="cidade" type="text" placeholder="Nome da Cidade"/>	<br/>	
			<button class="btn btn-success btn-sm btn-block" ng-Click="CadastrarTime()">Cadastrar Time</button>	
			<a  class="btn btn-danger btn-sm btn-block" href="/sim-camp/">voltar</a>
		</form>
	</div>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/lib/bower_components/angular/angular.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/modules/simuladorCampeonato.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/services/CampeonatoService.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/services/TimeService.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/controllers/TimeController.js"></script>

</html>