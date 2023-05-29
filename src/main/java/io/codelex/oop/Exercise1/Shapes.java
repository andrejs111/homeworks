package io.codelex.oop.Exercise1;

public abstract class Shapes {
    protected int numSides;
    protected int base;
    protected int height;

    public Shapes(int numSides, int base, int height) {
        this.numSides = numSides;
        this.base = base;
        this.height = height;
    }
    public int getNumSides() {
        return numSides;
    }
    public void getArea() {}
    public void getPerimeter() {}

    @Override
    public String toString() {
        return "Shapes: " + getClass().getSimpleName() +
                " {" +
                "numSides=" + numSides +
                ", base=" + base +
                ", height=" + height +
                '}';
    }
}
