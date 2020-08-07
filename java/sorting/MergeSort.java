import java.util.Arrays;

public class MergeSort {

    private static void merge(int [] leftArray, int [] rightArray, int [] mergedArray){
        int i = 0, j = 0 , k =0;

        int leftArraySize = leftArray.length;
        int rightArraySize = rightArray.length;

        while ( i < leftArraySize && j < rightArraySize){
            if(leftArray[i] < rightArray[j]){
                mergedArray[k++] = leftArray[i++];
            }
            else{
                mergedArray[k++] = rightArray[j++];
            }
        }

        while (i <  leftArraySize){
            mergedArray[k++] = leftArray[i++];
        }

        while(j < rightArraySize){
            mergedArray[k++] = rightArray[j++];
        }

    }

    private static void mergeSort(int [] array){

        int arraySize =  array.length;

        if(arraySize < 2)
            return;
        int midPoint = arraySize/2;
        
        int [] leftArray = getSlice(array, 0, midPoint );
        int [] rightArray = getSlice(array, midPoint, arraySize );
        mergeSort(leftArray);
        mergeSort(rightArray);
        System.out.println(String.format("working on leftArray %s rightArray %s", Arrays.toString(leftArray), Arrays.toString(rightArray)));
        merge(leftArray, rightArray, array);
        System.out.println(String.format("Performed merge on leftArray %s rightArray %s result %s", Arrays.toString(leftArray), Arrays.toString(rightArray), Arrays.toString(array)));

    }

    private static int[] getSlice(int[] array, int start, int end) {
       
        int slice [] = new int [end - start];

        for(int i=0 ; i < slice.length; i++){
            slice[i] = array[start + i];
        }
       
        return slice;
    }

    public static void main(String args[]){
        int testArray [] = {9,8,1,2,5,4,7,6};
        mergeSort(testArray);
    }
    
}