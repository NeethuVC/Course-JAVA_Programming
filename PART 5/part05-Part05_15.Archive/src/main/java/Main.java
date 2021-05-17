
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
        while (true) {
            
            System.out.println("Identifier? (empty will stop)");
            String Identifier = scanner.nextLine();
             if (Identifier.isEmpty()) {
                break;
            }
             
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            Item item1 = new Item(Identifier,name);

            
            
          //  items.add(item1);
            
            
            if (items.contains(item1)) {
                
            } else {
                items.add(item1);
            }

        }
        System.out.println("==Items==");
        for(Item itm:items){
            System.out.println(itm);
        }
    }
}
