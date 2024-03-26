package ex9;

public class Quarto {
	private int numeroQuarto;
	private boolean disponivel;
	
	public Quarto(int numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
		this.disponivel = true;
	}

	public int getNumeroQuarto() {
		return numeroQuarto;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
}
