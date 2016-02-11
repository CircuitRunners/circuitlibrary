package com.github.circuitrunners.calib;

/**
 * Useful CalibMath, living creatures
 */
public class CalibMath {
/** Turns a -1 to 1 into 0 to 1 value */
    public static double throttleMath(double input){
        double output = (input+1)/2;
        return output;
    }
/**
 *  Adds deadband, then scales input by a factor linearly.
 *  Produces a straight line
 *  @param input: value to scale, -1 <= x <= 1
 *  @param min: deadband value, anything less will return 0, 0 < x <= 1
 *  @param scale: factor to scale down by, also max value, min < x < 1
 *  @return will max out at input = 1
 */
    public static double scaleLinear(double input, double min, double scale) {
        double output;
        if(Math.abs(input) < min) {
            output = 0;
        }
        else {
            output = scale * input;
        }
        return output;
    }

    /**
     * Adds deadband, then scales by a power, then scales by a constant, then sets a max value
     * Produces a radical-shaped curve
     * @param input: value to scale, -1 <= x <= 1
     * @param min: deadband value, anything less will return 0, 0 < x <= 1
     * @param scale factor to scale by, also the max value, min < x < 1
     * @param power power to scale by, 1 <= x
     * @return will max out at input = scale
     */
    public static double scaleDoubleFlat(double input, double min, double scale, double power){
        double output;
        if(Math.abs(input) < min) {
            output = 0;
        }
        else if(Math.abs(input) > scale){
            output = Math.signum(input) * scale;
        }
        else{
            output = scale * Math.signum(input) * Math.abs(Math.pow(input/scale,power));
        }
        return output;
    }

    /**
     * Adds deadband, then scales by a power, then scales by a constant
     * Produces an upwards concavity curve
     * @param input: value to scale, -1 <= x <= 1
     * @param min: deadband value, anything less will return 0, 0 < x <= 1
     * @param scale factor to scale by, also the max value, min < x < 1
     * @param power power to scale by, 1 <= x
     * @return will max out at input = 1
     */

    public static double scalePower(double input, double min, double scale, double power){
        double output;
        if(Math.abs(input) < min) {
            output = 0;
        }
        else {
            output = scale * Math.signum(input) * Math.abs(Math.pow(input,power));
        }
        return output;
    }

    /**
     * If input is smaller than a min value returns 0
     * @param input: value to deadband
     * @param min: minimum value to return > 0
     * @return
     */
    public static double deadband(double input, double min){
        double output;
        if(Math.abs(input) < min) {
            output = 0;
        }
        else {
            output = input;
        }
        return output;
    }

    /**
     * If input is smaller than a min value returns 0, if input is larger than max value returns max
     * @param input: value to deadband
     * @param min: minimum value to return > 0
     * @param max: maximum value to return
     * @return
     */
    public static double deadband(double input, double min, double max){
        double output;
        if(Math.abs(input) < min) {
            output = 0;
        }
        else if(Math.abs(input) > max ) {
            output = Math.signum(input) * max;
        }
        else {
            output = input;
        }
        return output;
    }

    /**
     * Adds a deadband but retains full range of values linearly. Breaks horribly if input goes above 1.
     * turns this
     * |--1--2--3--4--5--|
     * into this
     * ______|-1-2-3-4-5-|
     * @param input: value to deadband
     * @param min: value at which >0 begins
     * @return
     */
    public static double adjustedDeadband(double input, double min){
        double output = 0;
        double scale = 1 / (1 - min);
        if(Math.abs(input) >= min){
            output = Math.signum(input) * (Math.abs(input) - min) * scale;
        }
        return output;
    }

    /**
     * Finds the magnitude of input vector
     * @param input: double array of vector values
     * @return positive number
     */
    public static double magnitude(double[] input){
        double sum = 0;
        for (int i=0; i<input.length; i++){
            sum += input[i] * input[i];
        }
        return Math.sqrt(sum);
    }

    /**
     * Finds dotproduct of input vectors
     * @param a: double array of vector A
     * @param b: double array of vector B
     * @return
     */
    public static double dotProduct(double[] a, double[] b){
        if (a.length != b.length) return 0;
        double sum = 0;
        for (int i=0; i<a.length; i++){
            sum += a[i] * b[i];
        }
        return sum;
    }

    /**
     * Finds angle between two vectors
     * @param a: double array of vector A
     * @param b: double array of vector B
     * @return
     */
    public static double angle(double[] a, double[] b){
        if (a.length != b.length) return 0;
        double dot = dotProduct(a,b);
        double magA = magnitude(a);
        double magB = magnitude(b);
        return Math.acos(dot/(magA*magB));
    }
}
