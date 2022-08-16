package io.github.wSilvaPereira.domain.repositorio;

import io.github.wSilvaPereira.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Clientes extends JpaRepository<Cliente, Integer> {

    List<Cliente> findByNomeLike(String nome);
    List<Cliente> findByNomeLikeOrderByNome(String nome);
    List<Cliente> findByNomeContains(String nome);
    List<Cliente> findByNomeOrId(String nome, Integer id);
    List<Cliente> findByNomeOrIdOrderById(String nome, Integer id);

    Cliente findOneByNome(String nome);

    boolean existsByNome(String nome);
}
