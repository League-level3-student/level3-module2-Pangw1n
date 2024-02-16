package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
    	String[] arr = {"KIMB", "PSBWB", "SFSGSW", "RIP", "CDTE", "Youthanasia"};
    	int value = new _01_LinearSearch().linearSearch(arr, "RIP");
        assertEquals(value, 3);
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
    	int[] arr = {2, 3, 5, 7, 8};
        
    	int value = new _02_BinarySearch().binarySearch(arr, 8);
        assertEquals(value, 4);
    }
}
