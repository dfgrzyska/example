/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.factorymethod.game;

/**
 *
 * @author HP
 */
public class EasyObstacle implements Obstacle {

    private final String color = "green";
    private final double velocity = 1.25;
    private final float damage = 2;
    private final float speed = 1;

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getVelocity() {
        return velocity;
    }

    @Override
    public float getDamage() {
        return damage;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "EasyObstacle{" + "color=" + color + ", velocity=" + velocity + ", damage=" + damage + ", speed=" + speed + '}';
    }

}
