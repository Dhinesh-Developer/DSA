package BianrySearch;

public class program3 {
	public static int searchIndex(int[] ar,int x) {
		int n = ar.length;
		int low = 0;
		int high = ar.length-1;
		int ans = n;
		while(low<=high) {
			int mid = (low+high)/2;
			if(ar[mid] >= x) {
				ans = mid;
				high = mid-1;
			}else {
				low = mid+1;
			}
			
		}
		return ans;
	}
	public static void main(String[] args) {
		
		int[] ar = {1,2,4,7};
		int x = 6;
		int ind = searchIndex(ar,x);
		System.out.println("The index is : "+ind);
	}

}
