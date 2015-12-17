package uk.co.sammy.classes;

import org.springframework.beans.factory.BeanNameAware;
import static java.lang.System.*;

/**
 * Created by smlif on 06/12/2015.
 */
public class Triangle implements BeanNameAware{
    private String type;
    private int height;
    private String beanName;

    public Triangle(String type) {

        this.type = type;
    }

    public Triangle(String type, int height) {

        this.type = type;
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public int getHeight() {
        return height;
    }

    public void draw(){

        out.println("Triangle drawn" + ", it's an " + getType() + " & it's height is " + getHeight());
    }

    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName(){
        return beanName;
    }
}
