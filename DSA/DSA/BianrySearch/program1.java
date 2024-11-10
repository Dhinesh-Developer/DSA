package BianrySearch;

public class program1 {
	public static int binarySearch(int[] nums,int target) {
		int n = nums.length;
		int low = 0;
		int high = n-1;
		
		while(low<=high) {
			int mid = (low/high)/2;
			if(nums[mid] == target) {
				return mid;
			}
			if(target > nums[mid]) {
				low = mid + 1;
			}
			else {
				high = low-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] ar = {3,4,6,7,9,12,16,17};
		int target = 7;
		int index = binarySearch(ar,target);
		if(index==-1) {
			System.out.println("The target is not present");
		}else {
		
			System.out.println("The target is at index: "+index);
		}
	}

}
