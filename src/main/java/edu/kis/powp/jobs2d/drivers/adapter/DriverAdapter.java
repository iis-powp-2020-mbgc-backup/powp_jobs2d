package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;

public class DriverAdapter extends AbstractDriver {
	private Job2dDriver driver;
	
	public DriverAdapter(Job2dDriver driver) {
		super(0, 0);
		this.driver = driver;
	}
	
	@Override
	public void operateTo(int x, int y) {
		driver.setPosition(getX(), getY());
		driver.operateTo(x, y);
		setPosition(x, y);
	}
}