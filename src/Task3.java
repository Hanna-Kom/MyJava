import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Введіть перше число");
        int a = scnr.nextInt();
        System.out.println("Введіть знак математичної дії");
        char operation = scnr.next().charAt(0);
        System.out.println("Введіть друге число");
        int b = scnr.nextInt();
        double result;


        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '/':
                result = a / b;
                break;
            case '*':
                result = a * b;
                break;
            case '^':
                result = Math.pow(a, b);
                break;
            case '%':
                result = a % b;
                break;
            default:  System.out.println("Помилка у знаці математичної дії");
            return;
        }

            System.out.println("Результат" + " " + a + " " + operation + " " + b + " = " + result);
        }
    }



