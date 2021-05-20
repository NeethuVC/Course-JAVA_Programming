
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();
        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            } else {
                if (input.isEmpty()) {

                } else {
                    String[] parts = input.split(" ");
                    String command = parts[0];
                    int amount = Integer.valueOf(parts[1]);
                    if (command.equals("add")) {
                        first.add(amount);
                    } else if (command.equals("move")) {

                        String amtS = first.toString();
                        String[] parts1 = amtS.split("/");
                        int amt = Integer.valueOf(parts1[0]);

                        if (amount <= amt) {
                            first.remove(amount);
                            second.add(amount);
                        } else {
                            first.remove(amount);
                            second.add(amt);
                        }
                    } else if (command.equals("remove")) {
                        second.remove(amount);

                    }
                }
            }

        }

    }

}
