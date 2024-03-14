package exercicio002;

import java.util.ArrayList;
import java.util.List;

public class Exercicio002 {

	public static void main(String[] args) {
		List<String> listaString = new ArrayList<String>();
		
		listaString.add("A");
		listaString.add("B");
		listaString.add("C");
		listaString.add("D");
		listaString.add("E");
		
		for(String valores: listaString) {
			System.out.println(valores);
		}
		
		listaString.remove(0);
		
		System.out.println("\nLista com valores removiddos\n");
		for(String valores: listaString) {
			System.out.println(valores);
		}
		
	}

}
