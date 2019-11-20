package br.edu.ifsul.control;

import br.edu.ifsul.model.Cliente;
import br.edu.ifsul.model.Item;
import br.edu.ifsul.model.Pedido;
import br.edu.ifsul.model.Produto;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

	private static double totalPedido;

    public static void main(String[] args) {
        //equivalente a buscar o cliente na base de dados
	    Cliente cliente = new Cliente(1L, "Ana", "Tera", true);
        //equivalente a buscar o produto na base de dados
	    Produto produto = new Produto(1, "Arroz 5kg", 10.00);

	    //equivalente a colocar o produto no carrinho
	    Item item = new Item(1, 1, produto);
		produto = new Produto(45, "Feijão 1kg", 10.00); //busca outro produto na base dados
	    Item item2 = new Item(2, 1, produto);
	    List<Item> itens = new ArrayList<>(); //esse é o carrinho
	    itens.add(item);
	    itens.add(item2);

	    //equivalente a fechar o pedido
		totalPedido = 0;
	    Pedido pedido = new Pedido(1, "aberto", cliente, itens);
		totalizarPedido(itens);
        System.out.println("\n\nPedido confirmado: "  + pedido
				+ "\nTOTAL = " + NumberFormat.getCurrencyInstance().format(totalPedido));
    }

    private static void totalizarPedido(List<Item> itens){
    	itens.forEach((i) -> {
    		totalPedido += i.getQuantidade() * i.getProduto(). getValor();
		});
	}
}
