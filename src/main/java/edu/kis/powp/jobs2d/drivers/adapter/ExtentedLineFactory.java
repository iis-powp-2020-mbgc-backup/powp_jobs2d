package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;

public class ExtentedLineFactory extends LineFactory {

    static public ILine getSelectionableLineAdapter(){
        return new SelectionableLineAdapter();
    }

}
