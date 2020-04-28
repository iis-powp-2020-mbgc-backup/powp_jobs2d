package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;

public class ShapeFactory {

    public static DriverCommand makeRectangle(Job2dDriver job2dDriver) {
        ArrayList<DriverCommand> driverCommandList = new ArrayList<>();

        driverCommandList.add(new SetPositionCommand(0, 0, job2dDriver));
        driverCommandList.add(new OperateToCommand(0, 200, job2dDriver));
        driverCommandList.add(new OperateToCommand(100, 200, job2dDriver));
        driverCommandList.add(new OperateToCommand(100, 0, job2dDriver));
        driverCommandList.add(new OperateToCommand(0, 0, job2dDriver));

        return new ComplexCommand(driverCommandList);
    }

    public static DriverCommand makeTriangle(Job2dDriver job2dDriver) {
        ArrayList<DriverCommand> driverCommandList = new ArrayList<>();

        driverCommandList.add(new SetPositionCommand(0, 0, job2dDriver));
        driverCommandList.add(new OperateToCommand(50, 100, job2dDriver));
        driverCommandList.add(new OperateToCommand(100, 0, job2dDriver));
        driverCommandList.add(new OperateToCommand(0, 0, job2dDriver));

        return new ComplexCommand(driverCommandList);
    }

    public static DriverCommand makeSquare(Job2dDriver job2dDriver) {
        ArrayList<DriverCommand> driverCommandList = new ArrayList<>();

        driverCommandList.add(new SetPositionCommand(0, 0, job2dDriver));
        driverCommandList.add(new OperateToCommand(0, 100, job2dDriver));
        driverCommandList.add(new OperateToCommand(100, 100, job2dDriver));
        driverCommandList.add(new OperateToCommand(100, 0, job2dDriver));
        driverCommandList.add(new OperateToCommand(0, 0, job2dDriver));

        return new ComplexCommand(driverCommandList);
    }

}
