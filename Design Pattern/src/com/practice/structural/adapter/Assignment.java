package com.practice.structural.adapter;

public class Assignment {

    Pen p = new PenAdapter();

    public void writeAssignment(String str){
        p.write(str);
    }
}
