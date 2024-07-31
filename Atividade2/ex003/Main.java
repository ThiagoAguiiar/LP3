package ex003;

public class Main {

	public static void main(String[] args) {
		Ex003 hip = new Ex003(3, 4);
		hip.calcularHipotenusa();
		
		System.out.println(Ex002.gerarAleatorio());
		
		int[] arr = { 80, 20, 25 };
		Ex001 num = new Ex001(arr);
		num.maiorNumero();
	}

}
