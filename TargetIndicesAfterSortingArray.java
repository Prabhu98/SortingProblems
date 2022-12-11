package Day10Dec2022_SortingProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TargetIndicesAfterSortingArray {

	@Test
	public void insertionSort() {
		int[] arr = { 1, 2, 5, 2, 3 };
		int target = 2;
		List<Integer> heightChecker = targetIndices(arr, target);
		System.out.println(heightChecker);

	}

	public List<Integer> targetIndices(int[] nums, int target) {
		List<Integer> lst = new ArrayList<Integer>();

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				swap(nums, i, i + 1);
				int pointer = i;
				while (pointer > 0 && nums[pointer] < nums[pointer - 1]) {
					if (nums[pointer] < nums[pointer - 1]) {
						swap(nums, pointer, pointer - 1);
						pointer--;
					}
				}
			}

		}
		System.out.println(Arrays.toString(nums));
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] == target) {
				   lst.add(j);
			}
		}

		return lst;

	}

	public void swap(int[] nums, int index1, int index2) {
		int temp = nums[index1];
		nums[index1] = nums[index2];
		nums[index2] = temp;

	}

}
