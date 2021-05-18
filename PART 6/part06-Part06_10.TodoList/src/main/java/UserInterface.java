
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface( TodoList sd,Scanner s) {
        todoList = sd;
        scanner = s;
    }
    public void start(){
         while (true) {
            System.out.print("Command:");
            String word = scanner.nextLine();

            if (word.equals("stop")) {
                break;
            }else if (word.equals("add")) {
                System.out.print("To add:");
                String task = scanner.nextLine();
                todoList.add(task); 
            }else if (word.equals("list")) {
                todoList.print();
            }else if (word.equals("remove")) {
                System.out.print("Which one is removed? ");
                int taskno = Integer.valueOf(scanner.nextLine());
                todoList.remove(taskno);
            }
            
            }
    }
}
