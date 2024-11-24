package ALL_TOPIC;

import java.util.Scanner;

public class BINARY_SEARCH {
	/* O(log n)
	 * public static int binarySearch(int[] ar,int target) {
		int low = 0;
		int high = ar.length-1;
		int count = 0;
		while(low <= high) {
			count++;
			int mid = (low+high)/2;
			if(ar[mid] == target) {
				System.out.println("Steps taken by binary: "+count);
				return mid;
			}
			if(ar[mid] < target) {
				low = mid-1;
			}else {
				high = mid+1;
			}
		}
		return -1;
	}
	 */ // RECURSIVE WAY
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] ar = {1,2,3,4,5,6,7,8,9,11,12,13,14,15,16,17,18,19,20};
		int target = 18;
		int res = binarySearch(ar,target);
		if(res!=-1) {
			System.out.println("Element is present in the index of :"+ res);
		}else{
			System.out.println("Element is not found");
		}
	}
	
	
	
	public static int binarySearch(int[] ar, int target) {
	    return binarySearch(ar, target, 0, ar.length - 1, 0);
	}

	private static int binarySearch(int[] ar, int target, int low, int high, int count) {
	    if (low > high) {
	        System.out.println("Steps taken by binary: " + count);
	        return -1; // Base case: not found
	    }

	    count++;
	    int mid = (low + high) / 2;

	    if (ar[mid] == target) {
	        System.out.println("Steps taken by binary: " + count);
	        return mid; // Base case: element found
	    }

	    if (ar[mid] < target) {
	        return binarySearch(ar, target, mid + 1, high, count); // Search in the upper half
	    } else {
	        return binarySearch(ar, target, low, mid - 1, count); // Search in the lower half
	    }
	}

}
