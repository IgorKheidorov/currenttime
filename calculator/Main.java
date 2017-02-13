import java.util.HashMap;
import java.util.Map;

/**
 * Checks the input from the command line. 
 * If nothing is entered, the command console. 
 * Calls a method to solve the task.
 */
public class Main {

	public static void main(String[] args) {
		String expr = "";
		if (args.length == 0) {
			Getter get = new Getter();
			expr = get.getSimbol();
		}
		SortingStation s = new SortingStation();
		HashMap<String, Integer> operations = new HashMap<String, Integer>();
		Calculator calc = new Calculator();
		calc.calculateExpression(s.sortingStation(expr, Calculator.fillOpirationns(operations)));
		
	}
}
