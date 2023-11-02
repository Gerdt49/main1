package practice.consultation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxOfArrayTest {

    MaxOfArray maxOfArray;


    @BeforeEach
    void setUp() {
        maxOfArray = new MaxOfArray();
    }

    @Test
    void maxOfArray() {

        int[] arr = {500, 100, 1, 15, -64, 85, -3};
        assertEquals(0,maxOfArray.maxOfArray(arr));


    }
}