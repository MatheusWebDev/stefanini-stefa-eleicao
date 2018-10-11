package com.stefanini.stefaeleicao.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stefanini.stefaeleicao.bo.CandidatoBO;
import com.stefanini.stefaeleicao.bo.EleicaoBO;
import com.stefanini.stefaeleicao.dto.CandidatoDTO;

/**
 * Classe para receber os dados para votação
 * @author paulocotta
 *
 */

@RestController
@RequestMapping(value="/votacao")
public class VotacaoController {
	
	/**
	 * Método que adiciona votos do candidato
	 * @param candidatoDTO
	 * @return
	 */
	@RequestMapping(method=RequestMethod.POST, value="/votar", consumes=MediaType.APPLICATION_JSON_VALUE)
	public List<CandidatoDTO> adicionaVotosAoCandidato(@RequestBody CandidatoDTO candidatoDTO) {
		return EleicaoBO.getInstancia().computaVotoCandidato(candidatoDTO.getIdentificador());
	}
	
	/**
	 * Método que busca todos os candidatos
	 * @param identificador
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET, value="/resultado")
	public List<CandidatoDTO> buscaIdentificadorCandidato() {
		return CandidatoBO.getInstancia().listaCandidatoAll();
	}

}