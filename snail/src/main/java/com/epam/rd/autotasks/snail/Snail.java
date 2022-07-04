package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt(); //футы вверх 4
        int b = console.nextInt(); //футы вниз 2
        int h = console.nextInt(); //высота дерева в футах 14
            if (a >= h) {
                System.out.println(1);
            }
            else if (a <= b) {
                System.out.println("Impossible");
            } else {
                    int c = (a - b);
                    int d = (h - b) / c;
                    System.out.println(d);
                }
        }
    }





        //Write a program that reads a,b and h (line by lyne in this order) and prints
        //the number of days for which the snail reach the top of the tree.
        //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree


// int days = 0;итоговое к-во футов в день
//  for (int i = 0; a <= h; i++) {
//    days += c;
//  if (days == (h - b) / c) {
//    break;
