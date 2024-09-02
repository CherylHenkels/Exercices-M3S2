package br.fullstack.education.sugestoes.controller.dto;

import br.fullstack.education.sugestoes.datasource.entity.SugestaoEntity;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.beans.BeanUtils;

import java.time.LocalDateTime;

@Data
@Builder
@Schema(description = "Sugestão - Objeto para criação")

public class SugestaoRequisicaoDto {

    @NotBlank
    @Schema(description = "Título da sugestão", example = "Entregas")
    private String titulo;

    @Schema(description = "Descrição da sugestão", example = "Adicionar mais opções de envio")
    private String descricao;

}
