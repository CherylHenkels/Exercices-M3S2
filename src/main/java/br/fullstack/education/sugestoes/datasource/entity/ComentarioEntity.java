
package br.fullstack.education.sugestoes.datasource.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity

@Table(name = "comentario")

public class ComentarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "sugestaoId", nullable = false)
    private SugestaoEntity sugestao;

    @Column(nullable = false, length = 200)
    private String texto;

    @Column(nullable = false)
    private LocalDateTime dataEnvio = LocalDateTime.now();





}
