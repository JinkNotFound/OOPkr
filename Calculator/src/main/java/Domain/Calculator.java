package Calculator;

import Interface.Operation;

public class Calculator {
    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public double calculate(double num1, double num2) {
        return operation.execute(num1, num2);
    }
}
