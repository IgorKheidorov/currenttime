import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Calculates the value of expressions written in infix notation. 
 * The expression can contain parentheses, numbers with 
 * floating-point four basic mathematical operands.
 * @param expression the expression.
 * @return the result of the computation.
 */
public class Calculator {
	
	private static final Map<String, Integer> operations = new HashMap<String, Integer>();
	private SortingStation st = new SortingStation();
	
	public static final HashMap fillOpirationns(HashMap<String, Integer> operations) {
		operations = new HashMap<String, Integer>();
		operations.put("*", 1);
		operations.put("/", 1);
		operations.put("+", 2);
		operations.put("-", 2);
    	return operations;
	}
    
	public BigDecimal calculateExpression(String expression) {
        String rpn = st.sortingStation(expression, operations);
        StringTokenizer tokenizer = new StringTokenizer(rpn, " ");
        Stack<BigDecimal> stack = new Stack<BigDecimal>();
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            if (!operations.keySet().contains(token)) {
                stack.push(new BigDecimal(token));
            } else {
                BigDecimal operand2 = stack.pop();
                BigDecimal operand1 = stack.empty() ? BigDecimal.ZERO : stack.pop();
                if (token.equals("*")) {
                    stack.push(operand1.multiply(operand2));
                } else if (token.equals("/")) {
                    stack.push(operand1.divide(operand2));
                } else if (token.equals("+")) {
                    stack.push(operand1.add(operand2));
                } else if (token.equals("-")) {
                    stack.push(operand1.subtract(operand2));
                }
            }
        }
        if (stack.size() != 1)
            throw new IllegalArgumentException("Expression syntax error.");
        return stack.pop();
    }
}
