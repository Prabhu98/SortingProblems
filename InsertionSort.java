package Day10Dec2022_SortingProblems;

import java.util.Arrays;

import org.junit.Test;

public class InsertionSort {
	

    @Test
    public void insertionSort() {
        int[] arr = { 12, 11, 13, 5, 6 };
        insertionSort(arr);
      
    }
	
	
	/**
     * Pseudocode
     *
     * 1. Loop from 0 to length-1 of the array
     * 2. compare adjacent values, if left is greater than right, swap
     * 3. then find the apt position in the left sub-array, by swapping until its left is smaller than the current index
     */
	
	void insertionSort(int[] arr) {

        for( int i =0 ;i < arr.length-1;i++) {
            if(arr[i] > arr[i+1]) {
                swap(arr, i, i+1);
                int pointer = i;
                while(pointer > 0 && arr[pointer] < arr[ pointer-1]) {
                    if(arr[pointer] < arr[ pointer-1])
                        swap(arr, pointer, pointer-1);
                    pointer--;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    void swap(int[] arr, int index1 ,int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
