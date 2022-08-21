package io.github.wSilvaPereira.rest.controller;

import io.github.wSilvaPereira.domain.entity.Pedido;
import io.github.wSilvaPereira.rest.dto.PedidoDTO;
import io.github.wSilvaPereira.service.PedidoService;
import static org.springframework.http.HttpStatus.*;

import net.bytebuddy.asm.Advice;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    private PedidoService service;

    public PedidoController(PedidoService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public Integer save(@RequestBody PedidoDTO dto){
        Pedido pedido = service.salvar(dto);
        return pedido.getId();
    }

}
