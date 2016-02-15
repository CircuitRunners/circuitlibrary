package com.github.circuitrunners.calib;

import org.opencv.core.*;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.videoio.VideoCapture;

import java.util.ArrayList;
import java.util.Iterator;

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

    //	Constants for known variables
//	the height to the top of the target in first stronghold is 97 inches
    public static final int TOP_TARGET_HEIGHT = 97;
    //	the physical height of the camera lens
    public static final int TOP_CAMERA_HEIGHT = 32;

    //	camera details, can usually be found on the datasheets of the camera
    public static final double VERTICAL_FOV  = 51;
    public static final double HORIZONTAL_FOV  = 67;
    public static final double CAMERA_ANGLE = 10;

    public static VideoCapture videoCapture;
    public static Mat matOriginal, matHSV, matContour, matFilteredContour, clusters, matHeirarchy, matThresh;

    /* Commented workspace boys
    needed input: leftProjection, bottomProjection, rightProjection (left, bottom, right sides of seen target)
    also need solid angle of camera FoV + distance to seen target? also camera angle up/down

    cp always parallel with floor - use to find xz plane angle then combine with camera angle
    to find overall intersection of planes

    wtf angle of camera/overall angle isn't even necessary

    derive xy angle from angle of cp, then factor in distance (from ultrasonic?) to get the numbers that matter

    note to self: include input for offsets of camera to shooter (angle, x y z)
    *//*
    public static void filterRectangle(){
        ArrayList<MatOfPoint> contours = new ArrayList<MatOfPoint>();
        double x,y,targetX,targetY,distance,azimuth;
        matOriginal = new Mat();
        matThresh = new Mat();
        matHSV = new Mat();
        matContour = new Mat();
        matFilteredContour = new Mat();

        contours.clear();
        matOriginal = Imgcodecs.imread("3.jpg");
        //Imgproc.resize(matOriginal,matOriginal,0,0.5,0.5,Imgproc.INTER_LINEAR);
        Imgproc.cvtColor(matOriginal,matHSV,Imgproc.COLOR_BGR2HSV);
        Core.inRange(matHSV,LOWERBOUNDS,UPPERBOUNDS,matThresh);
        Imgproc.findContours(matThresh, contours, matHeirarchy, Imgproc.RETR_EXTERNAL, Imgproc.CHAIN_APPROX_SIMPLE);

        for (Iterator<MatOfPoint> iterator = contours.iterator(); iterator.hasNext();){
            MatOfPoint matOfPoint = (MatOfPoint) iterator.next();
            Rect rec = Imgproc.boundingRect(matOfPoint);
            if(rec.height < 25 || rec.width < 25){
                iterator.remove();
                continue;
            }
            float aspect = (float)rec.width/(float)rec.height;
            if(aspect < 1.0)
                iterator.remove();
        }
        for(MatOfPoint mop : contours){
            Rect rec = Imgproc.boundingRect(mop);
            Imgproc.rectangle(matOriginal, rec.br(), rec.tl(), BLACK);
        }
        if(contours.size() == 1){
            Rect rec = Imgproc.boundingRect(contours.get(0));
//				"fun" math brought to you by miss daisy (team 341)!
            y = rec.br().y + rec.height / 2;
            y= -((2 * (y / matOriginal.height())) - 1);
            distance = (TOP_TARGET_HEIGHT - TOP_CAMERA_HEIGHT) /
                    Math.tan((y * VERTICAL_FOV / 2.0 + CAMERA_ANGLE) * Math.PI / 180);
//				angle to target...would not rely on this
            targetX = rec.tl().x + rec.width / 2;
            targetX = (2 * (targetX / matOriginal.width())) - 1;
            azimuth = CalibMath.gyroLimit(targetX*HORIZONTAL_FOV /2.0 + 0);
//				drawing info on target
            Point center = new Point(rec.br().x-rec.width / 2 - 15,rec.br().y - rec.height / 2);
            Point centerw = new Point(rec.br().x-rec.width / 2 - 15,rec.br().y - rec.height / 2 - 20);
            Imgproc.putText(matOriginal, ""+(int)distance, center, Core.FONT_HERSHEY_PLAIN, 1, BLACK);
            Imgproc.putText(matOriginal, ""+(int)azimuth, centerw, Core.FONT_HERSHEY_PLAIN, 1, BLACK);
        }
//			output an image for debugging
        Imgcodecs.imwrite("output.png", matOriginal);
*/

    }

    public double[] detectCircle(String imagesrc){
        double[] array = new double[0]; //Placeholder until I figure out this shit
        return array;
    }

}
