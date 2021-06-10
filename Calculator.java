public class Calculator {

    private double operandOne;
    private String operation;
    private double operandTwo;
    private static double result;

    public void setOperandOne(double operand) {
        operandOne = operand;
    }

    public void setOperandTwo(double operand) {
        operandTwo = operand;
    }

    public void setOperation (String plusOrMinus) {
        operation = plusOrMinus;
    }

    public double performOperation () {
        if(this.operation == "+") {
            result = operandOne + operandTwo;
            return result;
        } else {
            result = operandOne - operandTwo;
            return result;
        }
    }

    public static double getResults() {
        return result;
    }
}