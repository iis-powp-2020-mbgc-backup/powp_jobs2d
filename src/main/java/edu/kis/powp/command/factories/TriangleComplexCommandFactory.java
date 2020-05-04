package edu.kis.powp.command.factories;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class TriangleComplexCommandFactory implements ComplexCommandFactory {
    @Override
    public ComplexCommand getComplexCommand(Job2dDriver job2dDriver) {
        List<DriverCommand> list = new ArrayList<>();

        list.add(new SetPositionCommand(-40, -30,job2dDriver));
        list.add(new OperateToCommand(40, -30,job2dDriver));
        list.add(new OperateToCommand(0, 40,job2dDriver));
        list.add(new OperateToCommand(-40, -30,job2dDriver));

        return new ComplexCommand(list);
    }
}
