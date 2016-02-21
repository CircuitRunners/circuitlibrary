package com.github.circuitrunners.akilib;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * Created by Owner on 2/9/2016.
 */
public class Xbox extends Joystick {

    private final int port;
    private final Joystick controller;
    public final JoystickButton a;
    public final JoystickButton b;
    public final JoystickButton x;
    public final JoystickButton y;
    public final JoystickButton start;
    public final JoystickButton back;
    public final JoystickButton leftBumper;
    public final JoystickButton rightBumper;
    public final JoystickButton l3;
    public final JoystickButton r3;


    public Xbox(final int port) {
        super(port);
        this.port = port;
        this.controller = new Joystick(this.port);
        this.a = new JoystickButton(this.controller, 1);
        this.b = new JoystickButton(this.controller, 2);
        this.x = new JoystickButton(this.controller, 3);
        this.y = new JoystickButton(this.controller, 4);
        this.start = new JoystickButton(this.controller, 7);
        this.back = new JoystickButton(this.controller, 8);
        this.leftBumper = new JoystickButton(this.controller, 5);
        this.rightBumper = new JoystickButton(this.controller, 6);
        this.l3 = new JoystickButton(this.controller, 9);
        this.r3 = new JoystickButton(this.controller, 10);

    }

    public Xbox() {
        this(0);
    }

    public boolean get(Button button) {
        switch (button) {
            case A:
                return a.get();
            case B:
                return b.get();
            case X:
                return x.get();
            case Y:
                return y.get();
            case LEFT_BUMPER:
                return leftBumper.get();
            case RIGHT_BUMPER:
                return rightBumper.get();
            case L3:
                return l3.get();
            case R3:
                return r3.get();
            case BACK:
                return back.get();
            case START:
                return start.get();
        }
        return false;
    }

    public double get(Axis axis) {
        switch (axis) {
            case LEFT_X:
                return getRawAxis(0);
            case LEFT_Y:
                return getRawAxis(1);
            case RIGHT_X:
                return getRawAxis(4);
            case RIGHT_Y:
                return getRawAxis(5);
            case TRIGGER:
                return getRawAxis(3);
        }
        return 0;
    }

    public enum Button {
        A, B, X, Y, LEFT_BUMPER, RIGHT_BUMPER, L3, R3, BACK, START
    }

    public enum Axis {
        LEFT_X, LEFT_Y, RIGHT_X, RIGHT_Y, TRIGGER
    }
}

