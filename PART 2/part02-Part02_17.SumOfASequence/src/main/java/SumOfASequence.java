
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int input = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        int i = 1;
        while (i <= input) {
            sum += i;
            i++;
        }

        System.out.println("The sum is "+sum);

    }
}