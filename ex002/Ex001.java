package ex002;

public class Ex001 {
	private String[] palavras;
	
	public Ex001(String[] palavras) {
		this.palavras = palavras;
	}
	
	public void montarString() {
		StringBuilder builder = new StringBuilder();
		
		for(int i = 0; i < palavras.length; i++) {
			builder.append(palavras[i] + " ");
		}
		
		System.out.println(builder);
	}
}
