
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
           // System.out.print("Title: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
           // System.out.print("Pages: ");
            int Pages = Integer.valueOf(scanner.nextLine());

           // System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());

            books.add(new Book(name, Pages, year));
        }
        //System.out.println("What information will be printed? ");
        String option = scanner.nextLine();

        switch (option) {
            case "name":
                for (Book item : books) {
                    System.out.println(item.getTitle());
                };
                break;
            case "everything":
                for (Book item : books) {
                    System.out.println(item);
                };
                break;
        }

    }

}

