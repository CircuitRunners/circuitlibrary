package com.github.circuitrunners.akilib;

/**
 * Created by Akilan on 21.02.2016.
 */
public enum POVDirection {
    UP,
    UP_RIGHT,
    RIGHT,
    DOWN_RIGHT,
    DOWN,
    DOWN_LEFT,
    LEFT,
    UP_LEFT;

    private static final int ANGLE_INTERVAL = 45;

    public int getAngle() {
        return ordinal() * ANGLE_INTERVAL;
    }
}
