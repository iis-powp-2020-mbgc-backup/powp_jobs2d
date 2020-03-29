package edu.kis.powp.jobs2d.line;

import edu.kis.legacy.drawer.shape.line.AbstractLine;

import java.awt.*;

public class ModifiableLine extends AbstractLine {

    public ModifiableLine() {
        this.thickness = 3.0F;
        this.color = Color.BLACK;
        this.dotted = false;
    };

    public ModifiableLine(Color color, float thickness, boolean dotted) {
        this.thickness = thickness;
        this.color = color;
        this.dotted = dotted;
    };

    public ModifiableLine(ModifiableLine modifiableLine) {
        this.thickness = modifiableLine.getThickness();
        this.color = modifiableLine.getColor();
        this.dotted = modifiableLine.isDotted();
    };

    public void setColor(Color color) {
        this.color = color;
    }

    public void setThickness(float thickness) {
        this.thickness = thickness;
    }

    public void setDotted(boolean dotted) {
        this.dotted = dotted;
    }
}