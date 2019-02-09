import java.util.Random;

public class MergeSort {
	private int[] nums;
	private int[] temp;
	
	public MergeSort (int[] nums) {
		this.nums = nums;
		temp = new int[nums.length];
	}
	
	//Se crean los metodos necesarios para Merge Sort
	public void mergeSort(int low, int high) {
		if(low>= high) {
			return;
		}
		int middle = (low + high)/2;
		
		mergeSort(low,middle);
		mergeSort(middle + 1, high);
		merge(low,middle,high);
	}
	
	public void showResult() {
		for(int i=0; i<nums.length; ++i) {
			System.out.println(nums[i]);
		}
	}
	
	private void merge(int low, int middle, int high) {
		for (int i = low; i <= high; i++) {
			temp[i] = nums[i];
		}
		
		int i = low;
		int j = middle + 1;
		int k = low;
		
		while((i <= middle) && (j <= high)) {
			if(temp[i] <= temp[j]) {
				nums[k] = temp[i];
				i++;
			}else {
				nums[k] = temp[j];
				j++;
			}
			k++;
		}
		
		while (i <= middle) {
			nums[k] = temp[i];
			k++;
			i++;
		}
		
		while(j <= high) {
			nums[k] = temp[j];
			k++;
			j++;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			Random random = new Random();
			int[] nums = new int[3000];
			
			for(int j = 0; j<nums.length; j++) {
				nums[j] = random.nextInt(10000) - 500;
			}
				MergeSort mergeSort = new MergeSort(nums);
				mergeSort.mergeSort(0, nums.length - 1);
				mergeSort.showResult();
			

		

	}

}
