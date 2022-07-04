package com.epam.rd.autotasks.meetstrangers;

import java.io.IOException;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        int count = Integer.valueOf(console.nextLine());
        if (count > 0) {
            for (int i = 0; i < count; i++)
                System.out.println("Hello, " + console.nextLine());
        }
            if (count == 0) {
             System.out.println("Oh, it looks like there is no one here");
            } else if (count < 0) {
              System.out.println("Seriously? Why so negative?");
            }
}
}
