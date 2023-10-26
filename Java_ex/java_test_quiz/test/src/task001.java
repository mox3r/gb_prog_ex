
import java.util.LinkedList;
class Calculator {
static LinkedList<Integer> calculateResults = new LinkedList<>();

    public static int calculate(char op, int a, int b) {
        int result;
        switch (op) {
            case '+': {
                result = a + b;
                calculateResults.add(result);
                return calculateResults.getLast();
                
            }
            case '-': {
                result = a - b;
                calculateResults.add(result);
                return calculateResults.getLast();
            }
            case '*': {
                result = a * b;
                calculateResults.add(result);
                return calculateResults.getLast();
            }
            case '/': {
                if (b != 0) {
                    result = a / b;
                    calculateResults.add(result);
                    return calculateResults.getLast();
                } else {
                    return -1;
                }
            }

            case '<': {
                return calculateResults.get(calculateResults.size() - 2);
            }
            default: {
                return -1;
            }
        }

    }
}
public class task001 {
    static LinkedList<Integer> calculateResults = new LinkedList<>();

    public static int calculate(char op, int a, int b) {
        int result;
        switch (op) {
            case '+': {
                result = a + b;
                calculateResults.add(result);
                return calculateResults.getLast();
                
            }
            case '-': {
                result = a - b;
                calculateResults.add(result);
                return calculateResults.getLast();
            }
            case '*': {
                result = a * b;
                calculateResults.add(result);
                return calculateResults.getLast();
            }
            case '/': {
                if (b != 0) {
                    result = a / b;
                    calculateResults.add(result);
                    return calculateResults.getLast();
                } else {
                    return -1;
                }
            }

            case '<': {
                return calculateResults.get(calculateResults.size() - 2);
            }
            default: {
                return -1;
            }
        }

    }

    public static void main(String[] args) {

        System.out.println(task001.calculate('+', 3, 6));
        System.out.println(task001.calculate('+', 7, 6));
        System.out.println(task001.calculate('<', 0, 0));

    }
}
