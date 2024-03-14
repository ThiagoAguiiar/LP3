package exercicio006;

public class Livro {
	private int quantidadePaginas;
	
	public Livro(int quantidadePaginas) {
		this.quantidadePaginas = quantidadePaginas;
	}
	
	public void lerPagina(int index) {
		try {
			if (index < 1 || index > quantidadePaginas) {
				throw new Exception("Valor inválido");
			} else {
				System.out.println("Página " + index + " lida");
			}
		} catch(Exception ex) {
			System.out.println(ex);
		}
	}
}
