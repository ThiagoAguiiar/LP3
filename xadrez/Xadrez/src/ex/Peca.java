package ex;

abstract class Peca {
    protected int x, y;

    public Peca(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract boolean mover(int novoX, int novoY);

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " (" + x + ", " + y + ")";
    }
}