package ex004;

public class Ex001 {
	private int[] arr;
	
	public Ex001(int[] arr) { 
		this.arr = arr;
	}
	
	public void somaMediaArr() {
		int soma = 0;
		int media;
		
		for(int i = 0; i < arr.length; i++) {
			soma += arr[i];
		}
		
		media = soma / arr.length;
		
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
	}
}
