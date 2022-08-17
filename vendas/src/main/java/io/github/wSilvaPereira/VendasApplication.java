package io.github.wSilvaPereira;

import io.github.wSilvaPereira.domain.entity.Cliente;
import io.github.wSilvaPereira.domain.entity.Pedido;
import io.github.wSilvaPereira.domain.repository.Clientes;
import io.github.wSilvaPereira.domain.repository.Pedidos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class VendasApplication {

    @Bean
    public CommandLineRunner init(@Autowired Clientes clientes,
                                  @Autowired Pedidos pedidos) {
        return args -> {
            System.out.println("Salvando clientes");
            Cliente fulano = new Cliente("William");
            clientes.save(fulano);

            Pedido pedido = new Pedido();
            pedido.setCliente(fulano);
            pedido.setDataPedido(LocalDate.now());
            pedido.setTotal(BigDecimal.valueOf(100));
            pedidos.save(pedido);

            pedidos.findByCliente(fulano).forEach(System.out::println);

//            pedido = new Pedido();
//            pedido.setCliente(fulano);
//            pedido.setDataPedido(LocalDate.now());
//            pedido.setTotal(BigDecimal.valueOf(200));
//            pedidos.save(pedido);

//            Cliente cliente = clientes.findClienteFetchPedidos(fulano.getId());
//            System.out.println(cliente);
//            System.out.println(cliente.getPedidos());

//            System.out.println("Listando clientes");
//            List<Cliente> todosClientes = clientes.findAll();
//            todosClientes.forEach(System.out::println);
//
//            System.out.println("Atualizando clientes");
//            todosClientes.forEach(cliente -> {
//                cliente.setNome(cliente.getNome() + " atualizado");
//                clientes.save(cliente);
//            });
//
//            System.out.println("Buscando clientes por nome");
//            clientes.findByNomeLike("%i%").forEach(System.out::println);
////            clientes.findByNomeLikeOrderByNome("%i%").forEach(System.out::println);
////            clientes.findByNomeContains("i").forEach(System.out::println);
//
//            System.out.println("Listando clientes");
//            clientes.findAll().forEach(cliente -> {
//                clientes.delete(cliente);
//            });
//
//            todosClientes = clientes.findAll();
//            if (todosClientes.isEmpty()) {
//                System.out.println("Nenhum cliente encontrado");
//            } else {
//                System.out.println("Listando clientes");
//                todosClientes.forEach(System.out::println);
//            };
        };

    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
