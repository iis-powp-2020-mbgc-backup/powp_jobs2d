package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.commands.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.commands.DriverCommand;
import edu.kis.powp.jobs2d.drivers.commands.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.commands.SetPositionCommand;

public class FiguresFactory {
	public static DriverCommand square(Job2dDriver driver){
		ComplexCommand.Builder builder = ComplexCommand.builder();
		
		builder.addCommand(new SetPositionCommand(driver, 0, 0));
		builder.addCommand(new OperateToCommand(driver, 0, 60));
		builder.addCommand(new OperateToCommand(driver, 60, 60));
		builder.addCommand(new OperateToCommand(driver, 60, 0));
		builder.addCommand(new OperateToCommand(driver, 0, 0));
		
		return builder.build();
	}
	
	public static DriverCommand triangle(Job2dDriver driver) {
		ComplexCommand.Builder builder = ComplexCommand.builder();
		
		builder.addCommand(new SetPositionCommand(driver, -60, 0));
		builder.addCommand(new OperateToCommand(driver, 60, 0));
		builder.addCommand(new OperateToCommand(driver, 0, 60));
		builder.addCommand(new OperateToCommand(driver, -60, 0));
		
		return builder.build();
	}
	
	public static DriverCommand rectangle(Job2dDriver driver) {
		ComplexCommand.Builder builder = ComplexCommand.builder();
		
		builder.addCommand(new SetPositionCommand(driver, 0, 0));
		builder.addCommand(new OperateToCommand(driver, 0, 120));
		builder.addCommand(new OperateToCommand(driver, 60, 120));
		builder.addCommand(new OperateToCommand(driver, 60, 0));
		builder.addCommand(new OperateToCommand(driver, 0, 0));
		
		return builder.build();
	}
}
