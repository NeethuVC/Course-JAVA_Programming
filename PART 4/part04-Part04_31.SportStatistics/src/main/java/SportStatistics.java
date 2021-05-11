
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       
        
        System.out.println("Filename:");
        String file = scan.nextLine();
        
        
        System.out.println("Team:");
        String team = scan.nextLine();
        int count = 0, win = 0, loss = 0;
        
        try ( Scanner scanner = new Scanner(Paths.get(file))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] parts = line.split(",");
                String name = parts[0];
                int g1 = Integer.valueOf(parts[2]);
                int g2 = Integer.valueOf(parts[3]);
                String name1 = parts[1];
                if (name.equals(team)) {
                    count++;
                    if (g1 > g2) {
                        win++;
                    } else if (g1 < g2) {
                        loss++;
                    }
                }

                if (name1.equals(team)) {
                    count++;
                    if (g2 > g1) {
                        win++;
                    } else if (g2 < g1) {
                        loss++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Games: "+count);
        System.out.println("Wins: "+win);
        System.out.println("Losses: "+loss);

    }

}
