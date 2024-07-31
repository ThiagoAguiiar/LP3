package ex002;

public class Main {

	public static void main(String[] args) {
		Ex001 arrPalavras = new Ex001(new String[] {"Meu", "Nome", "Thiago"});
		arrPalavras.montarString();
		
		Ex003 vogais = new Ex003("SEMANA");
		vogais.removerVogais();
		
		Ex002 iString = new Ex002("Caju", "Maçã", 2);
		iString.inserirString();
	}

}
