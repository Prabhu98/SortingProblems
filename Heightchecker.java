package Day10Dec2022_SortingProblems;

import org.junit.Test;

public class Heightchecker {
	
	
	@Test
    public void insertionSort() {
        int[] arr = { 1,1,4,2,1,3};
        int heightChecker = heightChecker(arr);
        System.out.println(heightChecker);
      
    }
	
	 public int heightChecker(int[] heights) {

		    int[] s1 = heights.clone();
		 
	        for(int i=0;i<s1.length-1;i++){
	            if(heights[i] > heights[i+1])
	              swap(heights,i,i+1);
	              int pointer =i;
	              while(pointer > 0 && heights[pointer] <heights[pointer-1]){
	                  if(heights[pointer] < heights[pointer-1]){
	                      swap(heights,pointer,pointer-1);
	                      pointer--;
	                  }
	              }  
	        }
		       
	          
	        int[] a1 = s1.clone();
	        int count=0;
	        for(int i=0;i<heights.length;i++) {
	        	 if(heights[i] != a1[i])
	             {
	                 count++;
	             }
	        }
			return count;
			

	    }


	    public void swap(int[] nums,int index1 ,int index2){
	        int temp = nums[index1];
	        nums[index1] = nums[index2];
	        nums[index2] = temp;
	        
	    }

}
