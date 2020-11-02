package array_demo;

public class FindMax {

	public static void main(String[] args) {
		int[] arr = { -5, 7, 15, 2, 0, 20, 50, 65, 83, 38, 67 };
		System.out.println(findMax(arr));
	}

	private static int findMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int x : arr) {
			if (x > max)
				max = x;
		}
		return max;
	}

}
