import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskOneTest{

    @Test
    public void TestThatArrayMethodIsCorrect(){
        
        String expected = "[1, 2, 3, 4, 5, 6, 7, 8, 9, 0]";
        String actual = TaskOne.getArray(1);

        assertEquals(actual, expected);
    }

}

