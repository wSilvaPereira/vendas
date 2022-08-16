package io.github.wSilvaPereira;

import io.github.wSilvaPereira.domain.entity.Cliente;
import io.github.wSilvaPereira.domain.repositorio.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class VendasApplication {

    @Bean
    public CommandLineRunner init(@Autowired Clientes clientes) {
        return args -> {
            System.out.println("Salvando clientes");
            clientes.salvar(new Cliente("William"));
            clientes.salvar(new Cliente("Outro cliente"));

            System.out.println("Listando clientes");
            List<Cliente> todosClientes = clientes.obterTodos();
            todosClientes.forEach(System.out::println);

            System.out.println("Atualizando clientes");
            todosClientes.forEach(cliente -> {
                cliente.setNome(cliente.getNome() + " atualizado");
                clientes.atualizar(cliente);
            });

            System.out.println("Buscanco clientes por nome");
            clientes.buscarPorNome("i").forEach(System.out::println);

            System.out.println("Listando clientes");
            clientes.obterTodos().forEach(cliente -> {
                clientes.deletar(cliente);
            });

            todosClientes = clientes.obterTodos();
            if (todosClientes.isEmpty()) {
                System.out.println("Nenhum cliente encontrado");
            } else {
                System.out.println("Listando clientes");
                todosClientes.forEach(System.out::println);
            };
        };

    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
