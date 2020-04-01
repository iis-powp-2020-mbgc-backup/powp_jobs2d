package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;

public class DriverAdapter extends AbstractDriver {

    private Job2dDriver driver;

    public DriverAdapter(Job2dDriver driver, int x, int y){
        super(x, y);
        this.driver = driver;
    }

    @Override
    public void operateTo(int x, int y) {
        driver.operateTo(x, y);
        setPosition(x, y);
    }
}
