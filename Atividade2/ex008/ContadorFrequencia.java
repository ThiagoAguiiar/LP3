package ex008;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContadorFrequencia {
	public static void contar() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o texto:");
		String texto = scanner.nextLine();

		texto = texto.replaceAll("[^a-zA-Z0-9\\s]", "").toLowerCase();

		String[] palavras = texto.split("\\s+");

		Map<String, Integer> frequenciaDePalavras = new HashMap<>();

		for (String palavra : palavras) {
			frequenciaDePalavras.put(palavra, frequenciaDePalavras.getOrDefault(palavra, 0) + 1);
		}

		for (Map.Entry<String, Integer> entrada : frequenciaDePalavras.entrySet()) {
			System.out.println(entrada.getKey() + ": " + entrada.getValue());
		}

		scanner.close();
	}
}
