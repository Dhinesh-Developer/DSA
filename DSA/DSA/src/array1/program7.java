package array1;

/*
 * Given an array of N integers. Write a program to find the element in linear search.
 */
public class program7 {
	public static int linearSearch(int[] ar, int num) {
		for(int i=0;i<ar.length;i++) {
			if(ar[i] == num) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5};
		int num = 3;
		int res = linearSearch(ar, num);
		if(res != -1) {
			System.out.println("The element present the position "+res);
		}else {
			System.out.println("Element is not present in the array.");
		}
	}

}
