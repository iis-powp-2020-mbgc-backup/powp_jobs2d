package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.shape.line.AbstractLine;
import edu.kis.powp.jobs2d.drivers.IModifiableLine;

import java.awt.*;

public class ModifiableLineAdapter extends AbstractLine implements IModifiableLine
{
    public ModifiableLineAdapter()
    {
        super();
    }

    public ModifiableLineAdapter(Color color, float thickness, boolean dotted)
    {
        this.color = color;
        this.thickness = thickness;
        this.dotted = dotted;
    }

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
