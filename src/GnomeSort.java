//Extraido de https://www.geeksforgeeks.org/gnome-sort-a-stupid-one/
import java.util.Random; 
public class GnomeSort { 
	static void gnomeSort(int arr[], int n) 
	{ 
		int index = 0; 

		while (index < n) { 
			if (index == 0) 
				index++; 
			if (arr[index] >= arr[index - 1]) 
				index++; 
			else { 
				int temp = 0; 
				temp = arr[index]; 
				arr[index] = arr[index - 1]; 
				arr[index - 1] = temp; 
				index--; 
			} 
		} 
		return; 
	} 

	// Driver program to test above functions. 
	public static void main(String[] args) 
	{ 
		Random random = new Random();
		int[] nums = new int[3000];
		
		for(int j = 0; j<nums.length; j++) {
			nums[j] = random.nextInt(10000) - 500;
		}
		gnomeSort(nums, nums.length); 

		for(int i=0; i<nums.length; ++i) {
			System.out.println(nums[i]);
		}
	} 
} 


