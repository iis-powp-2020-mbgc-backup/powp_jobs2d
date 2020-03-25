package edu.kis.powp.jobs2d.drivers;

import edu.kis.legacy.drawer.shape.ILine;

import java.awt.*;

public interface IModifiableLine extends ILine
{
    public void setColor(Color color);

    public void setThickness(float thickness);

    public void setDotted(boolean dotted);
}
