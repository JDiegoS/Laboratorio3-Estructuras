import java.util.Random;

// Java program for implementation of Bubble Sort 
class BubbleSort 
{ 
	void bubbleSort(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i = 0; i < n-1; i++) 
			for (int j = 0; j < n-i-1; j++) 
				if (arr[j] > arr[j+1]) 
				{ 
					// swap arr[j+1] and arr[i] 
					int temp = arr[j]; 
					arr[j] = arr[j+1]; 
					arr[j+1] = temp; 
				} 
	} 

	// Driver method to test above 
	public static void main(String args[]) 
	{ 
		Random random = new Random();
		int[] nums = new int[3000];
		
		for(int j = 0; j<nums.length; j++) {
			nums[j] = random.nextInt(10000) - 500;
		}
		BubbleSort ob = new BubbleSort(); 
		
		ob.bubbleSort(nums); 

		for(int i=0; i<nums.length; ++i) {
			System.out.println(nums[i]);
		}
	} 
} 

