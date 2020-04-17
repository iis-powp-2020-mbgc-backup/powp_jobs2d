package edu.kis.powp.jobs2d.drivers.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {

    private List<DriverCommand> jobs;

    public ComplexCommand() {
        this.jobs = new ArrayList<>();
    }

    public ComplexCommand(List<DriverCommand> jobs) {
        this.jobs = jobs;
    }

    public void addJob(DriverCommand driverCommand) {
        this.jobs.add(driverCommand);
    }

    public void removeJob(DriverCommand driverCommand) {
        this.jobs.remove(driverCommand);
    }

    @Override
    public void execute() {
        this.jobs.forEach(DriverCommand::execute);
    }
}
