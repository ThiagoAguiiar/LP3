package exercicio001;

import java.util.ArrayList;
import java.util.List;

public class Exercicio001 {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<Integer>();
		
		for (int i = 0; i < 5; i++) {
			numeros.add(i);
		}
		
		for(int valores: numeros) {
			System.out.println(valores);
		}
	}

}
