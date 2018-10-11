package com.stefanini.stefaeleicao.banco.memoria;

import java.util.ArrayList;
import java.util.List;

import com.stefanini.stefaeleicao.dto.CandidatoDTO;

/**
 * 
 * @author paulocotta
 *
 */

public class BancoMemoriaCandidato {

	private static List<CandidatoDTO> candidatoDTOs = new ArrayList<CandidatoDTO>();
	
	/**
	 * Método que gera instância da classe BancoMemoriaCandidato
	 * @return
	 */
	public static BancoMemoriaCandidato getInstancia(){
		return new BancoMemoriaCandidato();
	}
	
	/**
	 * Método que insere candidatos
	 * @param candidatoDTO
	 * @return
	 */
	public List<CandidatoDTO> insereCandidato(CandidatoDTO candidatoDTO){
		candidatoDTOs.add(candidatoDTO);
		return candidatoDTOs;
	}
	
	/**
	 * Método candidato ALL
	 * @return
	 */
	public List<CandidatoDTO> listaCandidato(){
		return candidatoDTOs;
	}
	
	/**
	 * Método que busca um candidato por identificador
	 * @param identificador
	 * @return
	 */
	public CandidatoDTO buscaCandidatoPorIdentificador(String identificador){
		if(candidatoDTOs.size() > 0){
			for(CandidatoDTO candidatoDTO : candidatoDTOs){
				if(candidatoDTO.getIdentificador().equals(identificador)){
					return candidatoDTO;
				}
			}
		}else{
			return new CandidatoDTO();
		}
		
		return new CandidatoDTO();
	}
	
	/**
	 * Método que atualiza um candidato com votos computados
	 * @param identificador
	 * @return
	 */
	public List<CandidatoDTO> atualizaCandidatosVotos(CandidatoDTO candidatoComNovosVotos){
		if(candidatoDTOs.size() > 0){
			for(int i = 0; i < candidatoDTOs.size(); i++){
				if(candidatoDTOs.get(i).getIdentificador().equals(candidatoComNovosVotos.getIdentificador())){
					candidatoDTOs.set(i, candidatoComNovosVotos);
					return candidatoDTOs;
				}
			}
		}else{
			return candidatoDTOs;
		}
		
		return candidatoDTOs;
	}
	
}