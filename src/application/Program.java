package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdfBirth = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdfOrder = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Order order = new Order();
        OrderItem orderItem = new OrderItem();

        System.out.println("Enter client data: ");

        System.out.print("Name: ");
        String clientName = sc.nextLine();


        System.out.print("Email: ");
        String clientEmail = sc.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        Date clientBirthDate = sdfBirth.parse(sc.next());

        Client client = new Client(clientName, clientEmail, clientBirthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        order.setStatus(OrderStatus.valueOf(sc.next()));

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter item #" + (i+1) + " data: ");

            System.out.print("Product name: ");
            String productName = sc.nextLine();
            sc.next();

            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();

            System.out.print("Product Quantity: ");
            int productQuantity = sc.nextInt();

            order.addItem(new OrderItem(productQuantity, productPrice, new Product(productName, productPrice)));
        }

        System.out.println("ORDER SUMMARY: ");

        System.out.println("Order moment: " + sdfOrder.format(order.getMoment()));
        System.out.println("Order Status: " + order.getStatus());
        System.out.println("Client: " + client);
        System.out.println("Order items: ");

        order.getOrderItem().forEach(System.out :: println);

        System.out.println("Total Price: $" + String.format("%.2f", order.total()));

        sc.close();
    }

}
