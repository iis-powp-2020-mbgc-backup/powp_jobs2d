package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;

import edu.kis.powp.jobs2d.drivers.adapter.SpecialLineDrawerAdapter;

public class SelectBasicLineTypeListener implements SelectLineTypeListener{

	@Override
    public void actionPerformed(ActionEvent event) {
		SpecialLineDrawerAdapter.setLineType(SpecialLineDrawerAdapter.LineType.BASIC_LINE);
    }
}
