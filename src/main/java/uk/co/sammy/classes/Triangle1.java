package uk.co.sammy.classes;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import static java.lang.System.*;

/**
 * Created by smlif on 06/12/2015.
 */
public class Triangle1 implements ApplicationContextAware, BeanNameAware{
    private Point pointA;
    private Point pointB;
    private Point pointC;

    private ApplicationContext context = null;

    public Point getPointA() {
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw() {

        out.println("Point A = (" + getPointA().getX() + ", " + getPointA().getY() + ") ");
        out.println("Point B = (" + getPointB().getX() + ", " + getPointB().getY() + ") ");
        out.println("Point C = (" + getPointC().getX() + ", " + getPointC().getY() + ") ");
    }

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        this.context = context;
    }

    @Override
    public void setBeanName(String beanName) {
        out.println("Bean name is: " + beanName);
    }


    public void myInit(){
        out.println("myInit method called for Triangle1");
    }


    public void cleanUp() throws Exception {
        out.println("cleanUp method called for Triangle1");
    }
}
