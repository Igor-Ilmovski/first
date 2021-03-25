package by.epam.training.base;

import org.testng.*;

public class baseArrayTest {
    @Test
    public void testInitbaseArray() {
        int array_Length = 10;
        BaseArray the_array;

        the_array = BaseArray.initArray(array_Length);
        //Assert.assertEquals(the_array, realY, 0.00000001);
    }
}
