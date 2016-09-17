package edu.madisoncollege.entjava;


import java.io.*;

import org.apache.log4j.*;
import sun.rmi.runtime.Log;

/**
 * Created by paulawaite on 9/7/16.
 *
 * This exercise is taken from the 2015 Advent of Code challenge, Day 1 (http://adventofcode.com/day/1). It will provide you
 * with more practice in our environment, reading files, logging and unit testing.
 *
 * Here is the problem to solve:
 *
 * "Santa is trying to deliver presents in a large apartment building, but he can't find the right floor -
 * the directions he got are a little confusing. He starts on the ground floor (floor 0) and then follows
 * the instructions one character at a time.
 *
 * An opening parenthesis, (, means he should go up one floor, and a closing parenthesis, ), means he should go down one floor.
 *
 * The apartment building is very tall, and the basement is very deep; he will never find the top or bottom floors.
 *
 * For example:
 * (()) and ()() both result in floor 0.  <= this would make a good unit test!
 * ((( and (()(()( both result in floor 3.
 * ))((((( also results in floor 3.
 * ()) and ))( both result in floor -1 (the first basement level).
 * ))) and )())()) both result in floor -3."
 *
 * Your goal is to determine what floor Santa will be on when he uses the directions in the file SantaUpDown.txt
 *
 * Do NOT create a main method in your application, you will use only unit tests to find the answer.
 * Add log4j to your code.  At minimum you should log an error if there is a problem reading the file.
 *
 * When submitting your code, include screenshots showing
 * 1) The answer, i.e., what floor is Santa on?
 * 2) How much code coverage you achieved (what percent?).
 *
 */

public class SantaInAnElevator {
    private Logger logger = Logger.getLogger(this.getClass());

    private StringBuffer movements;

    public StringBuffer getMovements() {
        return movements;
    }

    public void setMovements(StringBuffer movements) {
        this.movements = movements;
    }

    public int getDeliveryFloor() {
        int floor = 0;
        for (int idx = 0; idx< movements.length(); idx++) {
            if (movements.charAt(idx) == '(') {
                floor++;
            } else if (movements.charAt(idx) == ')') {
                floor--;
            }
        }
        return floor;
    }

    public void processDirections(String directionsFile) throws IOException {
        movements = new StringBuffer();
        String line ;
        BufferedReader in = new BufferedReader(new FileReader(directionsFile));

        while (in.ready()) {
            line = in.readLine();
            movements.append(line);
        }

        in.close();

        this.getDeliveryFloor();
    }


}