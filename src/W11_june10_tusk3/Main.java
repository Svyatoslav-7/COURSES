package W11_june10_tusk3;

/*
Створіть проект за допомогою IntelliJ IDEA. Потрібно: Описати клас з іменем Price, що містить такі поля:

  назву товару;
  назву магазину, в якому продається товар;
  вартість товару у гривнях.

 Написати програму, яка виконує такі дії:

  введення з клавіатури даних до масиву, що складається з двох елементів типу Price (записи мають бути впорядковані в алфавітному порядку за назвами магазинів);
  виведення на екран інформації про товари, що продаються в магазині, назва якого введена з клавіатури (якщо такого магазину немає, вивести виняток).
*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Price[] prices = new Price[2];

        for(int i =0; i<2; i++){

            System.out.println("Enter store name: ");
            String storeName=scanner.nextLine();
            System.out.println("Enter product name: ");
            String productName=scanner.nextLine();
            System.out.println("Enter price of product: ");
            double priceProduct=scanner.nextDouble();
            scanner.nextLine();

            Price price=new Price(productName, storeName, priceProduct);
            prices[i]=price;
        }

        Arrays.sort(prices, Comparator.comparing(Price::getStoreName));

        System.out.println("Enter product name what you want see info: ");
        String productNameInfo=scanner.nextLine();

        boolean found = false;
            for (int i = 0; i < 2; i++) {
                if (prices[i].getProductName().equals(productNameInfo)) {
                    System.out.println("Product name: " + prices[i].getProductName());
                    System.out.println("Store name: " + prices[i].getStoreName());
                    System.out.println("Price: " + prices[i].getPriceProduct());
                    found = true;
                    break;
                }
            }

        if (found==false) {
            System.out.println("We don`t have this product");
        }


    }
}