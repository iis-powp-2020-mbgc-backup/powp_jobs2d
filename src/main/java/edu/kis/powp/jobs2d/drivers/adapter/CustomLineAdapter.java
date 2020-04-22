package edu.kis.powp.jobs2d.drivers;

import edu.kis.legacy.drawer.shape.line.AbstractLine;
import edu.kis.powp.jobs2d.drivers.adapter.CustomLine;

import java.awt.*;

public class CustomLineAdapter extends AbstractLine implements CustomLine {

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void setDotted(boolean dotted) {
        this.dotted = dotted;
    }

    @Override
    public void setThickness(float thickness) {
        this.thickness = thickness;
    }
}
