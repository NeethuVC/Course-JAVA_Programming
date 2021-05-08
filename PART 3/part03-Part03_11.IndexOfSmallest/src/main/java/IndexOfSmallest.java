
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            list.add(input);
        }
        int sml = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if (sml > number) {
                sml = number;
            }
        }
        System.out.println("Smallest number: "+sml);
        for (int i = 0; i < list.size(); i++) {
            if (sml == list.get(i)) {
                System.out.println("Found at index: " + i);
            }
        }

    }
}
