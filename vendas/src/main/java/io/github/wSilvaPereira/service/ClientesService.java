package io.github.wSilvaPereira.service;

import io.github.wSilvaPereira.repository.ClientesRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    private ClientesRepository repository;

    public ClientesService(ClientesRepository Repository) {
        this.repository = Repository;
    }

    public void salvarCliente(Object cliente){
        validarCliente(cliente);
        repository.persistir(cliente);
    }

    public void validarCliente(Object cliente){
        //Aplica validações

    }

}
