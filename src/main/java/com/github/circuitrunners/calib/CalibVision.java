package com.github.circuitrunners;


/**
 * Created by Owner on 2/4/2016.
 */
public class CalibVision {

    /* Commented workspace boys
    needed input: leftProjection, bottomProjection, rightProjection (left, bottom, right sides of seen target)
    also need solid angle of camera FoV + distance to seen target? also camera angle up/down

    cp always parallel with floor - use to find xz plane angle then combine with camera angle
    to find overall intersection of planes

    wtf angle of camera/overall angle isn't even necessary

    derive xy angle from angle of cp, then factor in distance (from ultrasonic?) to get the numbers that matter

    note to self: include input for offsets of camera to shooter (angle, x y z)
    */

    public double[] detectCircle(String imagesrc){
        double[] array = new double[0]; //Placeholder until I figure out this shit
        return array;
    }

}
