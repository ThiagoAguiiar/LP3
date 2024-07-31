package ex004;

public class Main {

	public static void main(String[] args) {
		String[] arr = {"2", "Texto", "3", "5"};
		int arr2[] = {10, 20, 30};
		
		Ex003 num = new Ex003(arr);
		num.converterStringNum();
		
		Ex001 somaMedia = new Ex001(arr2);
		somaMedia.somaMediaArr();
		
		Ex002 somaString = new Ex002("12345ax");
		somaString.somarString();
	}

}
