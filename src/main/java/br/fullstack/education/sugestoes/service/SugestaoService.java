package br.fullstack.education.sugestoes.service;

import br.fullstack.education.sugestoes.controller.dto.SugestaoRequisicaoDto;
import br.fullstack.education.sugestoes.controller.dto.SugestaoRespostaDto;
import br.fullstack.education.sugestoes.datasource.entity.SugestaoEntity;

public interface SugestaoService {
    SugestaoRespostaDto criar(SugestaoRequisicaoDto sugestaoRequisicaoDto);
}
