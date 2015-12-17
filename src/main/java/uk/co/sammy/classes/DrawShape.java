package uk.co.sammy.classes;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by smlif on 06/12/2015.
 */
public class DrawShape {
    private static AbstractApplicationContext context;

    public static void main(String... args){
        context = new ClassPathXmlApplicationContext("spring.xml");
        context.registerShutdownHook();
        Triangle1 triangle = (Triangle1) context.getBean("triangle");
        triangle.draw();
    }
}
