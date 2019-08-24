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
public class SimpleObstacleCreator implements ObstacleCreator {

    @Override
    public Obstacle create(String type) {
        switch (type) {
            case "easy":
                return new EasyObstacle();
            case "hard":
                return new HardObstacle();
            default:
                throw new RuntimeException("wrong value");
        }
    }
}
