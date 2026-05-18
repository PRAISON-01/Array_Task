import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class FireDrillFourTest{

    @Test
    public void testThatReverseArrayReturnsTheNewArrayArrayOfAnArray(){
        
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] actual = FireDrillFour.collectArray(10);
        assertArrayEquals(actual , expected);
    }

    @Test
    public void testThatReverseArrayReturnsTheReversedArrayOfAnArray(){
        
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        int[] actual = FireDrillFour.reverseArray(array);
        assertArrayEquals(actual, expected);
    }

    @Test
    public void testThatEvenArrayMethodremovesOddNumbersAndReturnsANewArrayOfEvenNumbers(){
        
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {2, 4};
        int[] actual = FireDrillFour.removeOdd(array);
        assertArrayEquals(actual, expected);
    }

    @Test
    public void testThatOddArrayMethodremovesEvenNumbersAndReturnsANewArrayOfOddNumbers(){
        
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {1, 3, 5};
        int[] actual = FireDrillFour.removeEven(array);
        assertArrayEquals(actual, expected);
    }

    @Test
    public void testThatRemoveDuplicateValuesFromAnArrayandReturnANewArray() {

        int[] array = {1, 2, 3, 4 , 3};
        int[] expected = {1, 2, 3, 4};

        int[] actual = FireDrillFour.removeDuplicate(array);

        assertArrayEquals(actual , expected);
    } 

    @Test
    public void testThatAscendingArrayreturnsArrayInAscendingOrder(){
        
        int[] array = {5, 2, 1, 6, 7, 9, 9};
        int[] expected = {1, 2, 5, 6, 7, 9, 9};

        int[] actual = FireDrillFour.ascendArray(array);

        assertArrayEquals(expected ,actual);
    }

    @Test
    public void testThatdescendingArrayreturnsArrayIndescendingOrder(){
        
        int[] array = {5, 2, 1, 6, 7, 9, 9};
        int[] expected = {9, 9, 7, 6, 5, 2, 1};

        int[] actual = FireDrillFour.descendArray(array);

        assertArrayEquals(expected ,actual);
    }

    @Test
    public void testThatLinearSearchLooksForElementInAnArrayWhereItWouldBeFoundreturnIndex(){

        int[] array = {5, 2, 1, 6, 7, 9, 9};
        int key = 1;
        int actual = FireDrillFour.linearSearch(array, key);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void testThatLinearSearchLooksForElementInAnArrayWhereItWouldNotBeFoundAndReturnMinus1(){

        int[] array = {5, 2, 6, 7, 9, 9};
        int key = 1;
        int actual = FireDrillFour.linearSearch(array, key);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    public void testThatBinarySearchMethoReturnsTheIndexOftheKeyIfFound(){

        int[] array = {1, 2, 4, 5, 6, 7, 9};
        int key = 9;
        int actual = FireDrillFour.binarySearch(array, key);
        int expected = 6;
        assertEquals(expected, actual);
    }
    

    @Test
    public void testThatBinarySearchMethoReturnsMinusWhenTheKeyIsNotAvailableInTheAray(){

        int[] array = {1, 2, 4, 5, 6, 7};
        int key = 9;
        int actual = FireDrillFour.binarySearch(array, key);
        int expected = -1;
        assertEquals(expected, actual);

    }


    @Test
    public void testThatMergeArrayFunctionReturnANewArrayContainingElementsInArrayOneAndTwo(){

        int[] arrayOne = {1, 2, 4, 5};
        int[] arrayTwo = { 6, 7, 8, 9, 0};
        int[] expected = {0, 1, 2, 4, 5, 6, 7, 8, 9};
        int[] actual = FireDrillFour.mergeArray(arrayOne, arrayTwo);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testThatMethodReturnsANewArrayOfThePrefixSum(){
        
        int[] array = {1,2,3,4};
        int[] expected = {1,3,6,10};
        int[] actual = FireDrillFour.getPrefixSum(array);
        assertArrayEquals(expected, actual);
    }

    

//End of class   
}
