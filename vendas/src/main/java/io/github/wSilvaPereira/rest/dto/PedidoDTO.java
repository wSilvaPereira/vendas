package io.github.wSilvaPereira.rest.dto;

import io.github.wSilvaPereira.validation.NotEmptyList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PedidoDTO {

    @NotNull(message = "Informe o código do cliente")
    private Integer cliente;
    @NotNull(message = "Informe o total do pedido")
    private BigDecimal total;
    @NotEmptyList(message = "Pedido não pode ser realizado sem itens")
    private List<ItemPedidoDTO> items;

}
