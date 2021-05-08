
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String strng = scanner.nextLine();
            if (strng.equals("")) {
                break;
            }
            String[] pieces = strng.split(" ");
            System.out.println(pieces[0]);

        }

    }
}
