package threeoptions;

import java.util.ArrayList;
import java.util.Random;

public class Chooser {
    public static void outputRandomOptions(String[] options, int numberOfNeededOptions) {
        ArrayList ArrayListOfOptions = new ArrayList(Parther.partheArrayToArrayList(options));
        String result = "";
        Random random = new Random();
        if (ArrayListOfOptions.size() >= numberOfNeededOptions) {
            for (int i = 0; i < numberOfNeededOptions; i++)
            {
                int randomIndex = 0 + (int)(Math.random() * ((ArrayListOfOptions.size() - 0) + 1));
                if (0 == i)
                {
                    result = result + ArrayListOfOptions.get(randomIndex);
                }
                else
                {
                    result = result + " " + ArrayListOfOptions.get(randomIndex);
                }
                ArrayListOfOptions.remove(randomIndex);
            }
            Outputter.outputToConsole(result);
        }
        else
        {
            Outputter.outputToConsole("Too few arguments!!! You must input at least " + numberOfNeededOptions + " arguments.");
        }
    }

}
