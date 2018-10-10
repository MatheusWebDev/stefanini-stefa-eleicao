/**
 * Create service 28/08/2018
 */
stefaEleicao.service('adicionaVotacaoService', ['$http', 
                                function($http){
	
	this.postCadastraVotos = function(uri, candidatoDTO){
		return $http.post(uri + '/votacao/votar', candidatoDTO);
	};
	
	this.getListaTodosCadidato = function(uri){
		return $http.get(uri + '/votacao/resultados');
	};
	
}]);