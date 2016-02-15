package com.akilib;

import edu.wpi.first.wpilibj.NamedSendable;
import edu.wpi.first.wpilibj.Sendable;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * Created by Akilan on 14.02.2016.
 */
public class SmartDashboard2 extends SmartDashboard {

    public static void put(String key, boolean value) {
        putBoolean(key, value);
    }

    public static void put(String key, String value) {
        putString(key, value);
    }

    public static void put(String key, byte value) {
        putNumber(key, value);
    }
    public static void put(String key, short value) {
        putNumber(key, value);
    }
    public static void put(String key, int value)  {
        putNumber(key, value);
    }
    public static void put(String key, long value)  {
        putNumber(key, value);
    }
    public static void put(String key, float value) {
        putNumber(key, value);
    }
    public static void put(String key, double value) {
        putNumber(key, value);
    }

    public static void put(String key, Sendable value) {
        putData(key, value);
    }
    public static void put(NamedSendable value) {
        putData(value);
    }

    public static boolean get(String key, boolean defaultValue) {
        return getBoolean(key, defaultValue);
    }
    public static byte get(String key, byte defaultValue) {
        return (byte) getNumber(key, defaultValue);
    }
    public static short get(String key, short defaultValue) {
        return (short) getNumber(key, defaultValue);
    }
    public static int get(String key, int defaultValue) {
        return (int) getNumber(key, defaultValue);
    }
    public static long get(String key, long defaultValue) {
        return (long) getNumber(key, defaultValue);
    }
    public static float get(String key, float defaultValue) {
        return (float) getNumber(key, defaultValue);
    }
    public static double get(String key, double defaultValue) {
        return getNumber(key, defaultValue);
    }
    public static String get(String key, String defaultValue) {
        return getString(key, defaultValue);
    }
}
