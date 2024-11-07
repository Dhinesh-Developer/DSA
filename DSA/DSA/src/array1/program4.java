package array1;

import java.util.TreeSet;

public class program4 {
 // remove duplicates from the sorted array.return numbers of unique elements.
	
	public static int removeDuplicates(int[] ar) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		for(int i=0;i<ar.length;i++) {
			set.add(ar[i]);
		}
		int count=0;
		for(int s:set) {
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		
		int[] ar = {1,1,2,2,2,3,3};
		int res = removeDuplicates(ar);
		System.out.println(res);
	}

}
