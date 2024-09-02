
package br.fullstack.education.sugestoes.datasource.entity;

import br.fullstack.education.sugestoes.controller.dto.SugestaoRequisicaoDto;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@Table(name = "sugestao")

public class SugestaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(length = 200)
    private String descricao;

    @Column(nullable = false)
    private LocalDateTime dataEnvio = LocalDateTime.now();

    @Column(nullable = false)
    private LocalDateTime dataAtualizacao = LocalDateTime.now();


    public SugestaoEntity(SugestaoRequisicaoDto sugestaoRequisicaoDto) {
        BeanUtils.copyProperties(sugestaoRequisicaoDto, this);
    }
}
