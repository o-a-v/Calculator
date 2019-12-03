package Calculator;

public class Main {
    public static void main(String[] args) {

        double num1 = Calculator.getNumber();
        double num2 = Calculator.getNumber();
        char operation = Calculator.getOperation();
        double result = Calculator.calc(num1, num2, operation);
        System.out.println("Результат:" + result);

    }
}
