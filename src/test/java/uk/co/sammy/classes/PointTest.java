package uk.co.sammy.classes;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by smlif on 06/12/2015.
 */
public class PointTest {
    private Point point;

    @Test
    public void checkSettersAndGetters(){
        point = new Point();
        point.setX(15);
        point.setY(0);

        assertEquals(15, point.getX());
        assertEquals(0, point.getY());
    }
}
