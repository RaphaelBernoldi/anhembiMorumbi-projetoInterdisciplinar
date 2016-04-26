<div class="jumbotron" >
	<div class="formCadastro">
		<h3>Cadastrar nova Partida</h3>
		<form name="PartidaForm">
			<input class="form-control" ng-model="partida.timeMandante" type="text" placeholder="Time Mandante"/>
			<input class="form-control" ng-model="partida.timeVisitante" type="text" placeholder="Time Visitante"/>
			<input class="form-control" ng-model="partida.golsMandante" type="text" placeholder="Gol(s) Mandante"/>
			<input class="form-control" ng-model="partida.golsVisitante" type="text" placeholder="Gol(s) visitante"/>
			<button class="btn btn-success btn-sm btn-block" ng-Click="CadastrarPartida(partida)">Cadastrar Partida</button>	
			<a  class="btn btn-danger btn-sm btn-block" href="#/partidas">voltar</a>
			
		</form>
	</div>
</div>