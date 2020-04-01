package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.adapter.SpecialLineDrawerAdapter;

public class SelectLineTypeListener implements ActionListener{
	
	@Override
    public void actionPerformed(ActionEvent event) {
		switch(event.getActionCommand())
		{
			case "Basic line":
			{
				SpecialLineDrawerAdapter.setLineType(SpecialLineDrawerAdapter.LineType.BASIC_LINE);
				break;
			}
			case "Dotted line":
			{
				SpecialLineDrawerAdapter.setLineType(SpecialLineDrawerAdapter.LineType.DOTTED_LINE);
				break;
			}
			case "Special line":
			{
				SpecialLineDrawerAdapter.setLineType(SpecialLineDrawerAdapter.LineType.SPECIAL_LINE);
				break;
			}
		}
    }
}