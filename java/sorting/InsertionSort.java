import java.util.Arrays;

public class InsertionSort {


    public static void main(String args[]){

        //int testArray [] = {9,8,1,2,5,4,7,6};
        int testArray [] = {4, -31, 0, 99, 83, 1};
        insertionSort(testArray);

    }

    private static void insertionSort(int[] array) {

        int n = array.length;
        int i = 0, j = 0;
        // Traverse through length of array, starting with the element at index 0.
        for(i=0 ; i < n ; i ++){
            // Our current place in the unsorted portion of the array.
            // currentUnsortedItem is the item we will be moving into the "sorted" subset of our array.
            int currentUnsortedItem = array[i];
            System.out.println("Current UnsortedItem is Currently "+ currentUnsortedItem);

            // Iterate through sorted items.
            // If the current unsorted item is smaller than the item to its left,
           // move the current item back one position in the array.
            // This loop will never run for the very first unsorted item at index 0.
            for(j=i ; j > 0 && currentUnsortedItem < array[j-1] ; j --){
                System.out.println(currentUnsortedItem + "<" + array[j-1] + " is " + (currentUnsortedItem < array[j - 1]));
                // Shift item left in the sorted subset of the array.
                array[j] = array[j - 1];
                System.out.println(" ** inserting " + array[j - 1] + " at index " + j);

            }

             // Shift item to the right in the sorted subset fo the array.
        array[j] = currentUnsortedItem;
        System.out.println("** inserting " + currentUnsortedItem + " at index " + j);
        
        System.out.println("array is now: " + Arrays.toString(array));
        }
        System.out.println("final sorted array is : " + Arrays.toString(array));

    }
    
}