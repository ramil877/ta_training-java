package com.epam.rd.autotasks.meetastranger;

import java.util.Scanner;

public class MeetAStranger {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);//Write a program, which read a String from System.in and print "Hello, <input string>"
        String input = console.nextLine();
        System.out.println("Hello, " + input);
    }
}
