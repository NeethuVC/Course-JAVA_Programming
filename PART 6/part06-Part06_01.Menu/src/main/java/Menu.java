
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal){
        if(meals.contains(meal)){
            
        }else{
             meals.add(meal);
        }
       
    }
    
    public void printMeals(){
        for(String value:meals){
            System.out.println(value);
        }
    }
    
    public void clearMenu() {
        meals.clear();
    }
    // implement the required methods here
}
