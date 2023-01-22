import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Введіть 3 числа");
        double a = scnr.nextInt();
        double b = scnr.nextInt();
        double c = scnr.nextInt();


        double smallest = Math.min(a, Math.min(b, c));
        System.out.println("Мінімальне" + " " + smallest);

        double largest = Math.max(a, Math.max(b, c));
        System.out.println("Максимальне" + " " + largest);

        double middle = (a + b + c)/3;
        System.out.println("Середнє" + " " + middle);
    }
}

