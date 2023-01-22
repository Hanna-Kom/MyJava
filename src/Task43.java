import java.util.Scanner;

public class Task43 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Введіть число");
        int a = scnr.nextInt();

        for (int i = 1; i <= a; i++) {
            sum = sum + i;

        }
        System.out.println(sum);
    }
}



