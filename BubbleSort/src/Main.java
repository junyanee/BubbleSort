
public class Main {

	public static void main(String[] args) {
		// BubbleSort 버블정렬 O(n^2)

		int arr[] = {1, 10, 5, 6, 3, 2, 9, 7, 8, 4};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1 - i; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for (int k = 0; k < arr.length; k++) {
		System.out.println(arr[k]);
		}
	}

}
