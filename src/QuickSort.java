import java.util.Random;

public class QuickSort {
	
	private int[] nums;
	
	public QuickSort (int[] nums) {
		this.nums = nums;
	}
	
	
	public void showResult() {
		for(int i=0; i<nums.length; ++i) {
			System.out.println(nums[i]);
		}
	}
	
	public void quicksort(int low, int high) {
		if(low >= high) return;
		
		int pivot = partition(low, high);
		quicksort(low, pivot-1);
		quicksort(pivot+1, high);
	}
	public void swap(int i, int j) {
		int tempo = nums[i];
		nums[i] = nums[j];
		nums[j] = tempo;
	}
	
	public void sort() {
		quicksort(0, nums.length-1);
	}
	
	public int partition(int low, int high) {
		int pivotIndex = (low+high)/2;
		swap(pivotIndex,high);
		
		int i = low;
		
		for(int j=low;j<high;j++) {
			if(nums[j]<= nums[high]) {
				swap(i,j);
				i++;
				
			}
		}
		swap(i,high);
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		int[] nums = new int[3000];
		
		for(int j = 0; j<nums.length; j++) {
			nums[j] = random.nextInt(10000) - 500;
		}
		QuickSort quicksort = new QuickSort(nums);
		quicksort.sort();
		quicksort.showResult();
	}

}
