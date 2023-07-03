package com.practice.structural.adapter;

public class PilotPenImpl implements PilotPen{

    @Override
    public void mark(String str) {
        System.out.println(str);
    }
}
