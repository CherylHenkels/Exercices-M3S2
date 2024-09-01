
package br.fullstack.education.sugestoes.datasource.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity

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
    private LocalDateTime dataAtualizacao;




}
