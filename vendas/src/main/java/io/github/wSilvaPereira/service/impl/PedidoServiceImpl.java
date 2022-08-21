package io.github.wSilvaPereira.service.impl;

import io.github.wSilvaPereira.domain.repository.Pedidos;
import io.github.wSilvaPereira.service.PedidoService;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService {

    private Pedidos repository;

    public PedidoServiceImpl(Pedidos repository) {
        this.repository = repository;
    }
}
