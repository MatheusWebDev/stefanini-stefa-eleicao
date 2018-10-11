package com.stefanini.stefaeleicao.bo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.stefanini.stefaeleicao.banco.memoria.BancoMemoriaCandidato;
import com.stefanini.stefaeleicao.dto.CandidatoDTO;

/**
 * 
 * @author paulocotta
 *
 */

public class CandidatoBO {
	
	private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");

	/**
	 * Método que gera a instância
	 * @return
	 */
	public static CandidatoBO getInstancia(){
		return new CandidatoBO();
	}
	
	/**
	 * Método que insere candidato
	 * @param candidatoDTO
	 * @return
	 */
	public List<CandidatoDTO> insereCandidato(CandidatoDTO candidatoDTO){
		candidatoDTO.setIdentificador(simpleDateFormat.format(new Date()));
		return BancoMemoriaCandidato.getInstancia().insereCandidato(candidatoDTO);
	}
	
	/**
	 * Método que busca candidato por identificador
	 * @param identificador
	 * @return
	 */
	public CandidatoDTO buscaPorIdentificador(String identificador){
		return BancoMemoriaCandidato.getInstancia().buscaCandidatoPorIdentificador(identificador);
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
	
	/**
	 * Método candidato ALL
	 * @return
	 */
	public List<CandidatoDTO> listaCandidatoAll(){
		return BancoMemoriaCandidato.getInstancia().listaCandidato();
	}
	
}