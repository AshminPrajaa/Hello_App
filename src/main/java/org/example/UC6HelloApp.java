package org.example;

public class UC6HelloApp {
        public static void main(String[] args) {
            String name;
            if (args.length > 0) {
                StringBuilder nameBuilder = new StringBuilder();
                for (String n : args) {
                    nameBuilder.append(n).append(", ");
                }
                String temp = nameBuilder.toString();
                name = temp.substring(0, temp.length() - 2);
            } else {
                name = "ASH";
            }
            System.out.println("Hello, " + name + "!");
        }
    }

