package ex008;

public class Produto {
	private String name;
	private double price;
	private int quantity;

	public Produto(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Price: " + price + ", Quantity: " + quantity;
	}
}
