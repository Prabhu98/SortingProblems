package Day10Dec2022_SortingProblems;

import java.util.Arrays;

import org.junit.Test;

public class BubbleSortJava {
	
	
	
	@Test
	public void td1() {
		int [] nums = new int [] {2, 5, 8, 7, 1,3,6};
		isSortArrayAsc(nums);
	}
	
	@Test
	public void td2() {
		int [] nums = new int [] {120,132,-1,3,4};
		isSortArrayAsc(nums);
	}
	

    public void isSortArray(int[] nums) {
    	
    	  
    	int temp =0;
    	for(int i=0;i<nums.length;i++) {
    		for(int j=i+1;j<nums.length;j++) {
    			if(nums[i] > nums[j]) {
    				temp = nums[j];
    				nums[j] = nums[i];
    				nums[i] = temp;
    			}
    		}
    	}
    	
    	System.out.println(Arrays.toString(nums));
	}
    	
    public void isSortArrayDesc(int[] nums) {
    	
  	  
    	int temp =0;
    	for(int i=0;i<nums.length;i++) {
    		for(int j=i+1;j<nums.length;j++) {
    			if(nums[i] < nums[j]) {
    				temp = nums[j];
    				nums[j] = nums[i];
    				nums[i] = temp;
    			}
    		}
    	}
    	
    	System.out.println(Arrays.toString(nums));
	}
    	
    
    /*
     * outer loop from o to n-1 ( if we do till n, we get index bound exception, as n and its adjacent is being considered)
     * inner loop from 0 to n-1-i(we are finalizing the highest number first, so reducing the range from right side of the array)
     * consider j and j+1, if j is largest, swap.
     */
    
    public void isSortArrayAsc(int[] nums) {
    	
        int temp =0;
        int n = nums.length;
        
    	for(int i=0;i<n;i++) {
    		int n1 = nums.length-1;
    		for(int j=0;j<n1;j++) {
    			if(nums[j] > nums[j+1]) {
    				temp = nums[j];
    				nums[j] = nums[j+1];
    				nums[j+1] = temp;
    			}
    		}
    	}
    	
    	System.out.println(Arrays.toString(nums));
	}

    
    	
    	
    }

