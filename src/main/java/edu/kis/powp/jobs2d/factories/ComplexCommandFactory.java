package edu.kis.powp.jobs2d.factories;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;

interface ComplexCommandFactory {

    ComplexCommand getComplexCommand(Job2dDriver job2dDriver);

}
