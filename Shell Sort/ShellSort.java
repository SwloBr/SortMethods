//Implementation of ShellSort 
class ShellSort { 

	int helper(int arr[], int n) { 

		for (int i = n/2; i > 0; i /= 2) { 
			for (int j = i; j < n; j += 1) { 
				int temp = arr[j]; 
				int k; 
				for (k = j; k >= i && arr[k - i] > temp; k -= i) 
					arr[k] = arr[k - i]; 

				arr[k] = temp; 
			} 
		} 
		return 0; 
	} 

    static void printArray(int arr[], int n) {  
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i] + " "); 
		System.out.println(); 
	} 

	public static void main(String args[]) 
	{ 
		int arr[] = {100, 25, 17, 34, 26}; 
        int n = arr.length;
		System.out.print("Array before sorting: "); 
		printArray(arr, n); 

		ShellSort SS = new ShellSort(); 
		SS.helper(arr, n); 

		System.out.print("Array after sorting:"); 
		printArray(arr, n); 
	} 
} 
