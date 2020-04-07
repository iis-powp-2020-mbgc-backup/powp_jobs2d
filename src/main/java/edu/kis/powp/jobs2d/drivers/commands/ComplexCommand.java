package edu.kis.powp.jobs2d.drivers.commands;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {
	private List<DriverCommand> commandList = new ArrayList<>();
	
	private ComplexCommand(List<DriverCommand> commandList) {
		this.commandList = commandList;
	}
	
	@Override
	public void execute() {
		for(DriverCommand c : this.commandList){
			c.execute();
		}
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	public static final class Builder {
		private List<DriverCommand> commandList = new ArrayList<>();
		
		private Builder() {}
		
		public Builder addCommand(DriverCommand command) {
			this.commandList.add(command);
			return this;
		}
		
		public ComplexCommand build() {
			return new ComplexCommand(commandList);
		}
	}
}
