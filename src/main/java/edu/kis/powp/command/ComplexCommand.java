package edu.kis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {
	
	private ComplexCommand(List<DriverCommand> commandsList) {
		this.commandsList = commandsList;
	}
	
	@Override
	public void execute() {
		for(DriverCommand driverCommand : commandsList) {
			driverCommand.execute();
		}
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	public static final class Builder {
		
		private Builder() {
			commandsList = new ArrayList<>();
		}

		public Builder addCommand(DriverCommand driverCommand) {
			commandsList.add(driverCommand);
			return this;
		}

		public ComplexCommand build() {
			return new ComplexCommand(commandsList);
		}
		
		private List<DriverCommand> commandsList;
	}
	
	private List<DriverCommand> commandsList;
}
