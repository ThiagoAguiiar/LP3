package ex12;

public class Main {

	public static void main(String[] args) {
		Arquivos arquivo1 = new Arquivos(200);
		Arquivos arquivo2 = new Arquivos(250);
		Arquivos arquivo3 = new Arquivos(20);

		Diretorios dir1 = new Diretorios();
		Diretorios dir2 = new Diretorios();
		Diretorios dir3 = new Diretorios();
		
		SistemaDeArquivos sistema1 = new SistemaDeArquivos();
		SistemaDeArquivos sistema2 = new SistemaDeArquivos();
		
		dir3.adicionarArquivos(arquivo1);
		dir2.adicionarArquivos(arquivo3);
		dir2.adicionarArquivos(arquivo2);
		dir1.adicionarArquivos(arquivo1);
		
		dir1.adicionarDiretorios(dir2);
		dir1.adicionarDiretorios(dir3);
		
		sistema1.adicionarDiretorio(dir1);
		sistema1.calcularTamanho();
		
		sistema2.adicionarDiretorio(dir3);
		sistema2.calcularTamanho();
	}

}
