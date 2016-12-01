package com.reikratei.spring.batch.entities;

/**
 * @author manuel
 * @version 12/1/16
 */
public class Number {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void add(Number number) {
        this.number += number.getNumber();
    }
}
