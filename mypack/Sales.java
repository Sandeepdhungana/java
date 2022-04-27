package mypack;

import java.util.Scanner;

public class Sales {
    Scanner sc = new Scanner(System.in);

    // verify if the password is valid
    public boolean isValidPassword(String password) {

        int count_of_uppercase = 0;
        int count_of_lowercase = 0;

        for (int i = 0; i < password.length(); i++) {

            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                count_of_uppercase++;
            }
            if (Character.isLowerCase(c)) {
                count_of_lowercase++;
            }
        }

        if (count_of_lowercase >= 3 && count_of_uppercase >= 2)
            return true;
        else
            return false;
    }

    // take input from the user
    public void takeInput() {

        String password;

        while (true) {

            System.out.print("\n\nEnter the password : ");

            password = sc.nextLine();

            if (isValidPassword(password) != true) {
                System.out.print(
                        "\nThe password did not match the reqirements of at least 2 uppercase letters and at least 3 lowercase letters .");
            } else {
                break;
            }
            System.out.print("\n\nPlease reenter the password : ");

        }
    }

    // Calculate and Display the value
    public void calculateAndDisplay() {
        double total_sales = 0;
        double min_sales = Integer.MAX_VALUE;
        double max_sales = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {

            System.out.println("\nEnter the salse for day " + (i + 1) + ".");

            int sales = sc.nextInt();

            total_sales += sales;

            if (sales > max_sales)
                max_sales = sales;
            if (sales < min_sales)
                min_sales = sales;

        }

        double average_sales = total_sales / 5;
        System.out.println("\nThe total sales were $" + total_sales);
        System.out.println("\nThe average sales were $" + average_sales);
        System.out.println("\nThe highest sales were $" + max_sales);
        System.out.println("\nThe lowest sales were $" + min_sales);
    }

}
