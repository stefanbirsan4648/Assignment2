/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.*;

/**
 *
 * @author birss0828
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating a city called kitchener

        City kitchener = new City(3, 10);

        //Create a Robot

        Robot romo = new Robot(kitchener, 2, 0, Direction.EAST);

        //Creating Hurdle Race

        new Wall(kitchener, 2, 0, Direction.SOUTH);
        new Wall(kitchener, 2, 1, Direction.SOUTH);
        new Wall(kitchener, 2, 2, Direction.SOUTH);
        new Wall(kitchener, 2, 3, Direction.SOUTH);
        new Wall(kitchener, 2, 4, Direction.SOUTH);
        new Wall(kitchener, 2, 5, Direction.SOUTH);
        new Wall(kitchener, 2, 6, Direction.SOUTH);
        new Wall(kitchener, 2, 7, Direction.SOUTH);
        new Wall(kitchener, 2, 8, Direction.SOUTH);
        new Wall(kitchener, 2, 0, Direction.EAST);
        new Wall(kitchener, 2, 1, Direction.EAST);
        new Wall(kitchener, 2, 3, Direction.EAST);
        new Wall(kitchener, 2, 6, Direction.EAST);

        //Create finish line for Robot

        new Thing(kitchener, 2, 8);
        while (true) {
            if (romo.frontIsClear() == false) {
                romo.turnLeft();


            }

            if (romo.frontIsClear()) {
                romo.move();
                romo.turnLeft();
                romo.turnLeft();
                romo.turnLeft();
            }
            if (romo.canPickThing()) {
                romo.turnLeft();
                break;
            }

        }
    }
}
