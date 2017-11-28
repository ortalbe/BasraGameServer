package com.basra.game.Utils;

/**
 * Created by Ortal on 11/23/2017.
 */
public enum ErrorCode {

    ERROR(0, "error."),
    SUCCESS(1, "success"),
    WARNNING (2,"warning");

    private final int code;
    private final String description;

    ErrorCode(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return code + ": " + description;
    }

}
