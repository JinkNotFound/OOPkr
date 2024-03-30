package Domain;

import Interface.iCalculable;
import Interface.ComplexNumber;


public class Calculator implements iCalculable {
    private ComplexNumber primaryArg;
    private ComplexNumber secondaryArg;
    private ComplexNumber result;

    public Calculator(ComplexNumber primaryArg, ComplexNumber secondaryArg) {
        this.primaryArg = primaryArg;
        this.secondaryArg = secondaryArg;
    }

    @Override
    public iCalculable complexSum(ComplexNumber arg1, ComplexNumber arg2) {
        result = new ComplexNumberImpl(arg1.getRealPart() + arg2.getRealPart(),
                                       arg1.getImaginaryPart() + arg2.getImaginaryPart());
        return this;
    }

    @Override
    public iCalculable complexMulti(ComplexNumber arg1, ComplexNumber arg2) {
        double realPart = arg1.getRealPart() * arg2.getRealPart() - arg1.getImaginaryPart() * arg2.getImaginaryPart();
        double imaginaryPart = arg1.getRealPart() * arg2.getImaginaryPart() + arg1.getImaginaryPart() * arg2.getRealPart();
        result = new ComplexNumberImpl(realPart, imaginaryPart);
        return this;
    }

    @Override
    public iCalculable complexDivision(ComplexNumber arg1, ComplexNumber arg2) {
        double denominator = arg2.getRealPart() * arg2.getRealPart() + arg2.getImaginaryPart() * arg2.getImaginaryPart();
        double realPart = (arg1.getRealPart() * arg2.getRealPart() + arg1.getImaginaryPart() * arg2.getImaginaryPart()) / denominator;
        double imaginaryPart = (arg1.getImaginaryPart() * arg2.getRealPart() - arg1.getRealPart() * arg2.getImaginaryPart()) / denominator;
        result = new ComplexNumberImpl(realPart, imaginaryPart);
        return this;
    }

    @Override
    public ComplexNumber getPrimaryArg() {
        return primaryArg;
    }

    @Override
    public ComplexNumber getSecondaryArg() {
        return secondaryArg;
    }

    @Override
    public String getResult() {
        return result.toString();
    }
}
