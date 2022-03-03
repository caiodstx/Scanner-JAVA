package com.caio;

import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     *
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("What is your name?");
            String name = scanner.nextLine();
            System.out.println("How old are you?");
            int age = scanner.nextInt();

            if (age >= 18) {
                System.out.println("Welcome " + name + " you have " + age + " ,you can pass.");

            } else {
                System.out.println("Welcome " + name + " you have " + age + " ,you can't pass.");
            }
        }
    }
}
