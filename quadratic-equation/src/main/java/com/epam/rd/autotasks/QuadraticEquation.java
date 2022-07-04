package com.epam.rd.autotasks;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = b * b - 4 * a * c;
        double x;
        double x1;
        double x2;

        if (d == 0) {
            x = -b / 2 * a;
            System.out.println(x);
        }
        else if (d > 0) {
            d = Math.sqrt(d);
            x1 = (-b + d) / (2 * a);
            x2 = ((-b - d) / (2 * a));

            System.out.println(x1 + " " + x2);
        }
        else {
            System.out.println("no roots");
        }
    }
}