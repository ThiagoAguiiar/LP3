package ex;

public class Main {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro();
        Peca rei = new Rei(0, 0);
        Peca rainha = new Rainha(1, 1);
        Peca bispo = new Bispo(2, 2);
        Peca cavalo = new Cavalo(3, 3);
        Peca torre = new Torre(4, 4);
        Peca peao = new Peao(5, 5);

        tabuleiro.adicionarPeca(rei, 0, 0);
        tabuleiro.adicionarPeca(rainha, 1, 1);
        tabuleiro.adicionarPeca(bispo, 2, 2);
        tabuleiro.adicionarPeca(cavalo, 3, 3);
        tabuleiro.adicionarPeca(torre, 4, 4);
        tabuleiro.adicionarPeca(peao, 5, 5);

        tabuleiro.imprimirTabuleiro();

        System.out.println("\nMovendo Rei de (0, 0) para (1, 1)");
        tabuleiro.moverPeca(0, 0, 1, 1);
        tabuleiro.imprimirTabuleiro();

        System.out.println("\nMovendo Rainha de (1, 1) para (3, 3)");
        tabuleiro.moverPeca(1, 1, 3, 3); 
        tabuleiro.imprimirTabuleiro();

        System.out.println("\nMovendo Bispo de (2, 2) para (4, 4)");
        tabuleiro.moverPeca(2, 2, 4, 4);
        tabuleiro.imprimirTabuleiro();

        System.out.println("\nMovendo Cavalo de (3, 3) para (4, 5)");
        tabuleiro.moverPeca(3, 3, 4, 5);
        tabuleiro.imprimirTabuleiro();

        System.out.println("\nMovendo Torre de (4, 4) para (4, 7)");
        tabuleiro.moverPeca(4, 4, 4, 7);
        tabuleiro.imprimirTabuleiro();

        System.out.println("\nMovendo Peão de (5, 5) para (5, 6)");
        tabuleiro.moverPeca(5, 5, 5, 6);
        tabuleiro.imprimirTabuleiro();
    }
}