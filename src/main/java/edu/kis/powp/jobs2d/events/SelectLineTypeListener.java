package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.adapter.LineDrawerAdapter;

public class SelectLineTypeListener implements ActionListener{
	
	@Override
    public void actionPerformed(ActionEvent event) {
		switch(event.getActionCommand())
		{
			case "Basic line":
			{
				LineDrawerAdapter.setLineType(LineDrawerAdapter.LineType.BASIC_LINE);
				break;
			}
			case "Dotted line":
			{
				LineDrawerAdapter.setLineType(LineDrawerAdapter.LineType.DOTTED_LINE);
				break;
			}
			case "Special line":
			{
				LineDrawerAdapter.setLineType(LineDrawerAdapter.LineType.SPECIAL_LINE);
				break;
			}
		}
    }
}