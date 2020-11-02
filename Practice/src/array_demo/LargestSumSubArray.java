package array_demo;

public class LargestSumSubArray {

	public static void main(String[] args) {
		int[] arr = { 3, 5, -9, 1, 3, -2, 3, 4, 7, 2, -9, 6, 3, 1, -5, 4 };
		System.out.println(largestSum(arr));

	}

	private static int largestSum(int[] arr) {
		int maxEndingHere = arr[0];
		int maxSoFar = maxEndingHere;
		for(int i = 1;i < arr.length;i++) {
			maxEndingHere = Math.max(maxEndingHere + arr[i], arr[i]);
			maxSoFar = Math.max(maxSoFar, maxEndingHere);
		}
		return maxSoFar;
	}

}
