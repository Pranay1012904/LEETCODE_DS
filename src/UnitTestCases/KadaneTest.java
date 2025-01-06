package UnitTestCases;

import Operation.Important_Practice.KadanesAlgo.KadaneAlgo;
import Operation.Important_Practice.SumOfUniqueElements;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KadaneTest {
    @Test
    @DisplayName("Kadane's Algo")
    public void kadaneTest() {
        assertAll(() -> assertEquals(6, KadaneAlgo.Kadane(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4})),
                () -> assertEquals(5, KadaneAlgo.Kadane(new int[]{1, 1, 1, 1, 1}))
        );
    }
}
