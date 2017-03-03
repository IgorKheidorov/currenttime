package threeoptions;

import java.util.ArrayList;
import java.lang.String;

public class Parther {
    public static ArrayList partheArrayToArrayList(String[] options){
        ArrayList result = new ArrayList();
        for (String option : options) {
        result.add(option);
        }
        return result;
    }
}
