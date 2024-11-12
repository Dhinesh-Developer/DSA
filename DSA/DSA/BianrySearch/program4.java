package BianrySearch;

public class program4 {
	public static int floorsqrt(int n) {
		int ans = (int) Math.sqrt(n);
		return ans;
	}
	public static void main(String[] args) {
		
		int n = 28;
		int ans = floorsqrt(n);
		System.out.println("The square root of 28 is "+ans);
	}

}
