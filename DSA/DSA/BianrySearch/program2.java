package BianrySearch;

public class program2 {
	public static int lowerBound(int[] ar,int n,int x) {
		int low = 0;
		int high = n-1;
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
		int[] ar = {3,5,8,15,19};
		int n = 5;
		int x = 9;
		int res = lowerBound(ar,n,x);
		System.out.println("The lower bound is: "+res);
	}

}
