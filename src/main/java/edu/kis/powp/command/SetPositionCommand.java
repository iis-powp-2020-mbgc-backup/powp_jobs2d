package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {
	
	public SetPositionCommand(int x, int y, Job2dDriver driver) {
		this.x = x;
		this.y = y;
		this.driver = driver;
	}
	
	public void execute() {
		driver.setPosition(x, y);
	}
	
	private int x;
	private int y;
	private Job2dDriver driver;
}
