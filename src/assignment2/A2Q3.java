/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author birss0828
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a city called kitchener

        City kitchener = new City();

        //Create a Robot

        Robot romo = new Robot(kitchener, 0, 0, Direction.EAST);
        //Create thing
        new Thing(kitchener, 0, 0);

        while (romo.frontIsClear()) {
            romo.move();
            romo.turnLeft();
            romo.turnLeft();
            romo.turnLeft();

            if (romo.canPickThing()) {
                break;
            }
        }
    }
}
