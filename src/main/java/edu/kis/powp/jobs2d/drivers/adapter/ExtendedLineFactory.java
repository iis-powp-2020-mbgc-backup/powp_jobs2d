package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;

public class ExtendedLineFactory {
	static public ILine getBasicLine(){
		return LineFactory.getBasicLine();
	}
	static public ILine getDottedLine(){
		return LineFactory.getDottedLine();
	}
	static public ILine getSpecialLine(){
		return LineFactory.getSpecialLine();
	}
	static public ILine getConfigurableLine(){
		return new ConfigurableLine();
	}
}
