package edu.kis.powp.jobs2d.drivers.adapter;
import edu.kis.legacy.drawer.shape.ILine;

import java.awt.*;

public interface CustomLine extends ILine {
    public void setColor(Color color);
    public void setThickness(float thickness);
    public void setDotted(boolean dotted);
}
