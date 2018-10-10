package com.stefanini.stefaeleicao.banco.memoria;

import com.stefanini.stefaeleicao.dto.CadidatoVotacaoDTO;

/**
 * Classe de banco de memoria votação
 * @author paulocotta
 *
 */
public class BancoMemoriaVotacao {
	
	private static CadidatoVotacaoDTO votacaoDTOs = new CadidatoVotacaoDTO();

	/**
	 * Instância da classe
	 * @return
	 */
	public static BancoMemoriaVotacao getInstancia(){
		return new BancoMemoriaVotacao();
	}
	
	/**
	 * Método que insere CadidatoVotacao
	 * @param candidatoDTO
	 * @return
	 */
	public CadidatoVotacaoDTO insereCadidatoVotacao(CadidatoVotacaoDTO cadidatoVotacaoDTO){
		votacaoDTOs = cadidatoVotacaoDTO;
		return votacaoDTOs;
	}
	
	
}