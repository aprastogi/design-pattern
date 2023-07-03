package com.practice.structural.composite;

public class Main {
    public static void main(String[] args) {
        Directory outer = new Directory("outer");
        Directory inner = new Directory("inner");
        inner.add(new File("a.txt"));
        outer.add(inner);
        outer.ls();
    }
}
