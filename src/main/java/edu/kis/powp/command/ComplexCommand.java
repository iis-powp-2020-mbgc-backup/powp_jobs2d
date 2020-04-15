package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand
{
    private List<DriverCommand> commands;

    public ComplexCommand(List<DriverCommand> commands)
    {
        this.commands = commands;
    }

    @Override
    public void execute()
    {
        commands.forEach(DriverCommand::execute);
    }

    public static DriverCommand getSquareCommand(Job2dDriver driver)
    {
        List<DriverCommand> list = new ArrayList<>();
        list.add(new SetPositionCommand(driver, -200, -200));
        list.add(new OperateToCommand(driver, 200, -200));
        list.add(new OperateToCommand(driver, 200, 200));
        list.add(new OperateToCommand(driver, -200, 200));
        list.add(new OperateToCommand(driver, -200, -200));

        return new ComplexCommand(list);
    }

    public static DriverCommand getTriangleCommand(Job2dDriver driver)
    {
        List<DriverCommand> list = new ArrayList<>();
        list.add(new SetPositionCommand(driver, 0, -200));
        list.add(new OperateToCommand(driver, 200, 200));
        list.add(new OperateToCommand(driver, -200, 200));
        list.add(new OperateToCommand(driver, 0, -200));

        return new ComplexCommand(list);
    }
}
