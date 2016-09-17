package edu.madisoncollege.entjava;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import edu.madisoncollege.entjava.*;

import static org.junit.Assert.*;

/**
 * Created by student on 9/17/16.
 */
public class SantaInAnElevatorTest {
    public SantaInAnElevator santaInAnElevator;



    @Before
    public void setUp() throws Exception {
        santaInAnElevator = new SantaInAnElevator();

    }

    @Test
    public void getDeliveryFloorTest(){

        StringBuffer movements1 = new StringBuffer("(())");
        StringBuffer movements2 = new StringBuffer("()()");
        StringBuffer movements3 = new StringBuffer("))(((((");
        StringBuffer movements4 = new StringBuffer(")())())");
        santaInAnElevator.setMovements(movements1);
        assertTrue("Santa is supposed to be on floor 0",santaInAnElevator.getDeliveryFloor()==0);
        santaInAnElevator.setMovements(movements2);
        assertTrue("Santa is supposed to be on floor 0",santaInAnElevator.getDeliveryFloor()==0);
        santaInAnElevator.setMovements(movements3);
        assertTrue("Santa is supposed to be on floor 3",santaInAnElevator.getDeliveryFloor()==3);
        santaInAnElevator.setMovements(movements4);
        assertTrue("Santa is supposed to be on basement 3",santaInAnElevator.getDeliveryFloor()==-3);
    }

    @Test
    public void deliveryFloorForSantaTest() throws Exception {

        santaInAnElevator.processDirections(this.getClass().getResource("/SantaUpDown.txt").getPath());
        assertEquals("Santa is not right floor", 138, santaInAnElevator.getDeliveryFloor());

    }

    @Test(expected = FileNotFoundException.class)
    public void readFileNotFoundTest() throws IOException {

            santaInAnElevator.processDirections("/wrongFileName.txt");


    }
}