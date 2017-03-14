/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springdemo;

/**
 *
 * @author puzan
 */
public class Triangle implements shape {

    //dependecy injection injecting object points in triangle.
    private Points pointA;
    private Points pointB;
    private Points pointC;

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

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

    @Override
    public void draw() {
        System.out.println("*******************************");
        System.out.println("drawing " + getType() + " triangle...");
        System.out.println("Point A = " + "(" + getPointA().getX() + "," + getPointA().getY() + ")");
        System.out.println("Point B = " + "(" + getPointB().getX() + "," + getPointB().getY() + ")");
        System.out.println("Point C = " + "(" + getPointC().getX() + "," + getPointC().getY() + ")");
    }

}
