/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.util.ArrayList;
public class Hold {
    private int maxweigh;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int w){
        maxweigh=w;
        suitcases=new ArrayList<>();
    }
    public void addSuitcase(Suitcase suitcase){
        int total=0;
        for(Suitcase w:suitcases){
            total+=w.totalWeight();
        }
        if(total+suitcase.totalWeight()<=maxweigh){
            suitcases.add(suitcase);
        }
        
    }
    public String toString() {
        int total=0;
        for(Suitcase w:suitcases){
            total+=w.totalWeight();
        }
        if(suitcases.size()==0){
            return "no suitcases ("+total+" kg)";
        }else if(suitcases.size()==1){
            return suitcases.size()+" suitcase ("+total+" kg)";
        }else{
            return suitcases.size()+" suitcases ("+total+" kg)";
        }
    }
    public void printItems(){
         for(Suitcase w:suitcases){
             w.printItems();
        }
    }
}
