package org.example;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello world!");
        } else {
            System.out.println("Hello" + args[0] + "!");
        }
    }
}