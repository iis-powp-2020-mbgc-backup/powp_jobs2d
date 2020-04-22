package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.command.*;

import java.util.Random;

public class FigureScripts {
    public static void figureScript(Job2dDriver driver) {
        new SetPositionCommand(-200, -100).execute(driver);
        new OperateToCommand(-100, -200).execute(driver);
        new OperateToCommand(100, -200).execute(driver);
        new OperateToCommand(200, -100).execute(driver);
        new OperateToCommand(0, 100).execute(driver);
        new OperateToCommand(-200, -100).execute(driver);
    }

    public static void figureScript2(Job2dDriver driver) {
        ComplexCommandBuilder complexCommandBuilder = new ComplexCommandBuilder();
        complexCommandBuilder.addCommand(new SetPositionCommand(-200, 0));
        complexCommandBuilder.addCommand(new OperateToCommand(100, 0));
        complexCommandBuilder.addCommand(new OperateToCommand(100, 100));
        complexCommandBuilder.addCommand(new OperateToCommand(200, 0));
        complexCommandBuilder.addCommand(new OperateToCommand(100, -100));
        complexCommandBuilder.addCommand(new OperateToCommand(100, 0));
        DriverCommand command = complexCommandBuilder.build();
        command.execute(driver);
    }

    public static void figureScript3(Job2dDriver driver) {
        DriverCommand command = ComplexCommandFactory.square(0, 0, 100);
        command.execute(driver);
    }
    public static void figureScript4(Job2dDriver driver) {
        Random r = new Random();
        DriverCommand command = ComplexCommandFactory.square(r.nextInt(400) - 200, r.nextInt(400) - 200, r.nextInt(150) + 50);
        command.execute(driver);
    }
}
