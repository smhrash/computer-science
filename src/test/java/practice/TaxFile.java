package practice;

import java.util.Scanner;

public class TaxFile {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter annual income");
        double income = scan.nextDouble();
        System.out.println("Enter age");
        int age = scan.nextInt();

        double tax = 0.0;

        if (income < 10000000) {
            if (age >= 80) {
                if (income > 1000000) {
                    tax = 0.3 * (income - 1000000) + 0.2 * (1000000 - 500000) + 0.10 * (500000 - 250000);
                } else if (income <= 1000000 && income > 500000) {
                    tax = 0.2 * (income - 500000) + 0.10 * (500000 - 250000);
                } else if (income <= 500000 && income > 300000) {
                    tax = 0.0;
                } else if (income <= 300000 && income > 250000) {
                    tax = 0.0;
                } else if (income <= 250000) {
                    tax = 0.0;

                }

            } else if (age >= 60 & age < 80) {
                if (income > 1000000) {
                    tax = 0.3 * (income - 1000000) + 0.2 * (1000000 - 500000) + 0.10 * (500000 - 250000);
                } else if (income <= 1000000 && income > 500000) {
                    tax = 0.2 * (income - 500000) + 0.10 * (500000 - 250000);
                } else if (income <= 500000 && income > 300000) {
                    tax = 0.1 * (income - 300000);
                } else if (income <= 300000 && income > 250000) {
                    tax = 0.0;
                } else if (income <= 250000) {
                    tax = 0.0;
                }
            } else {
                if (income > 1000000) {
                    tax = 0.3 * (income - 1000000) + 0.2 * (1000000 - 500000) + 0.10 * (500000 - 250000);
                } else if (income <= 1000000 && income > 500000) {
                    tax = 0.2 * (income - 500000) + 0.10 * (500000 - 250000);
                } else if (income <= 500000 && income > 300000) {
                    tax = 0.1 * (income - 300000) + 0.10 * (300000 - 250000);
                } else if (income <= 300000 && income > 250000) {
                    tax = 0.1 * (income - 250000);
                } else if (income <= 250000) {
                    tax = 0.0;
                }
            }
        }

        System.out.print(tax);
        scan.close();
    }
}

