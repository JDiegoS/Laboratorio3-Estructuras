public class Sort {
	
	private int[] nums;
	private int[] temp;
	
	public Sort (int[] nums) {
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
	
	
	
	
	//Se crean los metodos necesarios para Quick Sort
	
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
	
		
}
