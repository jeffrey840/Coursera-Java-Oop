//import static org.junit.jupiter.api.Assertions.*;
//
//import java.util.ArrayList;
//
//import org.junit.jupiter.api.Test;
//
//class CustomIntegerArrayListTest {
//
//    @Test
//    void testGetArrayList() {
//
//        // create a new empty CustomIntegerArrayList
//        CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
//        arr1.add(2);
//        arr1.add(0, 5);
//        arr1.add(1, 5);
//
//        ArrayList<Integer> lst1 = new ArrayList<Integer>();
//        lst1.add(2);
//        lst1.add(0, 5);
//        lst1.add(1, 5);
//        assertEquals(lst1, arr1.getArrayList());
//
//        ArrayList<Integer> arr4Elements = new ArrayList<Integer>();
//        arr4Elements.add(100);
//        arr4Elements.add(200);
//        arr4Elements.add(500);
//
//        // create a new CustomIntegerArrayList with the elements in the given ArrayList
//        CustomIntegerArrayList arr4 = new CustomIntegerArrayList(arr4Elements);
//
//        ArrayList<Integer> lst4 = new ArrayList<Integer>();
//        lst4.add(100);
//        lst4.add(200);
//        lst4.add(500);
//
//        assertEquals(lst4, arr4.getArrayList());
//
//        CustomIntegerArrayList arr5 = new CustomIntegerArrayList();
//        ArrayList<Integer> lst5 = new ArrayList<Integer>();
//        assertEquals(lst5, arr5.getArrayList());
//
//        CustomIntegerArrayList arr6 = new CustomIntegerArrayList();
//        arr6.add(7);
//        ArrayList<Integer> lst6 = new ArrayList<Integer>();
//        lst6.add(7);
//        assertEquals(lst6, arr6.getArrayList());
//
//        CustomIntegerArrayList arr7 = new CustomIntegerArrayList();
//        arr7.add(0, 7);
//        ArrayList<Integer> lst7 = new ArrayList<Integer>();
//        lst7.add(0, 7);
//        assertEquals(lst7, arr7.getArrayList());
//
//        CustomIntegerArrayList arr8 = new CustomIntegerArrayList();
//        arr8.add(0, 7);
//        arr8.add(1, 8);
//        ArrayList<Integer> lst8 = new ArrayList<Integer>();
//        lst8.add(0, 7);
//        lst8.add(1, 8);
//        assertEquals(lst8, arr8.getArrayList());
//
//    }
//
//    @Test
//    void testGet() {
//        CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
//        arr1.add(2);
//        arr1.add(0, 5);
//        arr1.add(1, 5);
//
//        ArrayList<Integer> lst1 = new ArrayList<Integer>();
//        lst1.add(2);
//        lst1.add(0, 5);
//        lst1.add(1, 5);
//
//        assertEquals((int) lst1.get(0), (int) arr1.get(0));
//        assertEquals((int) lst1.get(1), (int) arr1.get(1));
//        assertEquals((int) lst1.get(2), (int) arr1.get(2));
//
//        // Test with empty list
//        CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
//        assertThrows(IndexOutOfBoundsException.class, () -> {
//            arr2.get(0);
//        });
//
//        // Test with single element list
//        CustomIntegerArrayList arr3 = new CustomIntegerArrayList();
//        arr3.add(5);
//        assertEquals(5, arr3.get(0));
//
//        // Test with large list
//        CustomIntegerArrayList arr4 = new CustomIntegerArrayList();
//        for (int i = 0; i < 100; i++) {
//            arr4.add(i);
//        }
//        assertEquals(0, arr4.get(0));
//        assertEquals(50, arr4.get(50));
//    }
//
//    @Test
//    void testAddInt() {
//
//        CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
//        arr1.add(2);
//        arr1.add(3);
//        arr1.add(4);
//
//        ArrayList<Integer> lst1 = new ArrayList<Integer>();
//        lst1.add(2);
//        lst1.add(3);
//        lst1.add(4);
//
//        assertEquals((int) lst1.get(0), (int) arr1.get(0));
//        assertEquals((int) lst1.get(1), (int) arr1.get(1));
//        assertEquals((int) lst1.get(2), (int) arr1.get(2));
//
//        // TODO write at least 3 additional test cases
//    }
//
//    @Test
//    void testAddIntInt() {
//
//        CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
//        arr1.add(0, 2);
//        arr1.add(0, 3);
//        arr1.add(0, 4);
//
//        ArrayList<Integer> lst1 = new ArrayList<Integer>();
//        lst1.add(0, 2);
//        lst1.add(0, 3);
//        lst1.add(0, 4);
//
//        assertEquals((int) lst1.get(0), (int) arr1.get(0));
//        assertEquals((int) lst1.get(1), (int) arr1.get(1));
//        assertEquals((int) lst1.get(2), (int) arr1.get(2));
//
//        // TODO write at least 3 additional test cases
//    }
//
//    @Test
//    void testRemoveInt() {
//
//        CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
//        arr1.add(0, 2);
//        arr1.add(0, 3);
//        arr1.add(0, 4);
//        arr1.remove(0);
//        arr1.remove(1);
//
//        ArrayList<Integer> lst1 = new ArrayList<Integer>();
//        lst1.add(0, 2);
//        lst1.add(0, 3);
//        lst1.add(0, 4);
//        lst1.remove(0);
//        lst1.remove(1);
//
//        assertEquals((int) lst1.get(0), (int) arr1.get(0));
//
//        // TODO write at least 3 additional test cases
//    }
//
//    @Test
//    void testRemoveIntInt() {
//
//        CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
//        arr1.add(0, 2);
//        arr1.add(0, 3);
//        arr1.add(0, 3);
//        arr1.add(0, 3);
//        arr1.add(0, 3);
//        arr1.add(0, 4);
//        arr1.remove(3, 3);
//
//        ArrayList<Integer> lst1 = new ArrayList<Integer>();
//        lst1.add(0, 2);
//        lst1.add(0, 3);
//        lst1.add(0, 4);
//
//        assertEquals(lst1, arr1.getArrayList());
//
//        // TODO write at least 3 additional test cases
//    }
//
//    @Test
//    void testSpliceIntInt() {
//
//        CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
//        arr1.add(2);
//        arr1.add(3);
//        arr1.add(4);
//        arr1.add(5);
//        arr1.add(6);
//        arr1.splice(3, 2);
//
//        ArrayList<Integer> lst1 = new ArrayList<Integer>();
//        lst1.add(2);
//        lst1.add(3);
//        lst1.add(4);
//
//        assertEquals((int) lst1.get(0), (int) arr1.get(0));
//        assertEquals((int) lst1.get(1), (int) arr1.get(1));
//        assertEquals((int) lst1.get(2), (int) arr1.get(2));
//
//        // TODO write at least 3 additional test cases
//    }
//
//    @Test
//    void testSpliceIntIntIntArray() {
//
//        CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
//        arr1.add(2);
//        arr1.add(3);
//        arr1.add(4);
//        arr1.add(5);
//        arr1.add(6);
//        arr1.splice(3, 1, new int[] { 4, 5 });
//
//        ArrayList<Integer> lst1 = new ArrayList<Integer>();
//        lst1.add(2);
//        lst1.add(3);
//        lst1.add(4);
//        lst1.add(4);
//        lst1.add(5);
//        lst1.add(6);
//
//        assertEquals(lst1, arr1.getArrayList());
//
//        // TODO write at least 3 additional test cases
//    }
//
//}