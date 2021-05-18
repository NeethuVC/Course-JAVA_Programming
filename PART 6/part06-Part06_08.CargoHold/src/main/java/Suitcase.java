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
public class Suitcase {
    
    private int weight;
    private ArrayList<Item> items;
    
    public Suitcase(int w){
        weight=w;
        items = new ArrayList<>();
    }
    public void addItem(Item item){
        
        int total=0;
        for(Item w:items){
            total+=w.getWeight();
        }
        
        if(total+item.getWeight()<=weight)
        {
            items.add(item);
        }
        
    }
    public String toString(){
        
        int total=0;
        for(Item w:items){
            total+=w.getWeight();
        }
        if(items.size()==0){
            return "no items ("+total+" kg)";
        }else if(items.size()==1){
            return items.size()+" item ("+total+" kg)";
        }else{
            return items.size()+" items ("+total+" kg)";
        }
    
    }
    
    public void printItems(){
         for(Item w:items){
             System.out.println(w.toString());
        }
    } 
    
    public int totalWeight(){
        int total=0;
        for(Item w:items){
            total+=w.getWeight();
        }
        return total;
    }
    
    public Item heaviestItem(){
        if (items.isEmpty()) {
            return null;
        }
        Item heaviest=items.get(0);
        for (int i=1;i<items.size();i++) {
           if(heaviest.getWeight()<items.get(i).getWeight()){
               heaviest=items.get(i);
           }
        }
        return heaviest;
    }
    
    
}
