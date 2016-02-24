package com.github.circuitrunners.akilib;

import edu.wpi.first.wpilibj.buttons.Button;

/**
 * Created by Akilan on 20.02.2016.
 */
public class XboxButton extends Button {

    private final Xbox xbox;
    private final Xbox.Button button;

    public XboxButton(Xbox xbox, Xbox.Button button) {
        this.xbox = xbox;
        this.button = button;
    }

    @Override
    public boolean get() {
        return xbox.get(button);
    }
}