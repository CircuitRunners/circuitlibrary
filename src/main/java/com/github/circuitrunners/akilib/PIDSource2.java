package com.github.circuitrunners.akilib;

import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.PIDSourceType;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Akilan on 20.02.2016.
 */
public class PIDSource2 implements PIDSource {

    private PIDSourceType pidSourceType = PIDSourceType.kDisplacement;
    private Object rawValueSourceObject;
    private Method rawValueSource;
    private Object[] rawValueSourceArgs;

    public PIDSource2(Object rawValueSourceObject, Method rawValueSource, Object... rawValueSourceArgs) {
        this.rawValueSourceObject = rawValueSourceObject;
        this.rawValueSource = rawValueSource;
        this.rawValueSourceArgs = rawValueSourceArgs;
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
        try {
            if (rawValueSourceArgs.length == 0) return (double) rawValueSource.invoke(rawValueSourceObject);
            return (double) rawValueSource.invoke(rawValueSourceObject, rawValueSourceArgs);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
