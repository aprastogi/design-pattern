package com.practice.structural.adapter;

public class PenAdapter implements Pen{

    PilotPen p = new PilotPenImpl();

    @Override
    public void write(String str) {
        p.mark(str);
    }
}
