package array1;
/*
 * Give an integer N< and an array of size - 1; containing N-1;numbers,
 * between 1 to N. Find the number between 1 to N that is npt present in the array.
 */
public class program8 {
	public static int missingNumber(int[] ar,int N) {
		for(int i=1;i<=N;i++) {
			int flag = 0;
			for(int j = 0;j<N-1;j++) {
				if(ar[j] == i) {
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				return i;
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
	
		int N = 5;
		int[] ar = {1,2,4,5}; //  o/p = The missing number is 3
		int res = missingNumber(ar,N);
		System.out.println("The missing number is "+res);

	}

}
