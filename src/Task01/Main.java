package Task01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String operator;
        double number1, number2, result;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an operator (+, -, *, /): ");
        operator = input.nextLine();

        System.out.println("Enter 1st number:");
        number1 = input.nextDouble();

        System.out.println("Enter 2nd number:");
        number2 = input.nextDouble();

        switch (operator) {
            case "+":
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
            case "-":
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;
            case "*":
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;
            case "/":
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println(number1 + " / " + number2 + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: The operator is incorrect !");
                break;
        }

        input.close();
    }
}

