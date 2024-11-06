package array1;

import java.util.Scanner;

public class program1 {
	public static int largestElement(int[] ar) {
		int largest = ar[0];
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>largest) {
				largest = ar[i];
			}
		}
		return largest;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i] = in.nextInt();
		}
		int res = largestElement(ar);
		System.out.println(res);
		

	}

}
