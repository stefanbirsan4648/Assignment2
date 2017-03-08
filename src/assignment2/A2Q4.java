/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author birss0828
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city called kitchener

        City kitchener = new City();

        //Create a Robot

        Robot romo = new Robot(kitchener, 0, 0, Direction.EAST);

        //Create the Castle

        new Wall(kitchener, 1, 1, Direction.WEST);
        new Wall(kitchener, 1, 1, Direction.SOUTH);
        new Wall(kitchener, 1, 1, Direction.NORTH);
        new Wall(kitchener, 1, 1, Direction.EAST);

        new Wall(kitchener, 1, 4, Direction.WEST);
        new Wall(kitchener, 1, 4, Direction.NORTH);
        new Wall(kitchener, 1, 4, Direction.EAST);
        new Wall(kitchener, 1, 4, Direction.SOUTH);

        new Wall(kitchener, 4, 1, Direction.WEST);
        new Wall(kitchener, 4, 1, Direction.EAST);
        new Wall(kitchener, 4, 1, Direction.NORTH);
        new Wall(kitchener, 4, 1, Direction.SOUTH);

        new Wall(kitchener, 4, 4, Direction.EAST);
        new Wall(kitchener, 4, 4, Direction.WEST);
        new Wall(kitchener, 4, 4, Direction.SOUTH);
        new Wall(kitchener, 4, 4, Direction.NORTH);

        new Wall(kitchener, 2, 2, Direction.NORTH);
        new Wall(kitchener, 2, 3, Direction.NORTH);
        new Wall(kitchener, 2, 2, Direction.WEST);
        new Wall(kitchener, 3, 2, Direction.WEST);
        new Wall(kitchener, 3, 2, Direction.SOUTH);
        new Wall(kitchener, 3, 3, Direction.SOUTH);
        new Wall(kitchener, 2, 3, Direction.EAST);
        new Wall(kitchener, 3, 3, Direction.EAST);

        //if front is clear you move and turn right
        while (romo.frontIsClear()) {
            romo.move();
            romo.turnLeft();
            romo.turnLeft();
            romo.turnLeft();
            //if front is blocked you move left
            while (romo.frontIsClear() == false) {
                romo.turnLeft();

            }



        }























    }
}
