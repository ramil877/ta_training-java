package com.epam.rd.autotasks.meetanagent;

import java.util.Scanner;

public class MeetAnAgent {
    final static int PASSWORD = 133976; //You can change pass, but don't change the type

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        String text = console.nextLine();
        if (number == PASSWORD) {
            System.out.println("Hello, Agent");//put you code here
        } else {
            System.out.println("Access denied");
        }
    }
    }

