package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private Date moment = new Date();
    private OrderStatus status;
    private Client client;

    private List<OrderItem> orderItem = new ArrayList<>();

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Order() {
    }

    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getOrderItem() {
        return orderItem;
    }

    public void addItem (OrderItem item) {
        orderItem.add(item);
    }
    public void removeItem (OrderItem item) {
        orderItem.remove(item);
    }

    public Double total () {
        double sum = 0;
        for (int i = 0; i < orderItem.size(); i++) {
            sum += orderItem.get(i).subTotal();
        }
        return sum;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(client + "\n");
        sb.append("Order items:\n");
        for (OrderItem item : orderItem) {
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
