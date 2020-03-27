package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;

public class DriverAdapterOfAdapter extends AbstractDriver {

    private Job2dDriver innerDriver = null;

    public DriverAdapterOfAdapter(int x, int y, Job2dDriver innerDriverImplementation) {
        super(x, y);
        this.innerDriver = innerDriverImplementation;
    }

    @Override
    public void operateTo(int toX, int toY) {
        this.innerDriver.setPosition(this.getX(), this.getY());
        this.setPosition(toX, toY);
        this.innerDriver.operateTo(toX, toY);
    }
}
