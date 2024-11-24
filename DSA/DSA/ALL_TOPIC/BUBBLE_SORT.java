package ALL_TOPIC;

import java.util.Scanner;

public class BUBBLE_SORT {
// O(n^2) n sqaure.
	
	public static void bubbleSort(int[] ar) {
		int temp = 0;
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar.length-i-1;j++) { // after every iteration i + items value sorted 
				if(ar[j] > ar[j+1]) {
					 temp = ar[j];
					 ar[j] = ar[j+1];
					 ar[j+1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int[] ar = {6,5,2,8,9,4};
		System.out.println("Original Array");
		for(int arr : ar) {
			System.out.print(arr+" ");
		}
		System.out.println();
		System.out.println("Sorted Array");
		bubbleSort(ar);
		for(int arr : ar) {
			System.out.print(arr+" ");
		}
		
	}

}
