package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;

public class AbstractDriverAdapter extends AbstractDriver {

    private Job2dDriver job2dDriver;

    public AbstractDriverAdapter(Job2dDriver job2dDriver) {
        super(0, 0);
        this.job2dDriver = job2dDriver;
    }

    @Override
    public void operateTo(int x, int y) {
        setPosition(x, y);

        job2dDriver.setPosition(getX(), getY());
        job2dDriver.operateTo(x, y);
    }
}
