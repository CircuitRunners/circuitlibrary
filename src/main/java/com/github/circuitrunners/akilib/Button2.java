package com.github.circuitrunners.akilib;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.buttons.Button;

/**
 * Created by Akilan on 21.02.2016.
 */
public class Button2 extends Button {

    private GenericHID joystick;
    private int direction = -1;
    private int axis = -1;
    private double value;
    private double tolerance = 0.1;

    public Button2(GenericHID joystick, int axis, double value) {
        this.joystick = joystick;
        this.axis = axis;
        this.value = value;
    }

    public Button2(GenericHID joystick, POVDirection direction) {
        this.joystick = joystick;
        this.direction = direction.getAngle();
    }

    @Override
    public boolean get() {
        return axis == -1 ? getPOV() : getAxis();
    }

    private boolean getAxis() {
        double axisValue = joystick.getRawAxis(axis);
        return axisValue >= value && axisValue <= tolerance ||
               axisValue <= value && axisValue >= -tolerance;
    }

    private boolean getPOV() {
        return joystick.getPOV() == direction;
    }

    public void setTolerance(double tolerance) {
        this.tolerance = tolerance;
    }

    public double getTolerance() {
        return tolerance;
    }
}
