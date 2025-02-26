package JavaPOO.GerenciadorDeEstoque;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int pQuantity) {
        this.quantity += pQuantity;
    }

    public void removeProducts(int pQuantity) {
        this.quantity -= pQuantity;
    }
}
