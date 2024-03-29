package Domain;

import Interface.Operation;

public class Division implements Operation {
    @Override
    public double execute(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("Деление на ноль!");
        }
    }

    @Override
    public String getOperationName() {
        return "Division";
    }
}