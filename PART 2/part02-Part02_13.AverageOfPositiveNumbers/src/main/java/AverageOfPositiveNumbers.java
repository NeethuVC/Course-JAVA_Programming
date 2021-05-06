
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int sum = 0;
        int input;
        while (true) {
            input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            }

            if (input > 0) {
                i++;
                sum = sum + input;
            }

        }
        if (sum == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((double) (1.0 * sum / i));
        }

    }
}
