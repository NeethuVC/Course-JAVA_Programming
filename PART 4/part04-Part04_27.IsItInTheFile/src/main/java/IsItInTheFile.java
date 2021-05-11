
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int flag = 0, f = 0;
        System.out.println("Name of the file:");
        String file = scanner1.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner1.nextLine();

        try ( Scanner scanner = new Scanner(Paths.get(file))) {
            f = 1;
            // we read all the lines of the file
            while (scanner.hasNextLine()) {
                if (searchedFor.equals(scanner.nextLine())) {
                    flag = 1;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        if (f == 0) {
            System.out.println("Reading the file nonexistent.txt failed.");
        } else {
            if (flag == 1) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
        }

    }
}
