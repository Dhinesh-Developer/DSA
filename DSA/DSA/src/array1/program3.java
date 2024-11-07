package array1;

public class program3 {
	// check if the array is sorted.
	public static boolean checkArraySorted(int[] ar) {
		 for(int i=0;i<ar.length;i++) {
			 if(ar[i] <= ar[i+1]) {
			
			 }else {
				 return false;
			 }
		 }
		 return true;
	}
	public static void main(String[] args) {
		
		int[] ar = {1,2,1,4,3};
		boolean res = checkArraySorted(ar);
		System.out.println(res);

	}

}
