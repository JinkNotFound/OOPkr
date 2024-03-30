package Domain;

import Interface.ComplexNumber;
import Interface.iCalculable;

public class ComplexLoggerDecorator implements iCalculable {

    private iCalculable oldCalculator;
    private Logger logger;

    public ComplexLoggerDecorator(iCalculable oldCalculator, Logger logger) {
        this.oldCalculator = oldCalculator;
        this.logger = logger;
    }
    @Override
    public iCalculable complexSum(ComplexNumber arg1, ComplexNumber arg2) {
        logger.log(String.format("[LOG] Начало вызова метода complexSum с аргументами %s и %s", arg1, arg2));
        iCalculable result = oldCalculator.complexSum(arg1, arg2);
        logger.log(String.format("[LOG] Метод complexSum завершен, результат: %s", result.getResult()));
        return result;
    }

    @Override
    public iCalculable complexMulti(ComplexNumber arg1, ComplexNumber arg2) {
        logger.log(String.format("[LOG] Начало вызова метода complexMulti с аргументами %s и %s", arg1, arg2));
        iCalculable result = oldCalculator.complexMulti(arg1, arg2);
        logger.log(String.format("[LOG] Метод complexMulti завершен, результат: %s", result.getResult()));
        return result;
    }

    @Override
    public iCalculable complexDivision(ComplexNumber arg1, ComplexNumber arg2) {
        logger.log(String.format("[LOG] Начало вызова метода complexDivision с аргументами %s и %s", arg1, arg2));
        iCalculable result = oldCalculator.complexDivision(arg1, arg2);
        logger.log(String.format("[LOG] Метод complexDivision завершен, результат: %s", result.getResult()));
        return result;
    }

    @Override
    public ComplexNumber getPrimaryArg() {
        return oldCalculator.getPrimaryArg();
    }

    @Override
    public ComplexNumber getSecondaryArg() {
        return oldCalculator.getSecondaryArg();
    }

    @Override
    public String getResult() {
        return oldCalculator.getResult();
    }
}
