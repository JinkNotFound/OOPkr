package Domain;

import Interface.Operation;

import java.util.logging.Logger;

public class Calculator {
    private static final Logger LOGGER = Logger.getLogger(Calculator.class.getName());
    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public double calculate(double num1, double num2) {
        double result = operation.execute(num1, num2);
        LOGGER.info("Операция " + operation.getOperationName() + ": " + result);
        return result;
    }
}
