package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int sum = x;
        int avg = 0;
         // Use Scanner methods to read input
            if (sum != 0) {
                for (int i = 2; x != 0; i++) {
                    x = scanner.nextInt();
                    if (x != 0) {
                    sum += x;
                    avg = sum / i;
                    }
                }
                    System.out.println(avg);
            }

    }

}


