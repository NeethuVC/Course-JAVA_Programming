
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here -- consider breaking the program into 
        // multiple classes.
        System.out.println("Enter point totals, -1 stops:");
        int num, total = 0, i = 0, passtotal = 0, j = 0;
        int star1 = 0, star2 = 0, star3 = 0, star4 = 0, star5 = 0, star0 = 0;

        while (true) {

            num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                break;
            }

            if (num > 0 && num <= 100) {
                i++;
                total += num;
                if (num >= 50) {
                    j++;
                    passtotal += num;
                }

                if (num < 50) {
                    star0++;
                } else if (num < 60) {
                    star1++;
                } else if (num < 70) {
                    star2++;
                } else if (num < 80) {
                    star3++;
                }else if (num < 90) {
                    star4++;
                }else if (num >= 90) {
                    star5++;
                }

            }
        }

        double avg = (double) (1.0 * total) / i;
        if (i > 0) {
            System.out.println("Point average (all): " + avg);
        } else {
            System.out.println("Point average (all): -");
        }

        double avgpass = (double) (1.0 * passtotal) / j;
        if (j > 0) {
            System.out.println("Point average (passing): " + avgpass);
        } else {
            System.out.println("Point average (passing): -");
        }

        if (i != 0) {
            double ps = 1.0 * 100 * j / i;
            System.out.println("Pass percentage: " + ps);
        } else {
            System.out.println("Pass percentage: 0.0");
        }
        
        System.out.print("5:");
        if(star5!=0){
           star(star5);
        }
        System.out.print("\n");
        System.out.print("4:");
         if(star4!=0){
           star(star4);
        }
        System.out.print("\n");
        System.out.print("3:");
         if(star3!=0){
           star(star3);
        }
       System.out.print("\n");
        System.out.print("2:");
         if(star2!=0){
           star(star2);
        }
         System.out.print("\n");
        System.out.print("1:");
        if(star1!=0){
           star(star1);
        }
      System.out.print("\n");
        System.out.print("0:");
        if(star0!=0){
           star(star0);
        }
        
        

    }
    
    public static void star(int n){
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
       
    }
}
