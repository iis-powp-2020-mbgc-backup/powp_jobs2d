package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.shape.line.AbstractLine;
import edu.kis.powp.jobs2d.drivers.IModifiableLine;

import java.awt.*;

public class ModifiableLineAdapter extends AbstractLine implements IModifiableLine
{
    @Override
    public void setColor(Color color)
    {
        this.color = color;
    }

    @Override
    public void setThickness(float thickness)
    {
        this.thickness = thickness;
    }

    @Override
    public void setDotted(boolean dotted)
    {
        this.dotted = dotted;
    }
}
