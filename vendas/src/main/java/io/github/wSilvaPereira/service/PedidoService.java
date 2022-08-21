package io.github.wSilvaPereira.service;

import io.github.wSilvaPereira.domain.entity.Pedido;
import io.github.wSilvaPereira.rest.dto.PedidoDTO;

public interface PedidoService {

    Pedido salvar(PedidoDTO dto);

}
