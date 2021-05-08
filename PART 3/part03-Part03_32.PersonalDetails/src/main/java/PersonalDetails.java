
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0,stcount=0;
        String name="";
        double year=0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            if ( parts[0].length()> stcount) {
                stcount = parts[0].length();
                name=parts[0];
            }
            count++;
            year=year+Integer.valueOf(parts[1]);
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + 1.0*year/count);

    }
}
