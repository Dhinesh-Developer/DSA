package ALL_TOPIC;
import java.util.Scanner;
public class LINEAR_SEARCH {
 // O(n)
	public static int linearSearch(int[] ar,int target) {
		int count = 0;
		for(int i=0;i<ar.length;i++) {
			count++;
			if(ar[i] == target) {
				return i;
			}
			System.out.println("Steps taken by binary: "+count);
		}
		
		return -1;
	}
		
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int[] ar = {1,2,3,4,5,6,7,8,9,11,12,13,14,15,16,17,18,19,20};
		int target = 18;
		int res = linearSearch(ar,target);
		if(res!=-1) {
			System.out.println("Element is present in the index of :"+ res);
		}else{
			System.out.println("Element is not found");
		}
	}

}
