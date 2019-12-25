package com.mrle.entity;

public enum Type {
    RED(1,"RED"),
    BLACK(2,"BLACK");

    private Integer code;
    private String discribe;

    public Integer getCode() {
        return code;
    }

    public String getDiscribe() {
        return discribe;
    }

    private Type(Integer code, String discribe){
        this.code = code;
        this.discribe = discribe;
    }
}
