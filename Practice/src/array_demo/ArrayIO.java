package array_demo;

import java.util.Scanner;

public class ArrayIO {

	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Let's take input first");
		System.out.println("rows ?");
		int row = scn.nextInt();
		System.out.println("column ?");
		int col = scn.nextInt();
		int[][] arr = new int[row][col];
		System.out.println("Please fill the array");
		takeInput(arr,row,col);
		display(arr);

	}

	private static void takeInput(int[][] arr, int row, int col) {
		for(int i = 0;i < row;i++) {
			for(int j = 0;j < col;j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		
	}
	
	private static void display(int[][] arr) {
		for(int i = 0;i < arr.length;i++) {
			for(int j = 0;j < arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
