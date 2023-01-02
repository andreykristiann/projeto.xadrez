package br.com.softnunes.cadastro.service;

import br.com.softnunes.cadastro.entity.Cliente;
import br.com.softnunes.cadastro.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;
    public void salvar(Cliente cliente){

    }

}
