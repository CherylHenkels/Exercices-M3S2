package br.fullstack.education.sugestoes.datasource.repository;

import br.fullstack.education.sugestoes.datasource.entity.SugestaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SugestaoRepository extends JpaRepository<SugestaoEntity, Long> {
}
