package io.github.wSilvaPereira;

import io.github.wSilvaPereira.domain.entity.Cliente;
import io.github.wSilvaPereira.domain.repository.Clientes;
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
            clientes.save(new Cliente("William"));
            clientes.save(new Cliente("Outro cliente"));

            System.out.println("Listando clientes");
            List<Cliente> todosClientes = clientes.findAll();
            todosClientes.forEach(System.out::println);

            System.out.println("Atualizando clientes");
            todosClientes.forEach(cliente -> {
                cliente.setNome(cliente.getNome() + " atualizado");
                clientes.save(cliente);
            });

            System.out.println("Buscando clientes por nome");
            clientes.findByNomeLike("%i%").forEach(System.out::println);
//            clientes.findByNomeLikeOrderByNome("%i%").forEach(System.out::println);
//            clientes.findByNomeContains("i").forEach(System.out::println);

            System.out.println("Listando clientes");
            clientes.findAll().forEach(cliente -> {
                clientes.delete(cliente);
            });

            todosClientes = clientes.findAll();
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
