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

    public static Object get(String key, NetworkTableType networkTableType) {
        switch (networkTableType) {
            case BOOLEAN:
                return getBoolean(key);
            case STRING:
                return getString(key);
            case NUMBER:
                return getNumber(key);
            case DATA:
                return getData(key);
        }
        return null;
    }

    public static void get(String key, boolean defaultValue) {
        getBoolean(key, defaultValue);
    }
    public static void get(String key, byte defaultValue) {
        getNumber(key, defaultValue);
    }
    public static void get(String key, short defaultValue) {
        getNumber(key, defaultValue);
    }
    public static void get(String key, int defaultValue) {
        getNumber(key, defaultValue);
    }
    public static void get(String key, long defaultValue) {
        getNumber(key, defaultValue);
    }
    public static void get(String key, float defaultValue) {
        getNumber(key, defaultValue);
    }
    public static void get(String key, double defaultValue) {
        getNumber(key, defaultValue);
    }
    public static void get(String key, String defaultValue) {
        getString(key, defaultValue);
    }

    public enum NetworkTableType {
        BOOLEAN, STRING, NUMBER, DATA
    }
}
