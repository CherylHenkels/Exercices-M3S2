package br.fullstack.education.sugestoes.service;

import br.fullstack.education.sugestoes.controller.dto.SugestaoRequisicaoDto;
import br.fullstack.education.sugestoes.controller.dto.SugestaoRespostaDto;
import br.fullstack.education.sugestoes.datasource.entity.SugestaoEntity;
import br.fullstack.education.sugestoes.datasource.repository.SugestaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SugestaoServiceImpl implements SugestaoService{

    private final SugestaoRepository repository;

    @Override
    public SugestaoRespostaDto criar(SugestaoRequisicaoDto sugestaoRequisicaoDto) {
        SugestaoEntity sugestaoEntity = new SugestaoEntity(sugestaoRequisicaoDto);
        repository.save(sugestaoEntity);
        return new SugestaoRespostaDto(sugestaoEntity);
    }
}
