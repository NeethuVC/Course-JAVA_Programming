/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.util.Scanner;

public class TextUI {

    private SimpleDictionary simpleDictionary;
    private Scanner scanner;

    public TextUI(Scanner s, SimpleDictionary sd) {
        simpleDictionary = sd;
        scanner = s;
    }

    public void start() {
        while (true) {
            System.out.print("Command:");
            String word = scanner.nextLine();

            if (word.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }else if (word.equals("add")) {
                
                System.out.print("Word:");
                String wrd=scanner.nextLine();
                
                System.out.print("Translation:");
                String Translation=scanner.nextLine();
                
                simpleDictionary.add(wrd, Translation);
                
            }else if (word.equals("search")) {
                System.out.print("Word:");
                String wrd=scanner.nextLine();
               
                if(simpleDictionary.translate(wrd)==null){
                    System.out.println("Word "+wrd+" was not found");
                }
                else{
                    System.out.println("Translation:"+simpleDictionary.translate(wrd));
                }
                
            }
            else{
                System.out.println("Unknown command");
            }

        }

    }
}
