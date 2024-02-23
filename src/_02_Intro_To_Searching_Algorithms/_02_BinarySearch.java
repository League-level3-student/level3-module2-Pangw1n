package _02_Intro_To_Searching_Algorithms;

public class _02_BinarySearch {
    /*
     * Binary searches are good for sorted data because it
     * can potentially take a lot less time than a linear search,
     * especially if the data set is very large. But it cannot be used
     * for unsorted lists.
     *
     * Because binary search is a recursive algorithm, the
     * binarySearch method will take in two extra integer parameters
     * to define the start and end position of the search.
     */

    // 1. Complete the steps in the binarySearch method.
    //    We can assume array is already sorted
    public static int binarySearch(int[] array, int value) {
        // 2. if end is greater than or equal to start, then
        //    do steps 3 - 6.
    	int start = 0;
    	int end = array.length - 1;
    	
    	while (end != start)
    	{
    		int mid = start + ((end - start) / 2);
    		if (array[mid] == value)
    		{
    			return mid;
    		}
    		else if (array[mid] < value)
    		{
    			start = mid + 1;
    		}
    		else if (array[mid] > value)
    		{
    			end = mid - 1;
    		}
    	}
    	int mid = start;
		if (array[mid] == value)
		{
			return mid;
		}
		else
		{
			return -1;
		}
            // 3. create an integer called mid and set it equal
            //    to the half way point between start and end

            // 4. if the array element at mid is equal to value
            //    then return mid

            // 5. if the array element at mid is greater than value
            //    then return the value returned from a call to the 
            //    binarySearch method. Pass in start and mid - 1
            //    for the end variable.

            // 6. return the value returned from a call to the binarySearch
            //    method. Use mid + 1 as the start, and pass in end.

        // 7. return -1 because the value was not found
    } 
}
