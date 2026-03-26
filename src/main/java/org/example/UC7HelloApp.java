package org.example;

public class UC7HelloApp {

        public static void main(String[] args) {

            String names;
            if (args.length > 0) {
                names = String.join(", ", args);
            } else {
                names = "ASH";
            }
            System.out.println("Hello, " + names + "!");
        }
    }
