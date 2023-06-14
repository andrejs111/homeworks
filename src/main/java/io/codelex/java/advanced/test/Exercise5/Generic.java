package io.codelex.java.advanced.test.Exercise5;

import java.util.ArrayList;

public class Generic <T> implements partOf {
    private T something;
    private ArrayList<T> somethingList;

    public Generic(T something) {
        this.something = something;
    }

    @Override
    public void partOf() {

    }
}
