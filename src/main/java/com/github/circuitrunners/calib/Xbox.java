package com.github.circuitrunners;

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


    public Xbox(final int port){
        super(port);
        this.port = port;
        this.controller = new Joystick(this.port);
        this.a = new JoystickButton(this.controller,1);
        this.b = new JoystickButton(this.controller,2);
        this.x = new JoystickButton(this.controller,3);
        this.y = new JoystickButton(this.controller,4);
        this.start = new JoystickButton(this.controller,7);
        this.back = new JoystickButton(this.controller,8);
        this.leftBumper = new JoystickButton(this.controller,5);
        this.rightBumper = new JoystickButton(this.controller,6);
        this.l3 = new JoystickButton(this.controller,9);
        this.r3 = new JoystickButton(this.controller,10);

    }
    public Xbox(){
        this(0);
    }


    public boolean getA(){
        return this.a.get();
    }

    public boolean getB(){
        return this.b.get();
    }

    public boolean getXbutton(){
        return this.x.get();
    }

    public boolean getYbutton(){
        return this.y.get();
    }

    public boolean getStart(){
        return this.start.get();
    }

    public boolean getBack(){
        return this.back.get();
    }

    public boolean getRightBumper(){
        return this.rightBumper.get();
    }

    public boolean getLeftBumper(){
        return this.leftBumper.get();
    }

    public double getLeftX(){
        return this.getRawAxis(0);
    }

    public double getLeftY(){
        return this.getRawAxis(1);
    }

    public double getRightX(){
        return this.getRawAxis(4);
    }

    public double getRightY(){
        return this.getRawAxis(5);
    }

    public boolean getL3(){
        return this.l3.get();
    }

    public boolean getR3(){
        return this.r3.get();
    }
}

