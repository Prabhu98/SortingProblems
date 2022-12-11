package Day10Dec2022_SortingProblems;

import java.util.Arrays;

import org.junit.Test;

public class SortPeople {
	
	/* HashMap<Integer,String> hmap = new HashMap<>();

        for(int i=0;i<names.length;i++){
            hmap.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        String[] res = new String[heights.length];
        int index =0;

        for(int i=heights.length-1;i>=0;i--){
            res[index] = hmap.get(heights[i]);
            index++;
        }
       return res;
	 * 
	 * 
	 * 
	 * 
	 */

	@Test
	public void insertionSort() {
		String[] arr = { "Mary", "John", "Emma" };
		int[] heights = { 180, 165, 170 };
		String[] sortpe = sortPeople(arr, heights);
		System.out.println(Arrays.toString(sortpe));

	}

	public String[] sortPeople(String[] names, int[] heights) {

		for (int i = 0; i < heights.length - 1; i++) {
			for (int j = 0; j < heights.length - i - 1; j++) {
				if (heights[j] < heights[j + 1]) {
					int tempheights = heights[j];
					heights[j] = heights[j + 1];
					heights[j + 1] = tempheights;

					String temp = names[j];
					names[j] = names[j + 1];
					names[j + 1] = temp;
				}
			}

		}
		return names;

	}

}
