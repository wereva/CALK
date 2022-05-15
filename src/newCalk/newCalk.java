package newCalk;

import java.util.Scanner;

public class newCalk {
    public static void add(int first, int second){
        int result = first + second;
        System.out.println(first + "+" + second + "=" +result);
    }
    public static void sub(int first, int second) {
        int result = first - second;
        System.out.println(first + "-" + second + "=" + result);
    }

    public static void mul(int first, int second) {
        int result = first * second;
        System.out.println(first + "*" + second + "=" + result);
    }

    public static void div(int first, int second) {
        int result = first / second;
        if (second != 0) {
            System.out.println(first + "/" + second + "=" + result);
        } else {
            System.out.println("can't divide by zero");
        }
    }


            public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number --");
        int first = in.nextInt();
        System.out.println("Enter second number --");
        int second = in.nextInt();
        System.out.println("Enter operation");
        String symbol = in.next();

        switch (symbol) {
            case "+":
                add(first, second);
                break;
            case "-":
                sub(first, second);
                break;
            case "*":
                mul(first, second);
                break;
            case "/":
                div(first, second);
                break;
            default:
                System.out.println("Unknown value");
           }
       }
    }



