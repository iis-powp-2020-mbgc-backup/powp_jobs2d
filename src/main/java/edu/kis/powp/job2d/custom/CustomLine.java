package edu.kis.powp.job2d.custom;

import java.awt.Color;

import edu.kis.legacy.drawer.shape.line.AbstractLine;

public class CustomLine extends AbstractLine {

    public CustomLine(Color color, float thickness, boolean dotted) {
        this.color = color;
        this.thickness = thickness;
        this.dotted = dotted;
    }
}
