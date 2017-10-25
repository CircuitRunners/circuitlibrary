package com.github.circuitrunners.akilib;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * Created by Akilan on 19.02.2016.
 */
public class Xbox extends Joystick {

    private static final double DEFAULT_DEADZONE_LIMIT = 0.05;

    private final int port;
    private final JoystickButton a;
    private final JoystickButton b;
    private final JoystickButton x;
    private final JoystickButton y;
    private final JoystickButton leftBumper;
    private final JoystickButton rightBumper;
    private final JoystickButton back;
    private final JoystickButton start;
    private final JoystickButton l3;
    private final JoystickButton r3;


    public Xbox(final int port) {
        super(port);
        this.port = port;
        a = new JoystickButton(this, 0);
        b = new JoystickButton(this, 1);
        x = new JoystickButton(this, 2);
        y = new JoystickButton(this, 3);
        leftBumper = new JoystickButton(this, 4);
        rightBumper = new JoystickButton(this, 5);
        back = new JoystickButton(this, 6);
        start = new JoystickButton(this, 7);
        l3 = new JoystickButton(this, 8);
        r3 = new JoystickButton(this, 9);

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
            case BACK:
                return back.get();
            case START:
                return start.get();
            case L3:
                return l3.get();
            case R3:
                return r3.get();
        }
        return false;
    }

    public double get(Axis axis) {
        switch (axis) {
            case LEFT_X:
                return JoystickHelper.deadzone(getRawAxis(0), DEFAULT_DEADZONE_LIMIT);
            case LEFT_Y:
              return JoystickHelper.deadzone(getRawAxis(1), DEFAULT_DEADZONE_LIMIT);
            case TRIGGER:
              return JoystickHelper.deadzone(getRawAxis(3), DEFAULT_DEADZONE_LIMIT);
            case RIGHT_X:
              return JoystickHelper.deadzone(getRawAxis(4), DEFAULT_DEADZONE_LIMIT);
            case RIGHT_Y:
              return JoystickHelper.deadzone(getRawAxis(5), DEFAULT_DEADZONE_LIMIT);
        }
        return 0;
    }

    public enum Button {
        A, B, X, Y, LEFT_BUMPER, RIGHT_BUMPER, L3, R3, BACK, START
    }

    public enum Axis {
        LEFT_X, LEFT_Y, TRIGGER, RIGHT_X, RIGHT_Y
    }
}

