package com.vsstech.basicds.sorting;

import java.util.Arrays;

public class QuickSort{

    private static int partition(int [] array, int lowerBound, int upperBound){
        
        int pivot = array[lowerBound];
        int start = lowerBound;
        int end = upperBound;
        System.out.println();
        System.out.println("-----------parition begin----------");
        System.out.println("Pivot "+ pivot);
        System.out.println("Array to be partitioned ");
        for(int i= lowerBound; i <=upperBound ; i++){
            if(i == upperBound){
                System.out.println(array[i]);
            }
            else{
                System.out.print(array[i] + ",");
            }
        }
        while(start < end){
            while(start < upperBound && array[start] <= pivot){
                start++;
            }
            while(array[end] > pivot){
                end--;
            }

            if(start < end){
                swap(array, start, end);
            }
        }

        swap(array, lowerBound, end);
        System.out.println("array " + Arrays.toString(array) );
        System.out.println(String.format("Pivot %d found its location %d", pivot, end));
        System.out.println("-----------parition end----------");
        System.out.println();

        return end;




    }

    private static void swap(int[] array, int start, int end) {
        System.out.println();
        System.out.println("-----SWAP BEGIN---------");
        System.out.println("Swapping "+ array[start] + " with " + array[end]);
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        System.out.println("-----SWAP END--------");
        System.out.println();
    }

    private static void quickSort(int [] testArray, int lowerBound, int upperBound){
        if(lowerBound < upperBound){
            int loc = partition(testArray, lowerBound, upperBound);
            quickSort(testArray, lowerBound, loc - 1);
            quickSort(testArray, loc+1, upperBound);
        }
    
    }
    public static void main(String args[]){
        int testArray [] = {9,8,1,2,5,4,7,6};
        quickSort(testArray, 0, testArray.length-1);

    }
}