import java.util.Scanner;
import Interface.Operation;
import Calculator.Addition;
import Calculator.Division;
import Calculator.Multiplication;
import Calculator.Subtraction;
import Calculator.Calculator;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Выберите операцию (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        Operation operation;
        switch (operator) {
            case '+':
                operation = new Addition();
                break;
            case '-':
                operation = new Subtraction();
                break;
            case '*':
                operation = new Multiplication();
                break;
            case '/':
                operation = new Division();
                break;
            default:
                System.out.println("Неверная операция!");
                return;
        }

        calculator.setOperation(operation);
        double result = calculator.calculate(num1, num2);
        System.out.println("Результат: " + result);
    }
}
