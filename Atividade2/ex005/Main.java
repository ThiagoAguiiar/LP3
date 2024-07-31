package ex005;

public class Main {

	public static void main(String[] args) {
		Ex001 ex1 = new Ex001("20/10/2023", "20/10/2024");
		ex1.calcularVariacaoData();
		
		Ex002 ex2 = new Ex002("20/11/2022", 35);
		ex2.adicionarDiasData();
		
		Ex003 ex3 = new Ex003("10/11/2023", "09/11/2023");
		ex3.mostrarProxAntData();
	}
}
