
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Statistics statistics = new Statistics();
        Statistics statisticseEven = new Statistics();
        Statistics statisticsOdd = new Statistics();
        
        System.out.println("Enter numbers:");
        while(true){
            int num=Integer.valueOf(scanner.nextLine());
            if(num==-1){
                break;
            }
            statistics.addNumber(num);
            if(num%2==0){
                statisticseEven.addNumber(num);
            }else{
                statisticsOdd.addNumber(num);
            }
        }
        
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
        System.out.println("Sum of even numbers:" + statisticseEven.sum());
        System.out.println("Sum of odd numbers:" + statisticsOdd.sum());
    }
}
