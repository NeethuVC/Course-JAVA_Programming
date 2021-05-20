
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        Database db=new Database(scan);
        while (true) {
            System.out.print("? ");
            String input = scan.nextLine();
            if (input.equals("Quit")) {
                break;
            } else if (input.equals("Add")) {

                System.out.println("Name:");
                String name = scan.nextLine();
                System.out.println("Name in Latin: ");
                String nameltn = scan.nextLine();
                Bird b=new Bird(name,nameltn);
                db.add(b);
            }else if (input.equals("Observation")) {
                System.out.println("Bird?");
                String bird = scan.nextLine();
                
                if(db.addobservation(bird)){
                    
                }else{
                    System.out.println("Not a bird!");
                } 
             }else if (input.equals("All")) {
                 db.print();
             }else if (input.equals("One")) {
                System.out.println("Bird?");
                String bird = scan.nextLine();
                db.printOne(bird);
             }

        }

    }

}
