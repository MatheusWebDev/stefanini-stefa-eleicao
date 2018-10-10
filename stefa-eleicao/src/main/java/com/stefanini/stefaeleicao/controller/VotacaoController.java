package com.stefanini.stefaeleicao.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.stefanini.stefaeleicao.bo.CandidatoBO;
import com.stefanini.stefaeleicao.bo.EleicaoBO;
import com.stefanini.stefaeleicao.dto.CadidatoVotacaoDTO;
import com.stefanini.stefaeleicao.dto.CandidatoDTO;
import com.stefanini.stefaeleicao.dto.VotacaoDTO;

/**
 * Classe para receber os dados para votação
 * @author paulocotta
 *
 */

@RestController
@RequestMapping(value="/votacao")
public class VotacaoController {
	
	/**
	 * Método que adiciona candidato
	 * @param candidatoDTO
	 * @return
	 */
	@RequestMapping(method=RequestMethod.POST, value="/votar", consumes=MediaType.APPLICATION_JSON_VALUE)
	public CadidatoVotacaoDTO adicionaVotacao(@RequestBody VotacaoDTO votacaoDTO) {
		return EleicaoBO.getInstancia().inserirVotacao(votacaoDTO);
	}
	
	/**
	 * Método que busca candidato por identificador
	 * @param identificador
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET, value="/busca-candidato")
	public CandidatoDTO buscaIdentificadorCandidato(@RequestParam(name="identificador") String identificador) {
		return CandidatoBO.getInstancia().buscaPorIdentificador(identificador);
	}
	
	
	/**
	 * Método que busca todos os candidatos
	 * @param identificador
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET, value="/resultados")
	public List<CandidatoDTO> buscaIdentificadorCandidato() {
		return CandidatoBO.getInstancia().listaCandidatoAll();
	}
}