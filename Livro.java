package estruturadedados;

import java.util.Scanner;
import java.util.Stack;


public class Livro {

	public static void main(String[] args) {		
		
	        Stack<String> pilhaLivros = new Stack<>();
	        Scanner leia = new Scanner(System.in);

	        int opcao;
	        do {
	            System.out.print("\nDigite uma opção (0 para sair, 1 para adicionar, 2 para listar, 3 para retirar): ");
	            opcao = leia.nextInt();
	            leia.nextLine();  

	            switch (opcao) {
	                case 1:
	                    System.out.print("Digite o nome do Livro: ");
	                    String nomeLivro = leia.nextLine();
	                    pilhaLivros.push(nomeLivro);
	                    System.out.println("\nPilha: \n" + pilhaLivros + "\nLivro adicionado!");
	                    break;
	                case 2:
	                    System.out.println("\nLista de Livros na Pilha: \n" + pilhaLivros);
	                    break;
	                case 3:
	                    if (!pilhaLivros.isEmpty()) {
	                        String livroRetirado = pilhaLivros.pop();
	                        System.out.println("\nPilha: \n" + pilhaLivros + "\nUm Livro foi retirado da pilha!");
	                    } else {
	                        System.out.println("\nA Pilha está vazia!");
	                    }
	                    break;
	                case 0:
	                    System.out.println("\nPrograma Finalizado!");
	                    break;
	                default:
	                    System.out.println("\nOpção inválida. Tente novamente.");
	            }

	        } while (opcao != 0);

	     
	    
	

	}

}
