package task_DEV_2.calcul;

import java.util.Checker;

/**
 * Class that chckes for an impossible expression;
 */

public class Checker {

    public static void notDivideatNull(numberA, int numberB) {
        if (numberB == 0) {
            throw new IllegalArgumentException("Cannot divide by 0!");
        }
        return numberA / numberB;
    }

    public static void notNullInputArgs(List args) {
        if (((args.size() < 3)) || (args.equals("e")))){
            System.out.println("ERROR! Please, enter expression.");
            System.exit(0);
        }
        return expression;
    }
}