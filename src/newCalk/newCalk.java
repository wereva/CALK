package newCalk;

import java.util.Scanner;

public class newCalk {

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
//                break;
//            case "-":
//                sub(first, second);
//                break;
//            case "*":
//                mul(first, second);
//                break;
//            case "/":
//                div(first, second);
                break;
            default:
                System.out.println("Unknown value");
        }
    }
    public static void add(int first, int second){
        int result = first + second;
        System.out.println(first + "+" + second + "=" +result);


    }

}

