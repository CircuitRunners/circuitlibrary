package com.github.circuitrunners.calib;


import org.opencv.core.Mat;
import org.opencv.core.MatOfPoint;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.videoio.VideoCapture;

import java.util.ArrayList;

/**
 * Shoutout to Fauge7 and team 3019 for teaching me wtf im doin
 */
public class CalibVision {
    public static final Scalar
    RED = new Scalar(0,0,255),
    BLUE = new Scalar(255,0,0),
    GREEN = new Scalar(0,255,0),
    BLACK = new Scalar(0,0,0),
    WHITE = new Scalar(255,255,255),
    LOWERBOUNDS = new Scalar(58,0,109),
    UPPERBOUNDS = new Scalar(93,255,240);

    public static VideoCapture videoCapture;
    public static Mat matOriginal, matHSL, matContour, matFilteredContour, clusters, matHeirarchy;
    /* Commented workspace boys
    needed input: leftProjection, bottomProjection, rightProjection (left, bottom, right sides of seen target)
    also need solid angle of camera FoV + distance to seen target? also camera angle up/down

    cp always parallel with floor - use to find xz plane angle then combine with camera angle
    to find overall intersection of planes

    wtf angle of camera/overall angle isn't even necessary

    derive xy angle from angle of cp, then factor in distance (from ultrasonic?) to get the numbers that matter

    note to self: include input for offsets of camera to shooter (angle, x y z)
    */
    public static void filterRectangle(){
        ArrayList<MatOfPoint> contours = new ArrayList<MatOfPoint>();
        double x,y,targetX,targetY,distance,azimuth;
        matOriginal = new Mat();
        matHSL = new Mat();
        matContour = new Mat();
        matFilteredContour = new Mat();

        matOriginal = Imgcodecs.imread("file.png");
        //Imgproc.resize(matOriginal,matOriginal,0,0.5,0.5,Imgproc.INTER_LINEAR);
        Imgproc.threshold()




    }

    public double[] detectCircle(String imagesrc){
        double[] array = new double[0]; //Placeholder until I figure out this shit
        return array;
    }

}
