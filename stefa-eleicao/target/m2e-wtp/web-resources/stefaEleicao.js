/**
 * Created by Paulo on 28/08/2018.
 */
var stefaEleicao = angular.module('stefaEleicao',['ui.bootstrap', 'ngResource', 'ngRoute', 'ngCookies', 'ui.router', 'angularModalService',
	'ngAnimate', 'ngProgress', 'ngFileUpload']);

stefaEleicao.config(['$stateProvider', '$urlRouterProvider', '$routeProvider', function($stateProvider, $urlRouterProvider, $routeProvider) {
	 
	$stateProvider.state('/', {
	   url: '/',
	   templateUrl : 'pages/candidato/adiciona-candidato.html',
	   controller : 'adicionaCandidatoController',
	});
	
	$stateProvider.state('/votacao', {
		   url: '/votacao',
		   templateUrl : 'pages/votacao/votacao.html',
		   controller : 'adicionaVotacaoController',
	});
	
	$stateProvider.state('/votacao/resultado', {
		   url: '/votacao/resultado',
		   templateUrl : 'pages/votacao/resultado.html',
		   controller : 'adicionaVotacaoController',
	});
	
   $urlRouterProvider.otherwise('/');
}]);