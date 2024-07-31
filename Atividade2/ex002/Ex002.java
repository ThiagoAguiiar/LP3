package ex002;

public class Ex002 {
	private StringBuilder palavra1;
	private StringBuilder palavra2;
	
	private int pos;
	
	public Ex002(String p1, String p2, int pos) {
		this.palavra1 = new StringBuilder(p1);
		this.palavra2 = new StringBuilder(p2);
		
		this.pos = pos;
	}
	
	public void inserirString() {
		palavra1.insert(pos, palavra2);
		System.out.println(palavra1);
	}
}
