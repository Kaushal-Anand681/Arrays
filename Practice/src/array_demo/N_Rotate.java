package array_demo;

public class N_Rotate {

	public static void main(String[] args) {
		int[] arr = { -5, 7, 15, 2, 0 };
		int rotateDegree = -17;
		if (rotateDegree < 0) {
			rotateDegree *= -1;
			leftRotate(arr, rotateDegree);
		} else {
			rightRotate(arr, rotateDegree);
		}

	}

	private static void rightRotate(int[] arr, int rotateDegree) {
		int k = arr.length - (rotateDegree % arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[(i + k) % arr.length] + " ");
		}

	}

	private static void leftRotate(int[] arr, int rotateDegree) {
		int k = rotateDegree % arr.length;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[(i + k) % arr.length] + " ");
		}

	}

}
