package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.Job2dDriver;

public class CircleFigure {

	public CircleFigure(Job2dDriver driver, int circleCenterX, int circleCenterY, int radius) {
		this.builder = ComplexCommand.builder();
		this.driver = driver;
		this.circleCenterX = circleCenterX;
		this.circleCenterY = circleCenterY;
		this.radius = radius;
	}
	
	public DriverCommand get() {
		
		int r2 = radius * radius;
		
		builder.addCommand(new SetPositionCommand(circleCenterX - radius, circleCenterY, driver));
		
		for(int x = -radius; x <= radius; x++)
		{
			int y = (int)(Math.sqrt(r2 - x*x) + 0.5);
			builder.addCommand(new OperateToCommand(circleCenterX + x, circleCenterY + y, driver));
		}
		
		builder.addCommand(new SetPositionCommand(circleCenterX - radius, circleCenterY, driver));
		
		for(int x = -radius; x <= radius; x++)
		{
			int y = (int)(Math.sqrt(r2 - x*x) + 0.5);
			builder.addCommand(new OperateToCommand(circleCenterX + x, circleCenterY - y, driver));
		}
		
		return builder.build();
	}
	
	private ComplexCommand.Builder builder;
	
	private Job2dDriver driver;
	
	private int circleCenterX;
	private int circleCenterY;
	private int radius;
}
