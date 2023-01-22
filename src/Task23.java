import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Введіть число");
        int a = scnr.nextInt();
        if (a >= 1 && a <= 12) {
            System.out.println("доброго ранку");
        } else if (a > 12 && a <= 22) {
            System.out.println("доброго дня");
        } else {
            System.out.println("доброї ночі");
        }
    }
}
