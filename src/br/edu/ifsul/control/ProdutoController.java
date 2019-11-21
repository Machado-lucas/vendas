package br.edu.ifsul.control;

import java.util.Scanner;

public class ProdutoController {

    public static void main(String[] args) {
        int opcao = 0;
        do{
            System.out.println("\n\n******** Produto ********");
            System.out.print(
                    "1. Inserir" +
                    "\n2. Alterar" +
                    "\n3. Excluir (tornar inativo)" +
                    "\n4. Lista todos os produtos (ativos e inativos)" +
                    "\n5. Lista todos os produtos (ativos)" +
                    "\n6. Listar produtos pelo nome" +
                    "\n7. Listar produto pelo código" +
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
