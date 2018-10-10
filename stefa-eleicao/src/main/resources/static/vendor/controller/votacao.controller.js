/**
 * Controller para add face group
 */
stefaEleicao.controller('adicionaVotacaoController', ['$scope', '$state', '$cookieStore', 'util', '$timeout', 'ngProgressFactory', 'Upload', '$http', 'adicionaVotacaoService',
    function($scope, $state, $cookieStore, util, $timeout, ngProgressFactory, Upload, $http, adicionaVotacaoService){

	$scope.visibleMessage = false;
	$scope.candidatoDTO = {};
	$scope.candidatos = {};
	
	adicionaVotacaoService.getListaTodosCadidato(util.getUri()).success(function(d, s, h, c) {
		$scope.candidatos = d;
	}).error(function(d, s, h, c) {
		$scope.messages = "Erro não foi possível trazer dados.";
		$scope.visibleMessage = true;
		$scope.cssMessage = "message-table-incorret";
    });
	
}]);