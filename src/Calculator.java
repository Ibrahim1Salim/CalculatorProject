import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci ədədi daxil edin: ");
        double num1 = scanner.nextDouble();

        System.out.println("Operatoru daxil edin (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.println("İkinci ədədi daxil edin: ");
        double num2 = scanner.nextDouble();
        double result1;
        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Sıfıra bölmək mümkün deyil!");
                    return;
                }
                break;
            default:
                System.out.println("Yanlış operator daxil etdiniz!");
                return;
        }

        System.out.println("Nəticə: " + result);
        scanner.close();
    }
}
