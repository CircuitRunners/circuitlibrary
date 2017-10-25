package com.github.circuitrunners.akilib;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * Created by Akilan on 25.10.2017.
 */
public class JoystickHelper {

  public static double deadzone(double rawValue, double deadzoneLimit)
  {
    if(Math.abs(rawValue) < Math.abs(deadzoneLimit)) return 0;

    return rawValue;
  }
}

