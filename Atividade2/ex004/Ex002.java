package ex004;

public class Ex002 {
	private String somaString;
	
	public Ex002(String somaString) {
		this.somaString = somaString;
	}
	
	public void somarString() {
		String[] aux = somaString.split("");
		int soma = 0;
		
		for(int i = 0; i < aux.length; i++) {
			try {
				soma += Integer.parseInt(aux[i]);
			} catch(Exception ex) {
                System.out.println("Não foi possível converter: " + aux[i]);
			}
		}
		
		System.out.println("Resultado: " + soma);
	}
}
