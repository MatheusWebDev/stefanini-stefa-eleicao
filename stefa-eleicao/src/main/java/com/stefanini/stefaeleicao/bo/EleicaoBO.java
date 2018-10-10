package com.stefanini.stefaeleicao.bo;

import com.stefanini.stefaeleicao.banco.memoria.BancoMemoriaVotacao;
import com.stefanini.stefaeleicao.dto.CadidatoVotacaoDTO;
import com.stefanini.stefaeleicao.dto.VotacaoDTO;

/**
 * Classe de BO para votação
 * @author paulocotta
 *
 */

public class EleicaoBO {

	/**
	 * Instância da classe EleicaoBO
	 * @return
	 */
	public static EleicaoBO getInstancia(){
		return new EleicaoBO();
	}
	
	/**
	 * Método que insere CadidatoVotacao
	 * @param candidatoDTO
	 * @return
	 */

	public CadidatoVotacaoDTO inserirVotacao(VotacaoDTO votacaoDTO) {
		CadidatoVotacaoDTO votacaoDTOs = new CadidatoVotacaoDTO();
		votacaoDTOs.addVotacao(votacaoDTO);
		return BancoMemoriaVotacao.getInstancia().insereCadidatoVotacao(votacaoDTOs);
	}
	
}