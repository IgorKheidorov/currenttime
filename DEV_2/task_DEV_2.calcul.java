package task_DEV_2.calcul;

import java.util.Scanner;

public class Calculator {

    /**
     * Enter expression into console to colculate
     */

    public static void main(String[] args) {

        double numberA, numberB;
        String operation;
        Scanner scannerObject = new Scanner(System.in);

        Maths Maths = new Maths();

        System.out.println("Enter first number");
        numberA = scannerObject.nextDouble();

        System.out.println("Enter second number");
        numberB = scannerObject.nextDouble();

        Scanner op = new Scanner(System.in);
        System.out.println("Enter your operation");
        operation = op.next();

        switch (operator) {
            case '+':
                answer = Maths.add(numberA, numberB);
                break;
            case '-':
                answer = Maths.subtract(numberA, numberB);
                break;
            case '*':
                answer = Maths.multiply(numberA, numberB);
                break;
            case '/':
                answer = Maths.divide(numberA, numberB);
                break;
            case '^':
                answer = Maths.power(numberA, numberB);
                break;
        }

        System.out.println(answer);
    }

    input.close();

}

}