
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            //System.out.print("First name: ");
            String name = scanner.nextLine();
             if (name.isEmpty()) {
                break;
            }
           // System.out.print("Last name: ");
            String nameLast = scanner.nextLine();
            //System.out.print("Identification number: ");
            String number = scanner.nextLine();
            
           
            infoCollection.add(new PersonalInformation(name,nameLast,number));
        }
        for(PersonalInformation item : infoCollection) {
            System.out.println(item.getFirstName()+" "+item.getLastName());
        }

    }
}
