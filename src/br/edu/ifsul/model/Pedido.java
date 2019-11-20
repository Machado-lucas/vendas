package br.edu.ifsul.model;

import java.util.List;

public class Pedido {
    private int id;
    private String estado;
    private Cliente cliente;//expressa a ligação entre as classes Pedido  com Cliente
    private List<Item> itens; //expressa a ligação entre as classes Pedido  com Cliente


    public Pedido(int id, String estado, Cliente cliente, List<Item> itens) {
        this.id = id;
        this.estado = estado;
        this.cliente = cliente;
        this.itens = itens;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "\nPedido{" +
                "id=" + id +
                ", estado='" + estado + '\'' +
                ", cliente=" + cliente +
                ", itens=" + itens +
                '}';
    }
}
