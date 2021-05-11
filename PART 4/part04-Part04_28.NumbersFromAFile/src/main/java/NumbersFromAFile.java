
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int count=0;
        System.out.print("File? ");
        String file = scanner1.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner1.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner1.nextLine());
        
        try ( Scanner scanner = new Scanner(Paths.get(file))) {
           
            while (scanner.hasNextLine()) {
                int value=Integer.valueOf(scanner.nextLine());
                if (lowerBound<=value && value<=upperBound) {
                    count++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Numbers: "+count);
    }

}
