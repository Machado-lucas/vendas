package br.edu.ifsul.control;

//import br.edu.ifsul.dao.ClienteDAO;
//import br.edu.ifsul.dao.PedidoDAO;
//import br.edu.ifsul.dao.ProdutoDAO;
//import br.edu.ifsul.model.Cliente;
//import br.edu.ifsul.model.Item;
//import br.edu.ifsul.model.Pedido;
//import br.edu.ifsul.model.Produto;
//
//import java.text.NumberFormat;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class VendasController {
//
//    private static ProdutoDAO produtoDAO = new ProdutoDAO();
//    private static double totalPedido;
//
//    public static void main(String[] args) {
//        int opcao;
//        Scanner s = new Scanner(System.in);
//        ClienteDAO clienteDAO = new ClienteDAO();
//        Cliente cliente;
//        Produto produto;
//        List<Item> itens = new ArrayList<>();
//        do {
//            opcao = 0;
//            System.out.println("\n\n******** Vendas ********");
//            System.out.print("Digite o código do cliente: ");
//            long codigoCliente = s.nextLong();
//            cliente = clienteDAO.getClienteById(codigoCliente);
//            if(cliente == null){
//                System.out.println("Código inválido");
//                opcao = 1;
//            }else{
//                System.out.println("Cliente selecionado: " + cliente);
//                int sair = 0;
//                do{
//                    System.out.print("Digite o código do produto: ");
//                    long codigoProduto = s.nextLong();
//                    produto = produtoDAO.getProdutoById(codigoProduto);
//                    if(produto == null){
//                        System.out.println("Código inválido");
//                        sair = 1;
//                    }else{
//                        System.out.println("Produto selecionado:" + produto);
//                        System.out.print("Digite a quantidade: ");
//                        int quantidade = s.nextInt();
//                        if(quantidade > produto.getEstoque()){
//                            System.out.println("Quantidade inválida.");
//                            sair = 1;
//                        }else{
//                            Item item = new Item(produto);
//                            item.setQuantidade(quantidade);
//                            item.setSituacao(true);
//                            item.setTotalItem(quantidade * produto.getValor());
//                            itens.add(item);
//                            System.out.println("Produto adionado ao carrinho.");
//                            baixarEstoque(item); //baixa o estoque ao adicionar no carrinho
//                            System.out.print("\nDeseja vender outro produto (sim-1/não-0)? ");
//                            sair = s.nextInt();
//                        }
//                    }
//                }while(sair != 0);
//                if(!itens.isEmpty()){ //se tem itens no carrinho
//                    System.out.println("\n******* Seu carrinho *******");
//                    totalPedido = 0;
//                    itens.forEach( i -> { //firula para alinhar as colunas na impressão do carrinho
//                        String nome = i.getProduto().getNome();
//                        String precoUnitario = NumberFormat.getCurrencyInstance().format(i.getProduto().getValor());
//                        int MAX = 20;
//                        if(nome.length() <= MAX){
//                            for (int j = nome.length(); j < MAX; j++) {
//                                nome += " ";
//                            }
//                        }
//                        if(precoUnitario.length() <= MAX){
//                            for (int j = precoUnitario.length(); j < MAX-5; j++) {
//                                precoUnitario += " ";
//                            }
//                        } //fim da firula
//                        System.out.println(
//                                "\tProduto: " + nome +
//                                "\tValor unidade = " +  precoUnitario +
//                                "\t\tQuantidade = " + i.getQuantidade() +
//                                "\t\tTotalItem = " + (NumberFormat.getCurrencyInstance().format(i.getQuantidade()*i.getProduto().getValor()))
//                                );
//                        totalPedido += i.getQuantidade()*i.getProduto().getValor();
//                    });
//                    System.out.println("*************************************\n" + "TOTAL DO PEDIDO = " + NumberFormat.getCurrencyInstance().format(totalPedido));
//                    System.out.print("Fechar o pedido?(1-sim/0-não) ");
//                    opcao = s.nextInt();
//                    if(opcao == 1){
//                        //salva o pedido
//                        Pedido pedido = new Pedido(itens);
//                        /*
//                            Encher o objeto pedido aqui
//                         */
//                        new PedidoDAO().insert(pedido);
//                        System.out.println("Pedido salvo.");
//                    }else if(opcao == 0){
//                        System.out.print("Ops! Tem certeza? Você perderá esse pedido. (sim-0/não-1) ");
//                        opcao = s.nextInt();
//                        if(opcao == 0){
//                            System.out.println("Pedido cancelado.");
//                            //volta o estoque que foi baixado na venda
//                            itens.forEach((i) -> {
//                                voltarEstoque(i);
//                            });
//                        }
//                    }
//                }
//            }
//        } while (opcao != 0);
//    }
//
//    private static void baixarEstoque(Item item){
//        Produto produto = item.getProduto();
//        produto.setEstoque(produto.getEstoque() - item.getQuantidade());
//        produtoDAO.update(produto);
//    }
//
//    private static void voltarEstoque(Item item){
//        Produto produto = item.getProduto();
//        produto.setEstoque(produto.getEstoque() + item.getQuantidade());
//        produtoDAO.update(produto);
//    }
//}
