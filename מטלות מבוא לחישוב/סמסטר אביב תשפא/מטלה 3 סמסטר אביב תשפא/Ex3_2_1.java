


public class Ex3_2_1 {

    public static void main(String[] args) {
        System.out.println(isFormula("(5+3)"));
    }

    public static boolean isFormula(String s) {
        if (s == null)
            return false;
        if (s.length() < 1 || s.length() == 3)
            return false;
        String legal_values = "123456789x";
        if (s.length() == 1) {
            return legal_values.contains(s);
        } else if ((!(s.charAt(0) == '(' && s.charAt(s.length() - 1) == ')'))) {
            return false;
        }
        // split
        s = s.substring(1, s.length() - 1);
        if (s.length() == 0)
            return false;
        int split_idx = splitFormula(s);
        if (split_idx == 0) {
            return false;
        }
        return isFormula(s.substring(0, split_idx)) && isFormula(s.substring(split_idx + 1));

    }

    private static int splitFormula(String s) {
        String legal_actions = "+-*/%";
        int n_barackets = 0;
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '(') {
                n_barackets++;
            }
            if (s.charAt(i) == ')') {
                n_barackets--;
            }
            if (legal_actions.contains("" + s.charAt(i)) && n_barackets == 0) {
                return i;
            }
            i++;
        }
        return 0;
    }


    public static double assign(String s, int x) {
        if (isFormula(s)) {
            return evaluate(s, x);
        }
        return Double.NaN;
    }


    public static int evaluate(String expression, int x) {
        char ch;
        int operators;
        // scan expression, looking for operators outside of parenthese
        operators = splitFormula(expression);
        ch = expression.charAt(splitFormula(expression));
        // break down, e.g. "3*4+5*6" => "3*4" and "5*6"
        if (operators != 0) {
            String exprLeft = expression.substring(0, operators);
            String exprRight = expression.substring(operators + 1);
            int valueLeft = evaluate(exprLeft, x);
            int valueRight = evaluate(exprRight, x);
            switch (ch) {
                case '+':
                    return valueLeft + valueRight;
                case '*':
                    return valueLeft * valueRight;
                case '/':
                    if (valueRight == 0) {
                        System.out.println("Invalid divisor");
                        System.exit(1);
                    } else {
                        return valueLeft / valueRight;
                    }
                case '-':
                    return valueLeft - valueRight;
            }
        } else if (expression.charAt(0) == '(' && (expression.charAt(expression.length() - 1) == ')')) {
            // everything was in a matched pair of parentheses
            // break down, e.g. "(3*4)" => "3*4"
            return evaluate(expression.substring(1, expression.length() - 1), x);

        } else if (expression.charAt(0) == 'x') {
            return x;
        }
        // base case: just a number. convert expression to int.
        // don't make any recursive calls

        return Integer.parseInt(expression);
    }
}










