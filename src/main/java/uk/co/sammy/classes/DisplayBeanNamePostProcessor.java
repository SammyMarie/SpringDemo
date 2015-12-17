package uk.co.sammy.classes;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import static java.lang.System.*;

/**
 * Created by smlif on 07/12/2015.
 */
public class DisplayBeanNamePostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        out.println("In Before Initilization method. Bean name is " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        out.println("In After Initilization method. Bean name is " + beanName);
        return bean;
    }
}
