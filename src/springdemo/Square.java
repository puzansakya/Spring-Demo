/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springdemo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 *
 * @author puzan
 */
//these methods are called before creation o the beans and after the destruction of the beans...
// this class is an example to demonstrate the lifecycvle callbacks of the beans
//initializing beans means creation of the beans
//implementing disposablebeans class means handling the event of the destruction of the beans.
public class Square implements shape, InitializingBean, DisposableBean {

    //dependecy injection injecting object points in square. It needs to implement the initializingBean class.
    private Points pointA;
    private Points pointB;
    private Points pointC;
    private Points pointD;

    public Points getPointA() {
        return pointA;
    }

    public void setPointA(Points pointA) {
        this.pointA = pointA;
    }

    public Points getPointB() {
        return pointB;
    }

    public void setPointB(Points pointB) {
        this.pointB = pointB;
    }

    public Points getPointC() {
        return pointC;
    }

    public void setPointC(Points pointC) {
        this.pointC = pointC;
    }

    public Points getPointD() {
        return pointD;
    }

    public void setPointD(Points pointD) {
        this.pointD = pointD;
    }

    @Override
    public void draw() {
        System.out.println("*******************************");
        System.out.println("Drawing Square...");
        System.out.println("Point A = " + "(" + getPointA().getX() + "," + getPointA().getY() + ")");
        System.out.println("Point B = " + "(" + getPointB().getX() + "," + getPointB().getY() + ")");
        System.out.println("Point C = " + "(" + getPointC().getX() + "," + getPointC().getY() + ")");
        System.out.println("Point D = " + "(" + getPointD().getX() + "," + getPointD().getY() + ")");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing beans: init method called for square...");
    }

    //you can create the custom init method and mentioning it in square bean tag as init-method and pass the method name. Same applies for the destroy-method .
    // can be declared at global level and doesnot need to be done for each beans by using default-init-method and default-destroy-method in beans tag.
    @Override
    public void destroy() throws Exception {
        System.out.println("*******************************");
        System.out.println("Destroying beans: Destroy method is called for square...");
    }

}
