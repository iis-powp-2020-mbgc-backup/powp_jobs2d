package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public abstract class Factory {

    public static ComplexCommand drawSquare(Job2dDriver job2dDriver, int len) {
        ComplexCommand command = new ComplexCommand();

        command.add(new SetPositionCommand((len/2), -(len/2), job2dDriver));

        command.add(new OperateToCommand(-(len/2), -(len/2), job2dDriver));
        command.add(new OperateToCommand(-(len/2), (len/2), job2dDriver));
        command.add(new OperateToCommand((len/2), (len/2), job2dDriver));
        command.add(new OperateToCommand((len/2), -(len/2), job2dDriver));


        return command;
    }

    public static ComplexCommand drawRectangle(Job2dDriver job2dDriver, int len) {
        ComplexCommand command = new ComplexCommand();

        command.add(new SetPositionCommand((len), -(len/2), job2dDriver));

        command.add(new OperateToCommand(-(len), -(len/2), job2dDriver));
        command.add(new OperateToCommand(-(len), (len/2), job2dDriver));
        command.add(new OperateToCommand((len), (len/2), job2dDriver));
        command.add(new OperateToCommand((len), -(len/2), job2dDriver));


        return command;
    }

    public static ComplexCommand drawTriangle(Job2dDriver job2dDriver, int len) {
        ComplexCommand command = new ComplexCommand();

        command.add(new SetPositionCommand(-(len/2), (len/2), job2dDriver));

        command.add(new OperateToCommand(0,-(len/2), job2dDriver));
        command.add(new OperateToCommand((len/2),(len/2), job2dDriver));
        command.add(new OperateToCommand(-(len/2),(len/2), job2dDriver));

        return command;
    }
}
