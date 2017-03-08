/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author birss0828
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create city for Robot called kitchener

        City kitchener = new City();

        //Create a Robot

        Robot romo = new Robot(kitchener, 1, 1, Direction.EAST);

        //Create Things

        new Thing(kitchener, 1, 2);
        new Thing(kitchener, 1, 3);
        new Thing(kitchener, 1, 4);
        new Thing(kitchener, 1, 5);
        new Thing(kitchener, 1, 6);
        new Thing(kitchener, 1, 7);
        new Thing(kitchener, 1, 8);
        new Thing(kitchener, 1, 9);
        new Thing(kitchener, 1, 10);
        new Thing(kitchener, 1, 11);

        // Create a loop to move forward and pick 7 things up and stop at 1, 12
        romo.move();
        while (romo.canPickThing()) {
            if (romo.countThingsInBackpack() < 7) {
                romo.pickThing();
            }

            romo.move();

        }










    }
}
