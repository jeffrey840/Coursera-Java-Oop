//import static org.junit.jupiter.api.Assertions.*;
//
//import java.util.ArrayList;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//class ArrayAndArrayListTest {
//
//    // declare myArrayAndArrayList which is the object for testing
//    ArrayAndArrayList myArrayAndArrayList;
//
//    @BeforeEach
//    void setUp() throws Exception {
//        // initialize myArrayAndArrayList for testing
//        this.myArrayAndArrayList = new ArrayAndArrayList();
//    }
//
//    /**
//     * Test howMany method in ArrayAndArrayList.
//     */
//    @Test
//    void testHowMany() {
//        // element in the array
//        int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
//        assertEquals(2, this.myArrayAndArrayList.howMany(array, 1));
//
//        // element not in the array
//        int[] array2 = {2, 4, 6, 8};
//        assertEquals(0, this.myArrayAndArrayList.howMany(array2, 3));
//
//        // test an empty array
//        int[] array3 = {};
//        assertEquals(0, this.myArrayAndArrayList.howMany(array3, 1));
//
//        // test an array with one element
//        int[] array4 = {5};
//        assertEquals(1, this.myArrayAndArrayList.howMany(array4, 5));
//    }
//
//    /**
//     * Test findMax method in ArrayAndArrayList.
//     */
//    @Test
//    void testFindMax() {
//        // findMax in an nonEmpty array
//        int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
//        assertEquals(9, this.myArrayAndArrayList.findMax(array));
//        int[] array1 = {1, 3, 5, 7, 9, 10, 2, 3, 4, 5};
//        assertEquals(10, this.myArrayAndArrayList.findMax(array1));
//        int[] array2 = {9, 1, 5, 7, 8, 1, 2, 3, 4, 5};
//        assertEquals(9, this.myArrayAndArrayList.findMax(array2));
//        int[] array3 = {0, 0, 0, 0, 0};
//        assertEquals(0, this.myArrayAndArrayList.findMax(array3));
//        int[] array4 = {-1, -3, -5, -7, -9};
//        assertEquals(-1, this.myArrayAndArrayList.findMax(array4));
//    }
//
//    /**
//     * Test maxArray method in ArrayAndArrayList.
//     */
//    @Test
//    void testMaxArray() {
//        // test a valid array.
//        int[] array1 = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
//        ArrayList<Integer> testArrayList1 = new ArrayList<Integer>();
//        testArrayList1.add(9);
//        assertEquals(testArrayList1, this.myArrayAndArrayList.maxArray(array1));
//
//        // test an array where all elements are the same
//        int[] array2 = {1, 1, 1, 1, 1, 1};
//        ArrayList<Integer> testArrayList2 = new ArrayList<Integer>();
//        testArrayList2.add(1);
//        assertEquals(testArrayList2, this.myArrayAndArrayList.maxArray(array2));
//
//        // test an empty array
//        int[] array3 = {};
//        ArrayList<Integer> testArrayList3 = new ArrayList<Integer>();
//        assertEquals(testArrayList3, this.myArrayAndArrayList.maxArray(array3));
//
//        // test an array with negative numbers
//        int[] array4 = {-1, -3, -5, -7, -9};
//        ArrayList<Integer> testArrayList4 = new ArrayList<Integer>();
//        testArrayList4.add(-1);
//        assertEquals(testArrayList4, this.myArrayAndArrayList.maxArray(array4));
//    }
//
//    /**
//     * Test swapZero method in ArrayAndArrayList.
//     */
//    @Test
//    void testSwapZero() {
//        // test an array containing 0
//        int[] array = {0, 1, 0, 2, 0, 3, 0, 5};
//        int[] testArray = {1, 2, 3, 5, 0, 0, 0, 0};
//        this.myArrayAndArrayList.swapZero(array);
//        assertArrayEquals(testArray, array);
//
//        // test an empty array
//        int[] emptyArray = {};
//        int[] emptyTestArray = {};
//        this.myArrayAndArrayList.swapZero(emptyArray);
//        assertArrayEquals(emptyTestArray, emptyArray);
//
//        // test an array with no 0's
//        int[] noZerosArray = {1, 2, 3, 4, 5};
//        int[] noZerosTestArray = {1, 2, 3, 4, 5};
//        this.myArrayAndArrayList.swapZero(noZerosArray);
//        assertArrayEquals(noZerosTestArray, noZerosArray);
//
//        // test an array with all 0's
//        int[] allZerosArray = {0, 0, 0, 0, 0};
//        int[] allZerosTestArray = {0, 0, 0, 0, 0};
//        this.myArrayAndArrayList.swapZero(allZerosArray);
//        assertArrayEquals(allZerosTestArray, allZerosArray);
//    }
//}