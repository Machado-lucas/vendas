package br.edu.ifsul.control;

import java.util.Scanner;

public class PedidoController {
    public static void main(String[] args) {
        int opcao = 0;
        do{
            System.out.println("\n\n******** Pedidos ********");
            System.out.print(
                    "1. Check-out do pedido" +
                            "\n2. Enviar Pedido" +
                            "\n3. Excluir Pedido" +
                            "\n4. Lista todos os pedidos (inativos)" +
                            "\n5. Lista todos os pedidos (ativos)" +
                            "\n6. Lista todos os pedidos por período" +
                            "\n7. Listar todos os pedidos por cliente" +
                            "\nDigite a opção (0 para sair): "
            );
            Scanner s = new Scanner(System.in);
            opcao = s.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("em desenvolvimento " + opcao);
                    break;
                case 2:
                    System.out.println("em desenvolvimento " + opcao);
                    break;
                case 3:
                    System.out.println("em desenvolvimento " + opcao);
                    break;
                case 4:
                    System.out.println("em desenvolvimento " + opcao);
                    break;
                case 5:
                    System.out.println("em desenvolvimento " + opcao);
                    break;
                case 6:
                    System.out.println("em desenvolvimento " + opcao);
                    break;
                case 7:
                    System.out.println("em desenvolvimento " + opcao);
                    break;
                default:
                    if(opcao != 0) System.out.println("Opção inválida.");
            }
        }while (opcao != 0);
    }
}
