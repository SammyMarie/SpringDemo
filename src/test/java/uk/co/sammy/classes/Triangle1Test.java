package uk.co.sammy.classes;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by smlif on 06/12/2015.
 */
public class Triangle1Test {

    private Triangle1 triangle1;
    private Point point1;
    private Point point2;
    private Point point3;

    @Before
    public void setUp(){
        triangle1 = new Triangle1();
        point1 = new Point();
        point2 = new Point();
        point3 = new Point();
    }

    @Test
    public void checkSettersAndGetters(){

        triangle1.setBeanName("triangle1");
        triangle1.setPointA(point1);
        triangle1.setPointB(point2);
        triangle1.setPointC(point3);

        assertEquals(point1, triangle1.getPointA());
        assertEquals(point2, triangle1.getPointB());
        assertEquals(point3, triangle1.getPointC());
    }

    @Test
    public void checkXAndYofPoints(){
        point1.setX(12);
        point1.setY(0);

        point2.setX(1);
        point2.setY(2);

        point3.setX(1);
        point3.setY(2);

        assertEquals(12, point1.getX());
        assertEquals(0, point1.getY());
        assertEquals(1, point2.getX());
        assertEquals(2, point2.getY());
        assertEquals(1, point3.getX());
        assertEquals(2, point3.getY());
    }
}
