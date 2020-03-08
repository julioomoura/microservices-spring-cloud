package br.com.alura.microservices.loja.loja.service;

import br.com.alura.microservices.loja.loja.dto.CompraDTO;
import br.com.alura.microservices.loja.loja.dto.InfoFornecedorDTO;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CompraService {
    public void realizaCompra(CompraDTO compra) {
        RestTemplate client = new RestTemplate();
        ResponseEntity<InfoFornecedorDTO> exchange = client.exchange("http://localhost:8081/info/" + compra.getEndereco().getEstado(),
                HttpMethod.GET, null, InfoFornecedorDTO.class);

        System.out.println(exchange.getBody().getEndereco());
    }
}
