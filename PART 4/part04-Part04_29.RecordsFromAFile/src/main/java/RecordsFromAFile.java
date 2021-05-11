
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Name of the file: ");
        String file = scanner1.nextLine();
        try ( Scanner scanner = new Scanner(Paths.get(file))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                System.out.println( name+","+age+" years");
                
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
