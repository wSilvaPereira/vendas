package io.github.wSilvaPereira.service;

import io.github.wSilvaPereira.domain.entity.Pedido;
import io.github.wSilvaPereira.domain.entity.enums.StatusPedido;
import io.github.wSilvaPereira.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar(PedidoDTO dto);
    Optional<Pedido> obterPedidoCompleto(Integer id);

    void atualizaStatus(Integer id, StatusPedido statusPedido);

}
