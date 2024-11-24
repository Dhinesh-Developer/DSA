package ALL_TOPIC;

import java.util.Scanner;

public class SELECTION_SORT {
	public static void selectionSort(int[] ar) {
		int minIndex = -1;
		int temp=0;
		for(int i=0;i<ar.length-1;i++) {
			minIndex = i;
			for(int j=i+1;j<ar.length;j++) {
				if(ar[minIndex] > ar[j]) {
					minIndex = j;
				}
				temp = ar[minIndex];
				ar[minIndex] = ar[i];
				ar[i] = temp;
				/*
				 * System.out.println();
				for(int arr : ar) {
					System.out.print(arr+" ");
				}
				 */
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
		
		selectionSort(ar);
		System.out.println();
		System.out.println("Sorted Array");
		for(int arr : ar) {
			System.out.print(arr+" ");
		}
	}

}
