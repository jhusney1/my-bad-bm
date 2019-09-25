package edu.touro.mco152.bm;

import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestUtil {

    @Test
    public void getDiskInfoTest() {

        File emptyFile = new File("C:\\Users\\Joey\\Desktop");

        String s = Util.getDiskInfo(emptyFile);

        assertEquals("Samsung SSD 850 EVO 500GB  ",s);
    }

    @Test
    public void RandomIntTest() {
        int  numInBoundary = Util.randInt(70,220);

        boolean b = (numInBoundary<=220 && numInBoundary >=70? true : false);

        assertEquals(true, b);

        /**
         * Tests boundary condition that it makes sure to test that it throws error
         */
        // Boundary condition
        assertThrows(IllegalArgumentException.class,  () -> Util.randInt(50,40));

    }
}
