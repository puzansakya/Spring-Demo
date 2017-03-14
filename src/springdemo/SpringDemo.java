/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springdemo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author puzan
 */
public class SpringDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Triangle triangle =  new Triangle();

        //this class is independent of the shape instantiated.
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        //registershutdownhook method destroys the context if the program is terminated.
        context.registerShutdownHook();
        //can get bean
        //shape shape = (shape) context.getBean("triangle");

        //can also use alias.
        shape shape = (shape) context.getBean("triangle-alias");
        shape.draw();

        shape shape1 = (shape) context.getBean("circle");
        shape1.draw();

        shape shape2 = (shape) context.getBean("square");
        shape2.draw();

    }
 
}
