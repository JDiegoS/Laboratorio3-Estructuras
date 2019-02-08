import java.util.Random;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			Random random = new Random();
			int[] nums = new int[3000];
			
			for(int j = 0; j<nums.length; j++) {
				nums[j] = random.nextInt(10000) - 500;
			}
				Sort mergeSort = new Sort(nums);
				mergeSort.mergeSort(0, nums.length - 1);
				mergeSort.showResult();
			

		

	}

}
