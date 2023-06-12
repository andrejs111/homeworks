package io.codelex.oop.summary.generics.Exercise1;

import java.util.function.Supplier;

public class LazyBox<T> {

    private Supplier<T> initializer;
    private T value;
    private boolean isAdded;

    public LazyBox(Supplier<T> initializer) {
        this.initializer = initializer;
        this.isAdded = false;
    }

    public T get() {
        if (!isAdded) {
            value = initializer.get();
            isAdded = true;
        }
        return value;
    }
}