package edu.kis.powp.jobs2d.factory;

public enum Shape {
    RECTANGLE("Rectangle"),
    TRIANGLE("Triangle"),
    SQUARE("Square"),
    FIGURE_JOE_1("Figure Joe 1"),
    FIGURE_JOE_2("Figure Joe 2");

    public final String label;

    Shape(String label) {
        this.label = label;
    }
}
