
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.print("\n");

        // System.out.print("\n");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }

    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int j = 1;
        for (int i = size; i > 0; i--) {
            printSpaces(size - j);
            printStars(j);
            j++;
        }

    }

    public static void christmasTree(int height) {
        int od = 1;
        for (int h = 1; h <= height; h++) {
            //for (int i = height/2; i > 0; i--) {
            printSpaces(height - (h));
            printStars(od);
            od += 2;
        }
        printSpaces(od/2-2);
        printStars(3);
        printSpaces(od/2-2);
        printStars(3);
        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
