package ex12;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeArquivos {
	private List<Diretorios> raiz;
	
	public SistemaDeArquivos() {
		this.raiz = new ArrayList<Diretorios>();
	}
	
	public void adicionarDiretorio(Diretorios diretorio) {
		raiz.add(diretorio);
	}
	
	public void calcularTamanho() {
		int tamanho = 0;
		
		for(Diretorios dir: raiz) {
			tamanho += dir.getTamanhoArquivo();
		}
		
		System.out.println(tamanho);
	}
}
