package ex008;

import java.util.HashMap;

public class Inventario {
    private HashMap<String, Product> inventory;

    public Inventario() {
        this.inventory = new HashMap<>();
    }

    public void adicionarProduto(String name, double price, int quantity) {
        if (inventory.containsKey(name)) {
            System.out.println("Produto já existe");
        } else {
            Product product = new Product(name, price, quantity);
            inventory.put(name, product);
            System.out.println("Product added: " + product);
        }
    }

    public void removerProduto(String name) {
        if (inventory.containsKey(name)) {
            Product removedProduct = inventory.remove(name);
            System.out.println("Produto removido: " + removedProduct);
        } else {
            System.out.println("Produto não encontrado");
        }
    }

    public void buscarProduto(String name) {
        if (inventory.containsKey(name)) {
            Product product = inventory.get(name);
            System.out.println("Produto encontrado: " + product);
        } else {
            System.out.println("Produto não encontrado");
        }
    }
}

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Nome: " + name + ", Preço: " + price + ", Quantidade: " + quantity;
    }
}

