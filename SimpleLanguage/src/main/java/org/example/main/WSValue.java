package org.example.main;

import java.util.Objects;

/**
 * @author HDU_WS
 * @Classname WSValue
 * @Description TODO
 * @Date 2021/8/13 16:32
 * @Created by TheKing_Shun
 */

public class WSValue implements Comparable<WSValue>{

    public static final WSValue NULL = new WSValue();
    public static final WSValue VOID = new WSValue();

    private Object value;

    private WSValue() {
        this.value = new Object();
    }

    public WSValue(Object v) {
        if (v == null) {
            throw new RuntimeException("v == null");
        }
        value = v;
        if (!isString() && !isNumber()) {
            throw new RuntimeException("invalid data type " + v + "->" + v.getClass());
        }
    }

    public String asString() {
        return (String) value;
    }

    public Long asLong() {
        return (Long) value;
    }

    public Double asDouble() {
        return (Double) value;
    }











    public boolean isNumber() {
        return value instanceof Number ;
    }

    public boolean isString() {
        return value instanceof String;
    }

    @Override
    public int compareTo(WSValue that) {
        if (this.isNumber() && that.isNumber()) {
            if (this.equals(that)) {
                return 0;
            } else {
                return this.asLong().compareTo(that.asLong());
            }
        } else if (this.isString() && that.isString()) {
            return this.asString().compareTo(that.asString());
        } else {
            throw new RuntimeException("illegal expression");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == VOID || o == VOID) {
            throw new RuntimeException("?");
        }
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        WSValue that = (WSValue) o;
        if (this.isNumber() && that.isNumber()) {
            double diff = Math.abs(this.asDouble() - that.asDouble());
            return diff < 0.0000001;
        } else {

            return this.value.equals(that.value);
        }
    }

    @Override
    public String toString() {
        return isNull() ? "NULL" : isVoid() ? "VOID" : String.valueOf(value);
    }

    private boolean isVoid() {
        return this == VOID;
    }

    private boolean isNull() {
        return this == NULL;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
