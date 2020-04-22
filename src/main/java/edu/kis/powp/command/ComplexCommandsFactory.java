package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;

public class ComplexCommandsFactory {

    private ComplexCommandsFactory(){

    }

    public static ComplexCommand createRectangle(Job2dDriver driver) {
        ArrayList<DriverCommand> commands = new ArrayList<DriverCommand>();
        commands.add(new SetPositionCommand(driver,0,0));
        commands.add(new OperateToCommand(driver,200,0));
        commands.add(new OperateToCommand(driver,200,200));
        commands.add(new OperateToCommand(driver, 0,200));
        commands.add(new OperateToCommand(driver, 0,0));

        ComplexCommand complexCommand = new ComplexCommand(commands);
        return complexCommand;
    }

    public static ComplexCommand createPentagram(Job2dDriver driver) {
        ArrayList<DriverCommand> commands = new ArrayList<DriverCommand>();
        commands.add(new SetPositionCommand(driver,0,-10));
        commands.add(new OperateToCommand(driver,30,80));
        commands.add(new OperateToCommand(driver,-40,20));
        commands.add(new OperateToCommand(driver,40,20));
        commands.add(new OperateToCommand(driver,-30,80));
        commands.add(new OperateToCommand(driver,0,-10));

        ComplexCommand complexCommand = new ComplexCommand(commands);
        return complexCommand;
    }

    public static ComplexCommand createXD(Job2dDriver driver) {
        ArrayList<DriverCommand> commands = new ArrayList<DriverCommand>();
        commands.add(new SetPositionCommand(driver,0,0));
        commands.add(new OperateToCommand(driver,50,80));
        commands.add(new SetPositionCommand(driver,50,0));
        commands.add(new OperateToCommand(driver,0,80));
        commands.add(new SetPositionCommand(driver,60,0));
        commands.add(new OperateToCommand(driver,60,80));
        commands.add(new OperateToCommand(driver,100,60));
        commands.add(new OperateToCommand(driver,100,20));
        commands.add(new OperateToCommand(driver,60,0));

        ComplexCommand complexCommand = new ComplexCommand(commands);
        return complexCommand;
    }

}
