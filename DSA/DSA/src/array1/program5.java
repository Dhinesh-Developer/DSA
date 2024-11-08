package array1;

public class program5 {
	public static void rotateRight(int[] ar,int n,int k) {
		if(n==0) {
			return;
		}
		k = k%n;
		if(k>n) {
			return;
		}
		int[] temp = new int[k];
		for(int i=n-k;i<n;i++) {
			temp[i-n+k] = ar[i];
		}
		for(int i=n-k-1;i>=0;i--) {
			ar[i+k] = ar[i];
		}
		for(int i=0;i<k;i++) {
			ar[i] = temp[i];
		}
	}
	public static void main(String[] args) {
		int n = 7;
		int[] ar = {1,2,3,4,5,6,7};
		int k =4;
		rotateRight(ar,n,k);
		System.out.println("After rotating element to the right: ");
		for(int i=0;i<n;i++) {
			System.out.print(ar[i]+" ");
		}
		
	}
	/*
	 * After rotating element to the right: 
		6 7 1 2 3 4 5  if k = 2
		After rotating element to the right: 
		4 5 6 7 1 2 3  if k = 4
	 */

}
