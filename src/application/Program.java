package application;


import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i + 1) + " data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char c = sc.next().charAt(0);

            System.out.print("Name: ");
            String productName = sc.nextLine();
            sc.next();

            System.out.print("Price: ");
            double productPrice = sc.nextDouble();

            if (c == 'c') {
                products.add(new Product(productName, productPrice));
            } else if (c == 'u') {
                System.out.print("Manufacture Date: (DD/MM/YYYY): ");
                Date manufatcuredDate = sdf.parse(sc.next());

                products.add(new UsedProduct(productName, productPrice, manufatcuredDate));
            } else if (c == 'i') {
                System.out.print("Customs Fee: ");
                double customsFee = sc.nextDouble();

                products.add(new ImportedProduct(productName, productPrice, customsFee));
            }
        }
        System.out.println("PRICE TAGS: ");

        for (Product prod : products) {
            System.out.println(prod.priceTag());
        }
    }
}

