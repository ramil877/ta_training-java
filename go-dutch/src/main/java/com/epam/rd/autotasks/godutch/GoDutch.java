package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);  //Write code here
        int sum = console.nextInt();
        {
            if (sum < 0) {
                System.out.println("Bill total amount cannot be negative");
            } else {
                int friends = console.nextInt(); {
                    if (friends <= 0) {
                        System.out.println("Number of friends cannot be negative or zero");
                    }
                    else {
                        int tot = ((sum / 100) * 10) + sum;
                        System.out.println(tot / friends);
                    }
                }
            }

        }
    }
}
