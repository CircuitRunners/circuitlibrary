package com.github.circuitrunners.akilib;

import edu.wpi.first.wpilibj.buttons.Button;

/**
 * Created by Akilan on 20.02.2016.
 */
public class XboxButton extends Button {

    private final Xbox xbox;
    private Xbox.Button button = null;
    private POVDirection direction = null;

    public XboxButton(Xbox xbox, Xbox.Button button) {
        this.xbox = xbox;
        this.button = button;
    }

    public XboxButton(Xbox xbox, POVDirection direction) {
        this.xbox = xbox;
        this.direction = direction;
    }

    @Override
    public boolean get() {
        if (button != null) return xbox.get(button);
        else if (direction != null) return xbox.getPOV() == direction.getAngle();
        return false;
    }
}