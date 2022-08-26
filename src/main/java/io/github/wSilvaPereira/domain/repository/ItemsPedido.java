package io.github.wSilvaPereira.domain.repository;

import io.github.wSilvaPereira.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsPedido extends JpaRepository<ItemPedido, Integer> {
}
