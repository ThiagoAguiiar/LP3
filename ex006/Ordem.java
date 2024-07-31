package ex006;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordem {
	private List<Integer> inteiros = new ArrayList<Integer>();
	
	public Ordem(List<Integer> inteiros) {
		this.inteiros = inteiros;
	}
	
	public void ordenarLista() {
       Collections.sort(inteiros);
       
       for(int i = 0; i < inteiros.size(); i++) {
    	   System.out.println(inteiros.get(i));
       }
	}
}
