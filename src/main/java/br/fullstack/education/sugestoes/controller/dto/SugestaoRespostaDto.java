package br.fullstack.education.sugestoes.controller.dto;

import br.fullstack.education.sugestoes.datasource.entity.SugestaoEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.time.LocalDateTime;

@Data
@Schema(description = "Sugestão - Objeto de resposta")

public class SugestaoRespostaDto {

    @NotBlank
    @Schema(description = "Título da sugestão", example = "Entregas")
    private String titulo;

    @Schema(description = "Descrição da sugestão", example = "Melhor empresa do mundo")
    private String descricao;

    @Schema(description = "Data que a sugestão foi criada")
    private LocalDateTime dataEnvio;

    @Schema(description = "Data que a sugestão foi alterada")
    private LocalDateTime dataAtualizacao;

    public SugestaoRespostaDto (SugestaoEntity sugestaoEntity){
        BeanUtils.copyProperties(sugestaoEntity, this);
    }
}
