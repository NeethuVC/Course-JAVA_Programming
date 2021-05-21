
import java.util.ArrayList;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        int pos = -1, i = 0;
        for (Book b : books) {
            
            if (b.getId() == searchedId) {
                pos = i;
            }
            i++;
        }
        return pos;
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {

        int begin = 0;// the 0th index of the list (i.e, the first index of the list)

        int end = books.size() - 1 ;
        int middle;
        while(begin<=end){
            middle = (end + begin) / 2;
            if(books.get(middle).getId()==searchedId){
                return middle;
            }
            if(books.get(middle).getId()<searchedId){
                 begin = middle + 1;
            }
            if(books.get(middle).getId()>searchedId){
                end = middle - 1;
            }

        }
        return -1;
    }
}