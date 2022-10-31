package calculation;

public class Calculator {
    int result;

    public void addition(int a, int b) {
        System.out.println("Addition of a and b is " + (a + b));
    }

    public void subtraction(int a, int b) {
        System.out.println("Subtraction of a and b is " + (a - b));
    }

    public void division(int a, int b) {
        System.out.println("Division of a and b is " + (a / b));
    }

    public void multiplication(int a, int b) {
        System.out.println("Multiplication of a and b is " + (a * b));
    }

    public void calculateResult(int a, int b, char symbol) {
        switch (symbol) {
            case '+':
                addition(a, b);
                break;
            case '-':
                subtraction(a, b);
                break;
            case '/':
                division(a, b);
                break;
            case '*':
                multiplication(a, b);
                break;
            default:
                System.out.println("Select valid symbol to get calculation");
                break;
        }
    }
}