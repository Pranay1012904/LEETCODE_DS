package UnitTestCases;

import Operation.Important_Practice.SumOfUniqueElements;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfUniqueElementsTest {

    @Test
    @DisplayName("SumOfUniqueElements")
    public void sampleTest(){
                assertAll(() -> assertEquals(15, SumOfUniqueElements.sumOfUnique(new int[]{1,2,3,4,5})),
                        () -> assertEquals(0, SumOfUniqueElements.sumOfUnique(new int[]{1,1,1,1,1}))
                       );
    }

}