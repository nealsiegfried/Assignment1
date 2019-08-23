import org.junit.*;
import static org.junit.Assert.assertEquals;

public class FinderTest {

    @Test
    public void test_findMax() {
        int[] intArray = new int[] {1, 2, 3, 4, 5};
        int expectedMax = 5;
        int actualMax = Finder.findMax(intArray);
        assertEquals(expectedMax, actualMax);
    }


    @Test
    public void test_findMin() {
        int[] intArray = new int[] {1, 2, 3, 4, 5};
        int expectedMin = 1;
        int actualMin = Finder.findMin(intArray);
        assertEquals(expectedMin, actualMin);
    }

    @Test
    public void test_findMaxNull() {
        int[] intArray = null;
        Integer expectedInt = null;
        Integer actualMax = Finder.findMax(null);
        assertEquals(expectedInt, actualMax);
    }

    @Test
    public void test_findMinNull() {
        int[] intArray = null;
        Integer expectedInt = null;
        Integer actualMin = Finder.findMin(null);
        assertEquals(expectedInt, actualMin);
    }

    @Test
    public void test_findMaxEmpty() {
        int[] intArray = {};
        Integer expectedInt = null;
        Integer actualMax = Finder.findMax(intArray);
        assertEquals(expectedInt, actualMax);
    }

    @Test
    public void test_findMinEmpty() {
        int[] intArray = {};
        Integer expectedInt = null;
        Integer actualMin = Finder.findMin(intArray);
        assertEquals(expectedInt, actualMin);
    }

}
