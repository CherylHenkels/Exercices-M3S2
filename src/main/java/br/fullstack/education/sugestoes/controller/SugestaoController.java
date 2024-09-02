package br.fullstack.education.sugestoes.controller;

import br.fullstack.education.sugestoes.controller.dto.SugestaoRequisicaoDto;
import br.fullstack.education.sugestoes.controller.dto.SugestaoRespostaDto;
import br.fullstack.education.sugestoes.service.SugestaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("sugestoes")
public class SugestaoController {

    private final SugestaoService sugestaoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public SugestaoRespostaDto post(@RequestBody SugestaoRequisicaoDto sugestaoRequisicaoDto) {
        return sugestaoService.criar(sugestaoRequisicaoDto);
    }
}
