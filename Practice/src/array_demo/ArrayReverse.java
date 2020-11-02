package array_demo;

public class ArrayReverse {

	public static void main(String[] args) {
		int[] arr = { -5, 7, 15, 2, 0, 20, 50, 65, 83, 38, 67 };
		reverse(arr);

	}

	private static void reverse(int[] arr) {
		int first = 0;
		int last = arr.length - 1;
		while (first < last) {
			int temp = arr[first];
			arr[first] = arr[last];
			arr[last] = temp;
			first++;
			last--;
		}

		for (int x : arr) {
			System.out.print(x + " ");
		}
	}

}
