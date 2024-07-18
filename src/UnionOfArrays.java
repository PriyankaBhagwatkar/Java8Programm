import java.util.HashSet;
import java.util.Set;

public class UnionOfArrays {
	
	/**
	 * Given two arrays a[] and b[] of size n and m respectively. The task is to find the number of elements in the union between these two arrays.
	 * Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there are repetitions, then only one occurrence of element should be printed in the union.
	 * Note : Elements are not necessarily distinct.
	 * Example 1:
	 * Input:5 3
	 * 1 2 3 4 5
	 * 1 2 3
	 * Output: 
	 * 5
	 * Explanation: 
	 * 1, 2, 3, 4 and 5 are the elements which comes in the union set of both arrays. So count is 5.**/
	
	
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3};
        int n = a.length;
        int m = b.length;
        int unionCount = doUnion(a, n, b, m);
        System.out.println(unionCount); // Output: 5
    }

    public static int doUnion(int a[], int n, int b[], int m) {
        Set<Integer> unionSet = new HashSet<>();
        
        for (int num : a) {
            unionSet.add(num);
        }
        
        for (int num : b) {
            unionSet.add(num);
        }
        
        return unionSet.size();
    }
}
