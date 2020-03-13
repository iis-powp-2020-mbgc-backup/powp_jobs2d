package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.adapter.SpecialLineDrawerAdapter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectLineTypeOptionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent type) {
        SpecialLineDrawerAdapter.setLineType(type.getActionCommand());
    }
}
