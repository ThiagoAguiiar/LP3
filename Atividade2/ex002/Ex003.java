package ex002;

public class Ex003 {
	public StringBuilder palavra;
	private String[] vogais = {"A", "E", "I", "O", "U"};
	
	public Ex003(String palavra) {
		this.palavra = new StringBuilder(palavra);
	}
	
	 public void removerVogais() {
	    for (int i = palavra.length() - 1; i >= 0; i--) {
	        for (int k = 0; k < vogais.length; k++) {
	            if (Character.toString(palavra.charAt(i)).equalsIgnoreCase(vogais[k])) {
	                  palavra.deleteCharAt(i);
	                  break; 
	                }
	            }
	        }

	   System.out.println(palavra);
	}
}
