
import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.print("Search for? ");
        int searching = Integer.valueOf(scanner.nextLine());
        int f = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searching) {
                f++;
                System.out.print(array[i] + " is at index " + i+".");
            }
        }
        if (f == 0) {
            System.out.print(searching + " was not found.");
        }
        // Implement the search functionality here
    }

}
