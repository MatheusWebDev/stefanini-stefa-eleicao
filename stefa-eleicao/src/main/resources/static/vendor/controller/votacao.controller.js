/**
 * Controller para add face group
 */
stefaEleicao.controller('adicionaVotacaoController', ['$scope', '$state', '$cookieStore', 'util', '$timeout', 'ngProgressFactory', 'Upload', '$http', 'adicionaVotacaoService',
    function($scope, $state, $cookieStore, util, $timeout, ngProgressFactory, Upload, $http, adicionaVotacaoService){

	$scope.visibleMessage = false;
	$scope.candidatoDTO = {};
	$scope.candidatos = {};
	$scope.partidoVotado = "";
	
	adicionaVotacaoService.getListaTodosCadidato(util.getUri()).success(function(d, s, h, c) {
		debugger;
		$scope.candidatos = d;
	}).error(function(d, s, h, c) {
		$scope.messages = "Erro não foi possível trazer dados.";
		$scope.visibleMessage = true;
		$scope.cssMessage = "message-table-incorret";
		
    });
	


	
	$scope.votar = function () {
		$scope.messages = "Aguarde que estamos processando...";
		$scope.visibleMessage = true;
		$scope.cssMessage = "message-table-correct";
		// enconta o candidato do partido votado
		$scope.candidatoDTO = $scope.candidatos.find(function(element, index, array){
			debugger;
			return String(element.numeroPartido) === $scope.partidoVotado;
		});

		adicionaVotacaoService.postVotarNoCandidato(util.getUri(), $scope.candidatoDTO).success(function(d, s, h, c) {
			debugger;
			$scope.messages = "Candidato " + $scope.candidatoDTO.nome + ' recebeu seu voto.';
			$scope.visibleMessage = true;
			$scope.cssMessage = "message-table-correct";
		}).error(function(d, s, h, c) {
 			$scope.messages = "Erro ao tentar votar no candidato.";
 			$scope.visibleMessage = true;
 			$scope.cssMessage = "message-table-incorret";
 	    });
	};
	
}]);