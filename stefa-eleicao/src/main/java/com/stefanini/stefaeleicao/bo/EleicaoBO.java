package com.stefanini.stefaeleicao.bo;

import java.util.List;

import com.stefanini.stefaeleicao.banco.memoria.BancoMemoriaCandidato;
import com.stefanini.stefaeleicao.dto.CandidatoDTO;

/**
 * Classe de BO para votação
 * @author paulocotta
 *
 */

public class EleicaoBO extends CandidatoBO {

	/**
	 * Instância da classe EleicaoBO
	 * @return
	 */
	public static EleicaoBO getInstancia(){
		return new EleicaoBO();
	}
	
	/**
	 * Método que adiciona os votos no candidato identificado
	 * @param identificador
	 * @return
	 */
	public List<CandidatoDTO> computaVotoCandidato(String identificador){
		CandidatoDTO candidato = buscaPorIdentificador(identificador);
		candidato.setQuantidadeVotos(candidato.getQuantidadeVotos()+1);
		return BancoMemoriaCandidato.getInstancia().atualizaCandidatosVotos(candidato);
	}	
	
}