package com.epam.rd.autotasks.sequence;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {

        Scanner console = new Scanner(System.in);
        int z = 1;// Put your code here
        while (console.hasNextInt()) {
            int x;
            x = console.nextInt();
            if (x != 0) {
                z = x;
            }if (x == 0) {
                break;
            }
                while (console.hasNextInt()){
                x = console.nextInt();
                if (x != 0) {
                    z = Math.max(z, x);
                    }
                 if (x == 0) {
                     break;
                 }
                }
        }
        return z;
    }



        public static void main (String[]args){

            System.out.println("Test your code here!\n");

            // Get a result of your code

            System.out.println(max());
        }
    }

