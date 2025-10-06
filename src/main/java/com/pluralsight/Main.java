package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 /*       double price = 100.0;
        double discount = 0.2;

        double finalPrice = price + (price * discount);

        System.out.println("Final price: " + finalPrice);

  */

/*        Scanner scanner = new Scanner(System.in);
        String[] listofNames = {"Ray", "Wasid", "Zain"};

        System.out.println("Please enter the index of the name that you want: ");
        int index = scanner.nextInt();

        System.out.println(listofNames[index]);

 */

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter number 1: ");
            int firstNumber = scanner.nextInt();

            System.out.println("Enter number 2: ");
            int secondNumber = scanner.nextInt();

            int result = firstNumber / secondNumber;

            System.out.println("Result: " + result);
        } catch (Exception ex){
            System.out.println("A big sorry from potato sensei, an error has occured!");

        }


    }
}
