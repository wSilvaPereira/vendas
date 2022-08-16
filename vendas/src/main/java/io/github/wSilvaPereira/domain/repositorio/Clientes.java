package io.github.wSilvaPereira.domain.repositorio;

import io.github.wSilvaPereira.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Clientes extends JpaRepository<Cliente, Integer> {
    List<Cliente> findByNomeLike(String nome);
}
