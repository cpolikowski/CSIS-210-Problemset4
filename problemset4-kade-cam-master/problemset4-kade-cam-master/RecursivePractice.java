/**
 * All solutions in this class must be implemented recursively
 * according to the function directions.
 * 
 * @author Prof. White
 * @version Spring 2019
 */
public class RecursivePractice
{
    /**
     * Returns true if there are at least k negative values among 
     * the values arr[first] --> arr[last]
     * where 0 <= first <= last < arr.length. 
     * 
     * For example, if arr = {-2, 5, -1, 9, 4}, first is 0, last is 4,
     * and k is 3, the function would return false.  If k were 2, the
     * function would return true.
     * 
     * @param arr The input array.
     * @param first The first index in the input array to consider.
     * @param last The last index in the input array to consider.
     * @param k The minimum number of negative values in the array.
     * @return true if there are at least k negative values among 
     * the values arr[first] --> arr[last]. 
     */
    public static boolean atLeastKNegatives(int[] arr, int first, int last, int k) 
    {
        if (arr[first] < 0) {
            k--;
        }
        if (k <= 0) {
            return true;
        }
        if (first == last) {
            return false;
        }
        return atLeastKNegatives(arr, ++first, last, k);
    }

    /**
     * Returns the sum of the first k values of arr[first] --> arr[last]
     * where 0 <= first <= last < arr.length and first <= k <= last.
     *
     * For example, if arr = {2, 5, 1, 9, 4}, first is 0, last is 4,
     * and k is 3, the function would return 8.  If k were 0, the
     * sum would be 0.
     * 
     * @param arr The input array.
     * @param first The first index in the input array to consider.
     * @param last The last index in the input array to consider.
     * @param k The number of elements to sum starting with arr[first].
     * @return The sum of the first k values of arr[first]�arr[last].
     */
    public static int prefixSum(int[] arr, int first, int last, int k ) 
    {
        //YOUR CODE HERE.
        return -1;
    }

}
