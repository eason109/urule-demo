package com.eason.course.vo;

public enum SexEnum {

    MALE(true, "男"), FAMALE(false, "");

    private boolean gender;
    private String value;

    SexEnum(boolean gender, String value) {
        this.gender = gender;
        this.value = value;
    }

    public boolean getGender() {
        return gender;
    }

    public String getValue() {
        return value;
    }
}
