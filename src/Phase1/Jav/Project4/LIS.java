package Phase1.Jav.Project4;

import java.util.*;

public class LIS {

	static int lis(int[] arr, int n) {
		int max = 0;
		int[] store = new int[n];

		// initialize LIS values for all indexes
		Arrays.fill(store, 1);

		// Compute LIS values
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j] && store[i] < store[j] + 1)
					store[i] = store[j] + 1;
			}
		}

		// Pick maximum of all LIS values
		for (int i = 0; i < n; i++)
			if (max < store[i])
				max = store[i];

		return max;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 22, 9, 33, 21, 50, 41, 60 };
		int n = arr.length;
		System.out.println("Length of list is " + lis(arr, n));
	}
}
