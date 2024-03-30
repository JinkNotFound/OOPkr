package Interface;

public interface iCalculable {
    iCalculable complexSum(ComplexNumber arg1, ComplexNumber arg2);
    iCalculable complexMulti(ComplexNumber arg1, ComplexNumber arg2);
    iCalculable complexDivision(ComplexNumber arg1, ComplexNumber arg2);
    ComplexNumber getPrimaryArg();
    ComplexNumber getSecondaryArg();
    String getResult();
}
