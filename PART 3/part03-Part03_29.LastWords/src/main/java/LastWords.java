
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String strng = scanner.nextLine();
            if (strng.equals("")) {
                break;
            }
            String[] pieces = strng.split(" ");
            System.out.println(pieces[pieces.length-1]);

        }

    }
}
