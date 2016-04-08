package com.github.circuitrunners.akilib;

import edu.wpi.first.wpilibj.NamedSendable;
import edu.wpi.first.wpilibj.Sendable;
import edu.wpi.first.wpilibj.networktables.NetworkTable;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.tables.ITable;

import java.util.HashMap;

/**
 * Created by Akilan on 14.02.2016.
 */
public class SmartDashboard2 extends SmartDashboard {

    private static boolean network;
    private static HashMap<String, Object> dashboard = new HashMap<>();

    public static void setNetwork(boolean send) {
        network = send;
    }

    private static ITable table = NetworkTable.getTable("SmartDashboard");

    public static boolean put(String key, boolean value) {
        if (network) {
            putBoolean(key, value);
        } else {
            dashboard.put(key, value);
        }
        return value;
    }

    public static String put(String key, String value) {
        if (network) {
            putString(key, value);
        } else {
            dashboard.put(key, value);
        }
        return value;
    }

    public static byte put(String key, byte value) {
        if (network) {
            putNumber(key, value);
        } else {
            dashboard.put(key, value);
        }
        return value;
    }
    public static short put(String key, short value) {
        if (network) {
            putNumber(key, value);
        } else {
            dashboard.put(key, value);
        }
        return value;
    }
    public static int put(String key, int value)  {
        if (network) {
            putNumber(key, value);
        } else {
            dashboard.put(key, value);
        }
        return value;
    }
    public static long put(String key, long value)  {
        if (network) {
            putNumber(key, value);
        } else {
            dashboard.put(key, value);
        }
        return value;
    }
    public static float put(String key, float value) {
        if (network) {
            putNumber(key, value);
        } else {
            dashboard.put(key, value);
        }
        return value;
    }
    public static double put(String key, double value) {
        if (network) {
            putNumber(key, value);
        } else {
            dashboard.put(key, value);
        }
        return value;
    }

    public static Sendable put(String key, Sendable value) {
        if (network) {
            putData(key, value);
        } else {
            dashboard.put(key, value);
        }
        return value;
    }
    public static NamedSendable put(NamedSendable value) {
        if (value != null) {
            if (network) {
                putData(value);
            } else {
                dashboard.put(value.getName(), value);
            }
        }
        return value;
    }

    public static boolean get(String key, boolean defaultValue) {
        if (network) {
            if (!table.containsKey(key)) {
                putBoolean(key, defaultValue);
                return defaultValue;
            }
            return getBoolean(key, defaultValue);
        } else {
            if (!dashboard.containsKey(key)) {
                dashboard.put(key, defaultValue);
                return defaultValue;
            }
            return (boolean) dashboard.get(key);
        }
    }
    public static byte get(String key, byte defaultValue) {
        if (network) {
            if (!table.containsKey(key)) {
                putNumber(key, defaultValue);
                return defaultValue;
            }
            return (byte) getNumber(key, defaultValue);
        } else {
            if (!dashboard.containsKey(key)) {
                dashboard.put(key, defaultValue);
                return defaultValue;
            }
            return (byte) dashboard.get(key);
        }

    }

    public static short get(String key, short defaultValue) {
        if (network) {
            if (!table.containsKey(key)) {
                putNumber(key, defaultValue);
                return defaultValue;
            }
            return (short) getNumber(key, defaultValue);
        } else {
            if (!dashboard.containsKey(key)) {
                dashboard.put(key, defaultValue);
                return defaultValue;
            }
            return (short) dashboard.get(key);
        }

    }
    public static int get(String key, int defaultValue) {
        if (network) {
            if (!table.containsKey(key)) {
                putNumber(key, defaultValue);
                return defaultValue;
            }
            return (int) getNumber(key, defaultValue);
        } else {
            if (!dashboard.containsKey(key)) {
                dashboard.put(key, defaultValue);
                return defaultValue;
            }
            return (int) dashboard.get(key);
        }
    }
    public static long get(String key, long defaultValue) {
        if (network) {
            if (!table.containsKey(key)) {
                putNumber(key, defaultValue);
                return defaultValue;
            }
            return (long) getNumber(key, defaultValue);
        } else {
            if (!dashboard.containsKey(key)) {
                dashboard.put(key, defaultValue);
                return defaultValue;
            }
            return (long) dashboard.get(key);
        }
    }
    public static float get(String key, float defaultValue) {
        if (!table.containsKey(key)) putNumber(key, defaultValue);
        return (float) getNumber(key, defaultValue);
    }
    public static double get(String key, double defaultValue) {
        if (!table.containsKey(key)) putNumber(key, defaultValue);
        return getNumber(key, defaultValue);
    }
    public static String get(String key, String defaultValue) {
        if (!table.containsKey(key)) putString(key, defaultValue);
        return getString(key, defaultValue);
    }

    public static Sendable get(String key, Sendable defaultValue) {
        if (!table.containsKey(key)) putData(key, defaultValue);
        return getData(key);
    }

    public static Sendable get(String key, NamedSendable defaultValue) {
        if (defaultValue != null && !table.containsKey(key)) putData(defaultValue);
        return getData(key);
    }
}
