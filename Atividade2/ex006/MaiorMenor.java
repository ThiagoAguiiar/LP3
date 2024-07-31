package ex006;

import java.util.ArrayList;
import java.util.List;

public class MaiorMenor {
	private List<Double> num = new ArrayList<Double>();
	
	public MaiorMenor(List<Double> num) {
		this.num = num;
	}
	
	public void mostrarMaiorValor() {
		double maior = num.get(0);
		
		for(int i = 0; i < num.size(); i++) {
			if(maior <= num.get(i)) {
				maior = num.get(i);
			}
		}
		
		System.out.println("Maior número é: " + maior);
	}
	
	public void mostrarMenorValor() {
		double menor = num.get(0);
		
		for(int i = 0; i < num.size(); i++) {
			if(menor >= num.get(i)) {
				menor = num.get(i);
			}
		}
		
		System.out.println("Menor número é: " + menor);
	}
}
