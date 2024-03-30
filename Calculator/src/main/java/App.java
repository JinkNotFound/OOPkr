import java.util.Scanner;

import Domain.Calculator;
import Interface.ComplexNumber;
import Domain.ComplexLoggerDecorator;
import Domain.ComplexNumberImpl;
import Domain.Logger;

public class App {
    public static void main(String[] args) {
        Logger logger = new Logger();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первый аргумент действительного числа: ");
        double realPart1 = scanner.nextDouble();
        System.out.print("Введите первый аргумент мнимого числа: ");
        double imaginaryPart1 = scanner.nextDouble();
        ComplexNumber primaryArg = new ComplexNumberImpl(realPart1, imaginaryPart1);

        System.out.print("Введите команду ('*','+','/'): ");
        char command = scanner.next().charAt(0);

        System.out.print("Введите второй аргумент действительного числа: ");
        double realPart2 = scanner.nextDouble();
        System.out.print("Введите второй аргумент мнимого числа: ");
        double imaginaryPart2 = scanner.nextDouble();
        ComplexNumber secondaryArg = new ComplexNumberImpl(realPart2, imaginaryPart2);

        Calculator calculator = new Calculator(primaryArg, secondaryArg);
        ComplexLoggerDecorator decoratedCalculator = new ComplexLoggerDecorator(calculator, logger);

        switch (command) {
            case '+':
                decoratedCalculator.complexSum(primaryArg, secondaryArg);
                break;
            case '*':
                decoratedCalculator.complexMulti(primaryArg, secondaryArg);
                break;
            case '/':
                decoratedCalculator.complexDivision(primaryArg, secondaryArg);
                break;
            default:
                System.out.println("Неверная команда!");
        }

        System.out.println("Результат: " + decoratedCalculator.getResult());
    }
}
