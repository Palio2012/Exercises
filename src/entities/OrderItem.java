package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {

    private Integer quantity;
    private Double price;
    private Product product;

    private List <Product> products = new ArrayList <>();

    public OrderItem () {
    }

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Double subTotal () {
        return price * quantity;
    }
    public String toString () {
        return  product.getName() +
                ", $" +
                price +
                ", Quantity: " +
                quantity +
                ", Subtotal: $" +
                String.format("%.2f", subTotal());
    }
}
