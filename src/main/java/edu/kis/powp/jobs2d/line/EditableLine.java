package edu.kis.powp.jobs2d.line;

import edu.kis.legacy.drawer.shape.line.AbstractLine;
import java.awt.Color;

public class EditableLine extends AbstractLine {

    protected Color color;
    protected float thickness;
    protected boolean dotted;

    public EditableLine() {
        color = Color.RED;
        thickness = 5.0f;
        dotted = true;
    }

    public EditableLine(Color color, float thickness, boolean dotted) {
        this.color = color;
        this.thickness = thickness;
        this.dotted = dotted;
    }

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
