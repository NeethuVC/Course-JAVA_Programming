
import java.util.ArrayList;
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
public class Database {

    private ArrayList<Bird> birds;
    private Scanner scanner;

    public Database(Scanner sc) {
        birds = new ArrayList<>();
        scanner = sc;

    }

    public void add(Bird b) {
        birds.add(b);
    }

    public boolean addobservation(String name) {
        int flg=0;
        for(Bird b:birds){
            if(b.getName().equals(name)){
                b.addObservations();
                flg=1;
            }
        }
        if(flg==0){
            return false;
        }else{
            return true;
        }
       
    }

    public void print() {
        if (birds.isEmpty()) {

        } else {
            for (Bird b : birds) {
                System.out.println(b.toString());
            }
        }

    }

    public void printOne(String name){
        int flg=0;
        for(Bird b:birds){
            if(b.getName().equals(name)){
                System.out.println(b.toString());
                flg=1;
            }
        }
        if(flg==0){
             System.out.println("Not a bird!");
        }     
    }
}
