import org.example.Gerade;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class testmeow {

    @Test
    public void testgerade() {

        //GIVEN
        int val = 8;

        //WHEN
        int actual = Gerade.gerade(val);
        //THEN
        assertEquals(8, actual);
        assertNotEquals(10,actual);
    }

    @Test
    public void testungerade() {

        //GIVEN
        int val = 7;

        //WHEN
        int actual = Gerade.gerade(val);
        //THEN
        assertEquals(14, actual);
    }


}
