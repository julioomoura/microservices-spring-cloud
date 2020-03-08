package br.com.alura.microservices.loja.loja.dto;

public class ItemDaCompraDTO {

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    private long id;
    private int quantidade;
}
