package array1;

// left rotate an array by one.
/*
 * Given an array of N integers, left rotate the array by one place.
 * input = {1,2,3,4,5}  ouput = {2,3,4,5,1}
 */
public class program6 {
	public static void leftRotateArrayByOne(int[] ar,int n) {
		int temp = ar[0];
		for(int i=0;i<n-1;i++) {
			ar[i] = ar[i+1];
		}
		ar[n-1] = temp;
		for(int i=0;i<n;i++) {
			System.out.print(ar[i]+" ");
		}
	}
	public static void main(String[] args) {
		int n = 5;
		int[] ar = {1,2,3,4,5};
		leftRotateArrayByOne(ar,n);

	}

}
