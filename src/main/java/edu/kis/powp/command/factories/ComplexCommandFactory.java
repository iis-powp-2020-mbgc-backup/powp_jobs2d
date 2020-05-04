package edu.kis.powp.command.factories;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.jobs2d.Job2dDriver;

public interface ComplexCommandFactory {
    ComplexCommand getComplexCommand(Job2dDriver job2dDriver);
}
