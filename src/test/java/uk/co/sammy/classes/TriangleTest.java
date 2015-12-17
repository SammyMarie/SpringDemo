package uk.co.sammy.classes;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by smlif on 06/12/2015.
 */
public class TriangleTest {
    private Triangle triangles;

    @Before
    public void setUp(){
        triangles = new Triangle("Square");
        triangles = new Triangle("Square", 5);
    }

    @Test
    public void checkConstructors(){
        String type = "Square";
        int height = 5;

        assertEquals(type, triangles.getType());
        assertEquals(height, triangles.getHeight());
    }

    @Test
    public void checkBeanName(){
        String beanName = "Triangle";
        triangles.setBeanName(beanName);
        assertEquals(beanName, triangles.getBeanName());
    }
}
