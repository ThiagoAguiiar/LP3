package ex12;

import java.util.ArrayList;
import java.util.List;

public class Diretorios {
	private List<Arquivos> arquivos;
	private List<Diretorios> diretorios;
	
	public Diretorios() {
		this.arquivos = new ArrayList<Arquivos>();
		this.diretorios = new ArrayList<Diretorios>();
	}
	
	private double tamanhoArquivos = 0;
	
	public void adicionarArquivos(Arquivos arquivo) {
		arquivos.add(arquivo);
		
		tamanhoArquivos += arquivo.getTamanhoArquivo();
	}
	
	public void adicionarDiretorios(Diretorios diretorio) {
		diretorios.add(diretorio);
		
		for(Arquivos a: diretorio.arquivos) {
			tamanhoArquivos += a.getTamanhoArquivo();
		}
		
		for(Diretorios d: diretorio.diretorios) {
			tamanhoArquivos += d.getTamanhoArquivo();
		}
	}
	
	public double getTamanhoArquivo() {
		return this.tamanhoArquivos;
	}
}
