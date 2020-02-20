package com.engeto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      /*  Scanner scanner = new Scanner(System.in);

        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");


        String message1 = scanner.nextLine();


        System.out.println("What is their job?");

        String message2 = scanner.nextLine();


        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was " + message1 + ", who was a" + message2 + ".\n" +
                "On the way to work, " + message1 + " reflected on life.\n" +
                "Perhaps " + message1 + " will not be a " + message2 + " forever.");

*/
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner2 = new Scanner(System.in);

        while (true) {

            Integer input = Integer.valueOf(scanner2.nextLine());

            if (input == 0)
                break;
            list.add(input);

        }
        System.out.println(list.get(1) + list.get(2));
    }


}


