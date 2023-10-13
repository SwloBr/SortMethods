//Implementing Bubble Sort 

class BubbleSort {
	
	static void bubbleSort(int arr[], int n) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	static void printArray(int arr[], int size) {
		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		int arr[] = { 89, 15, 7, 25, 17, 4, 16 };
        System.out.print("Array before sorting: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
		int n = arr.length;
		bubbleSort(arr, n);
		System.out.print("Array after sorting: ");
		printArray(arr, n);
	}
}
