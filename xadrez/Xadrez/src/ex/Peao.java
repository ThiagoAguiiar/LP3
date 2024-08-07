package ex;

class Peao extends Peca {
    private boolean primeiroMovimento;

    public Peao(int x, int y) {
        super(x, y);
        this.primeiroMovimento = true;
    }

    @Override
    public boolean mover(int novoX, int novoY) {
        int dx = novoX - x;
        int dy = novoY - y;

        if (dx == 0 && dy == 1) { // Movimento normal
            x = novoX;
            y = novoY;
            primeiroMovimento = false;
            return true;
        } else if (dx == 0 && dy == 2 && primeiroMovimento) { // Movimento duplo no primeiro movimento
            x = novoX;
            y = novoY;
            primeiroMovimento = false;
            return true;
        } else if (Math.abs(dx) == 1 && dy == 1) { // Captura na diagonal
            x = novoX;
            y = novoY;
            primeiroMovimento = false;
            return true;
        }
        return false;
    }
}