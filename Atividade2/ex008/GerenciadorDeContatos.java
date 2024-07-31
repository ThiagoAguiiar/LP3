package ex008;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorDeContatos {
	private HashMap<String, String> contatos;

	public GerenciadorDeContatos() {
		this.contatos = new HashMap<>();
	}

	public void adicionarContato(String nome, String telefone) {
		contatos.put(nome, telefone);
		System.out.println("Contato adicionado: " + nome + " - " + telefone);
	}

	public void buscarContato(String nome) {
		if (contatos.containsKey(nome)) {
			String telefone = contatos.get(nome);
			System.out.println("Contato encontrado: " + nome + " - " + telefone);
		} else {
			System.out.println("Contato não encontrado.");
		}
	}

	public void listarContatos() {
		if (contatos.isEmpty()) {
			System.out.println("Nenhum contato encontrado.");
		} else {
			for (Map.Entry<String, String> entrada : contatos.entrySet()) {
				System.out.println(entrada.getKey() + " - " + entrada.getValue());
			}
		}
	}
}