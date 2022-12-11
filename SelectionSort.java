package Day10Dec2022_SortingProblems;

import java.util.Arrays;

import org.junit.Test;

public class SelectionSort {
	
	
	@Test
	public void td1() {
		int [] nums = new int [] {5, 2, 8, 7, -1};
		isSortArray(nums);
	}
	
	/*
	 * @Test public void td2() { int [] nums = new int [] {120,132,-1,3,4};
	 * isSortArrayDesc(nums); }
	 */
	
	  public void isSortArray(int[] nums) {
		  for(int i=0;i<nums.length-1;i++) {
			  int temp =i;
			  for(int j=i+1;j<nums.length;j++) {
				  if(nums[j] > nums[temp])
				  temp = j;
			  }
			  
			  if(temp != i) {
			   int res = nums[temp];
	           nums[temp] = nums[i];
	           nums[i] = res;
			  }
		  }
		  
		  System.out.println(Arrays.toString(nums));  
	  }
	  
	  public void isSortArrayDesc(int[] nums) {
		  
	  }

}
