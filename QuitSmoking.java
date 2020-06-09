package com.CalinMa;

import java.util.Scanner;

public class QuitSmoking {

    public static void main(String[] args) {
        float z = 0;
        Scanner scanner = new Scanner(System.in);

      System.out.print("Monthly spending on smoking: ");
     int amountEachMonth = scanner.nextInt();
        System.out.print("How many months: ");
        int year = scanner.nextInt();

        for (int i = 0; i <= year - 1; i++) {
            z = amountEachMonth + z + (z + amountEachMonth) / 10 ;
        }
        // Feel free to change the currency
     System.out.println("After calculating a 10% interest rate each month, you will spare "+ z + " NOK");
    }
}
