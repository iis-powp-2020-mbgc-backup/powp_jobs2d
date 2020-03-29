package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;

public class CurrentDriverAdapter extends AbstractDriver {

    private Job2dDriver job2dDriver;

    public CurrentDriverAdapter(Job2dDriver job2dDriver) {
        super(0, 0);
        this.job2dDriver = job2dDriver;
    }

    @Override
    public void operateTo(int x, int y) {
        job2dDriver.setPosition(this.getX(), this.getY());
        job2dDriver.operateTo(x, y);
        setPosition(x, y);
    }
}
