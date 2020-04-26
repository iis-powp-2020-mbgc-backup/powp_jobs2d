package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class CommandShapeFactory {

    public static DriverCommand getTriangle(Job2dDriver job2dDriver){
        ComplexBuilder builder = new ComplexBuilder();
        builder.addCommand(new SetPositionCommand(0,0, job2dDriver));
        builder.addCommand(new OperateToCommand(50,0,job2dDriver));
        builder.addCommand(new OperateToCommand(25,-50,job2dDriver));
        builder.addCommand(new OperateToCommand(0,0,job2dDriver));
        return builder.makeComplexCommand();
    }

    public static DriverCommand getSquare(Job2dDriver job2dDriver){
        ComplexBuilder builder = new ComplexBuilder();
        builder.addCommand(new SetPositionCommand(0,0, job2dDriver));
        builder.addCommand(new OperateToCommand(0,50,job2dDriver));
        builder.addCommand(new OperateToCommand(50,50,job2dDriver));
        builder.addCommand(new OperateToCommand(50,0,job2dDriver));
        builder.addCommand(new OperateToCommand(0,0,job2dDriver));


        return builder.makeComplexCommand();
    }


    public static DriverCommand getDiamond(Job2dDriver job2dDriver){
        ComplexBuilder builder = new ComplexBuilder();
        builder.addCommand(new SetPositionCommand(0,0, job2dDriver));
        builder.addCommand(new OperateToCommand(-50,50,job2dDriver));
        builder.addCommand(new OperateToCommand(0,100,job2dDriver));
        builder.addCommand(new OperateToCommand(50,50,job2dDriver));
        builder.addCommand(new OperateToCommand(0,0,job2dDriver));


        return builder.makeComplexCommand();
    }
}
