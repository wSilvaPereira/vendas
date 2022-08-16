package io.github.wSilvaPereira.domain.repository;

import io.github.wSilvaPereira.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto, Integer> {
}
