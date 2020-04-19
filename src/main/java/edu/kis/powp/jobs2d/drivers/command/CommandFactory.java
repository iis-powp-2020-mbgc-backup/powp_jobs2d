package edu.kis.powp.jobs2d.drivers.command;


import edu.kis.powp.jobs2d.Job2dDriver;

public class CommandFactory {

    public static DriverCommand getRectangleCommand(Job2dDriver job2dDriver){
        ComplexCommandBuilder complexCommandBuilder = new ComplexCommandBuilder();

        complexCommandBuilder.addCommand(new SetPositionCommand(0,0, job2dDriver));
        complexCommandBuilder.addCommand(new OperateToCommand(0,50, job2dDriver));
        complexCommandBuilder.addCommand(new OperateToCommand(100,50, job2dDriver));
        complexCommandBuilder.addCommand(new OperateToCommand(100,0, job2dDriver));
        complexCommandBuilder.addCommand(new OperateToCommand(0,0, job2dDriver));

        return complexCommandBuilder.getComplexCommand();
    }
/*
    public static DriverCommand getParallelogramCommand(Job2dDriver job2dDriver){
        ComplexCommandBuilder complexCommandBuilder = new ComplexCommandBuilder();

        complexCommandBuilder.addCommand(new SetPositionCommand(0,0, job2dDriver));
        complexCommandBuilder.addCommand(new OperateToCommand(15,50, job2dDriver));
        complexCommandBuilder.addCommand(new OperateToCommand(115,50, job2dDriver));
        complexCommandBuilder.addCommand(new OperateToCommand(100,0, job2dDriver));
        complexCommandBuilder.addCommand(new OperateToCommand(0,0, job2dDriver));

        return complexCommandBuilder.getComplexCommand();
    }
*/
    public static DriverCommand getDiamondCommand(Job2dDriver job2dDriver){
        ComplexCommandBuilder complexCommandBuilder = new ComplexCommandBuilder();

        complexCommandBuilder.addCommand(new SetPositionCommand(40,0, job2dDriver));
        complexCommandBuilder.addCommand(new OperateToCommand(0,40, job2dDriver));
        complexCommandBuilder.addCommand(new OperateToCommand(40,80, job2dDriver));
        complexCommandBuilder.addCommand(new OperateToCommand(80,40, job2dDriver));
        complexCommandBuilder.addCommand(new OperateToCommand(40,0, job2dDriver));

        return complexCommandBuilder.getComplexCommand();
    }


}