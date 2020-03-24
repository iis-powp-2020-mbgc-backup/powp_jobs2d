package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.shape.line.AbstractLine;

import java.awt.*;

public class ConfigurableLine extends AbstractLine {
	public void setThickness(float thickness){
		this.thickness = thickness;
	}
	
	public void setColor(Color color){
		this.color = color;
	}
	
	public void setDotted(boolean enabled){
		this.dotted = enabled;
	}
}
