
class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer>list=new ArrayList<>();
        int cur_sum = 0;
        int start = 0;
        int end = -1;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
 
        for (int i = 0; i < n; i++) {
            cur_sum = cur_sum + arr[i];
            // check whether cur_sum - sum = 0, if 0 it
            // means the sub array is starting from index 0-
            // so stop
            if (cur_sum - s == 0) {
                start = 0;
                end = i;
                break;
            }
            // if hashMap already has the value, means we
            // already
            // have subarray with the sum - so stop
            if (hashMap.containsKey(cur_sum - s)) {
                start = hashMap.get(cur_sum - s) + 1;
                end = i;
                break;
            }
            // if value is not present then add to hashmap
            hashMap.put(cur_sum, i);
        }
        // if end is -1 : means we have reached end without
        // the sum
        if (end == -1) {
            list.add(-1);
            return list;
        }
        else {
           list.add(start+1);
           list.add(end+1);
           
        }
        return list;
    }
}
//another method with high time complexity
// Java program for the above approach
import java.util.*;

class GFG {

	/* Returns true if the there is a subarray
	of arr[] with sum equal to 'sum' otherwise
	returns false. Also, prints the result */
	static int subArraySum(int arr[], int n, int sum)
	{
		int curr_sum, i, j;

		// Pick a starting point
		for (i = 0; i < n; i++) {
			curr_sum = 0;

			// try all subarrays starting with 'i'
			for (j = i; j < n; j++) {
				curr_sum = curr_sum + arr[j];

				if (curr_sum == sum) {
					System.out.print(
						"Sum found between indexes " + i
						+ " and " + j);
					return 1;
				}
			}
		}

		System.out.print("No subarray found");
		return 0;
	}

	// Driver Code
	public static void main(String[] args)
	{
		int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
		int n = arr.length;
		int sum = 23;

		// Function call
		subArraySum(arr, n, sum);
	}
}

// This code is contributed by code_hunt.

