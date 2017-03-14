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
public class Circle implements shape {

    private Points center;

    public Points getCenter() {
        return center;
    }

    public void setCenter(Points center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println("*******************************");
        System.out.println("drawing circle with center (" + getCenter().getX() + "," + getCenter().getY() + ").");
    }

}
