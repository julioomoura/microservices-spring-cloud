package br.com.alura.microservices.loja.loja.controller;

import br.com.alura.microservices.loja.loja.dto.CompraDTO;
import br.com.alura.microservices.loja.loja.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compra")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @PostMapping
    public void realizaCompra(@RequestBody CompraDTO compra) {
        compraService.realizaCompra(compra);
    }
}
