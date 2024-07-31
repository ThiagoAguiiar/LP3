package ex003;

public class Ex001 {
	private int[] numeros;
	
	public Ex001(int[] num) {
		this.numeros = num;
	}
	
	public void maiorNumero() {
		int anterior = 0;
		 
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] > anterior) {
				anterior = numeros[i];
			}
		}
		
		System.out.println(anterior);
	}
}
