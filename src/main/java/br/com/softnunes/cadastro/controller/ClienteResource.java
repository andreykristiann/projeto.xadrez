package br.com.softnunes.cadastro.controller;

import br.com.softnunes.cadastro.entity.Cliente;
import br.com.softnunes.cadastro.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cadastro-cliente")
public class ClienteResource {

    @Autowired
    ClienteService clienteService;

    @PostMapping(value = "/salvar")
    public void salvarCliente(@RequestBody Cliente cliente) {
        clienteService.salvar(cliente);

    }




}
