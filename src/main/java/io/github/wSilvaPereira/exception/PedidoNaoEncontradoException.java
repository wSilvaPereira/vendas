package io.github.wSilvaPereira.exception;

public class PedidoNaoEncontradoException extends RuntimeException {
    public PedidoNaoEncontradoException(){
        super("Pedido não encontrado.");
    }
}
