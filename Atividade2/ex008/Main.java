package ex008;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		 * Inventario manager = new Inventario(); Scanner scanner = new
		 * Scanner(System.in); while (true) { System.out.
		 * println("Choose an option: 1) Novo Produto 2) Remover Produto 3) Buscar Producto 4) Sair"
		 * ); int choice = scanner.nextInt(); scanner.nextLine();
		 * 
		 * 
		 * switch (choice) { case 1: System.out.print("Nome: "); String name =
		 * scanner.nextLine(); System.out.print("Preço: "); double price =
		 * scanner.nextDouble(); System.out.print("Quantidade:  "); int quantity =
		 * scanner.nextInt(); manager.adicionarProduto(name, price, quantity); break;
		 * case 2: System.out.print("Nome do produto para remover: "); String removeName
		 * = scanner.nextLine(); manager.removerProduto(removeName); break; case 3:
		 * System.out.print("Pesquisar nome do produto: "); String searchName =
		 * scanner.nextLine(); manager.buscarProduto(searchName); break; case 4:
		 * System.out.println("Saindo..."); scanner.close(); return; default:
		 * System.out.println("Escolha uma opção válida"); }
		 * 
		 * 
		 * 
		 */

		GerenciadorDeContatos gerenciador = new GerenciadorDeContatos();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Escolha uma opção: 1) Adicionar Contato 2) Buscar Contato 3) Listar Contatos 4) Sair");
			int opcao = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcao) {
			case 1:
				System.out.print("Digite o nome: ");
				String nome = scanner.nextLine();
				System.out.print("Digite o telefone: ");
				String telefone = scanner.nextLine();
				gerenciador.adicionarContato(nome, telefone);
				break;
			case 2:
				System.out.print("Digite o nome para buscar: ");
				String nomeBusca = scanner.nextLine();
				gerenciador.buscarContato(nomeBusca);
				break;
			case 3:
				gerenciador.listarContatos();
				break;
			case 4:
				System.out.println("Saindo...");
				scanner.close();
				return;
			default:
				System.out.println("Opção inválida. Por favor, escolha novamente.");
			}
		}
	}
}
