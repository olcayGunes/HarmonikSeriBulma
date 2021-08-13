import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double number, i = 1, result = 0;

        System.out.print("Sayı: ");
        number = input.nextInt();

        while (i <= number) {
            result += 1 / i;
            i++;
        }
        System.out.println(number + " sayısının harmonik serisi: " + result);
    }
}
