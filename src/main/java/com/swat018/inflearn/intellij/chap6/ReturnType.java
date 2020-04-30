package com.swat018.inflearn.intellij.chap6;

public class ReturnType {
    public void print() {
        Integer num = calculate();
        System.out.println(num);
    }

    private Integer calculate() { return 1; }
}
