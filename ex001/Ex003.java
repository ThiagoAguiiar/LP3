package ex001;

public class Ex003 {
	private String[] vogais = {"A", "E", "I", "O", "U"};

	private String palavra;
	private int count = 0;
	
	public Ex003(String palavra) {
		this.palavra = palavra;
	}
	
	public void contarVogais() {
		String[] hidratacao = this.palavra.replace(" ", "").toUpperCase().split("");
		
		for (int i = 0; i < hidratacao.length; i++) {
			for (int j = 0; j < vogais.length; j++) {									
				if (hidratacao[i].equals(vogais[j])) {
					count++;
				}
			}
		}
		
		System.out.println("A palavra " + this.palavra + " contém " + count + " vogais");
	}
}
