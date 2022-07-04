package com.epam.rd.autotasks.pizzasplit;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int people = console.nextInt(); //кол-во людей
        int piece = console.nextInt(); //кол-во кусков
        int pizza = 1; // кол-во пиццы
        int pieceSum = piece;
         while (piece % people != 0) {
             piece = pieceSum;
             piece *= pizza;
             if (piece % people == 0) {
                 ;//Write a program, reading number of people and number of pieces per pizza and then
                 break;
             }
             pizza++;
         }
        System.out.println(pizza);
        //printing minimum number of pizzas to order to split all the pizzas equally and with no remainder



    }
}
