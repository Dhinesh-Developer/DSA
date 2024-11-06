package array1;

public class program2 {
	
	public static int secondLargest(int[] ar) {
		int l = ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>l) {
				l = ar[i];
			}
		}
		int sl = -1;
		for(int i=0;i<ar.length;i++) {
			if(ar[i] > sl && ar[i]!=l) {
				sl = ar[i];
			}
		}
		return sl;
	}

	public static void main(String[] args) {
		
		int[] ar = {1,2,3,4,5};
		int res = secondLargest(ar);
		System.out.println(res);
	}

}
