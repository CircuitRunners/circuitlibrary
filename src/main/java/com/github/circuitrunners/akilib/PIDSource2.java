package com.github.circuitrunners.akilib;

import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.PIDSourceType;

/**
 * Created by Akilan on 20.02.2016.
 */
public class PIDSource2 implements PIDSource {

    private PIDSourceType pidSourceType = PIDSourceType.kDisplacement;
    private double pidSourceValue;

    public PIDSource2(double pidSourceValue) {
        this.pidSourceValue = pidSourceValue;
    }

    @Override
    public void setPIDSourceType(PIDSourceType pidSource) {
        pidSourceType = pidSource;
    }

    @Override
    public PIDSourceType getPIDSourceType() {
        return pidSourceType;
    }

    @Override
    public double pidGet() {
        return pidSourceValue;
    }
}
