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








//End of class   
}
