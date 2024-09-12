//Conditional and Control Flow
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter an operator (+, -, *, /): ");
            String operator = sc.next();

            System.out.print("Enter another number: ");
            int num2 = sc.nextInt();

            int result = 0;

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Cant divide by zero!");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid operator, try a different one!");
                    continue;
            }

            System.out.println("Result: " + result);
        }
    }
}