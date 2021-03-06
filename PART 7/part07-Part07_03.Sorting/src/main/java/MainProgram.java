
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
         MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int small = array[0];
        for (int i = 1; i < array.length; i++) {
            if (small > array[i]) {
                small = array[i];
            }
        }
        return small;
    }

    public static int indexOfSmallest(int[] array) {

        int small = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (small > array[i]) {
                small = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int small = table[startIndex];
        int index = startIndex;
        for (int i = startIndex + 1; i < table.length; i++) {
            if (small > table[i]) {
                small = table[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int intrmt = array[index1];
        array[index1] = array[index2];
        array[index2] = intrmt;
    }

    public static void sort(int[] array) {
        
        int sml,smlindex;
        
        for(int i=0;i<array.length;i++){
            System.out.println(Arrays.toString(array));
            sml=smallest(array);
            smlindex=indexOfSmallestFrom(array,i);
            swap(array, i, smlindex);
        }

    }
}
