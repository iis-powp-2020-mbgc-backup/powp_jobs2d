package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.IDriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.Arrays;
import java.util.List;

public class CommandExamples {

    public static IDriverCommand scriptFigure1(Job2dDriver driver) {

        ComplexCommand.Builder builder = ComplexCommand.builder();

        List<IDriverCommand> temp = Arrays.asList(
                new SetPositionCommand(-120, -120, driver),
                new OperateToCommand(120, -120, driver),
                new OperateToCommand(120, 120, driver),
                new OperateToCommand(-120, 120, driver),
                new OperateToCommand(-120, -120, driver),
                new OperateToCommand(120, 120, driver),
                new SetPositionCommand(120, -120, driver),
                new OperateToCommand(-120, 120, driver)
        );

        for (IDriverCommand command : temp) {
            builder = builder.addCommand(command);
        }

        return builder.build();
    }

    public static IDriverCommand scriptFigure2(Job2dDriver driver) {

        ComplexCommand.Builder builder = ComplexCommand.builder();

        List<IDriverCommand> temp = Arrays.asList(
                new SetPositionCommand(0, 0, driver),
                new OperateToCommand(233, -23, driver),
                new OperateToCommand(24, 90, driver),
                new OperateToCommand(-104, 80, driver),
                new OperateToCommand(-11, -22, driver),
                new OperateToCommand(-33, 44, driver),
                new SetPositionCommand(-66, -88, driver),
                new OperateToCommand(-128, 256, driver)
        );

        for (IDriverCommand command : temp) {
            builder = builder.addCommand(command);
        }

        return builder.build();
    }

    public static IDriverCommand rectangle(Job2dDriver driver) {
        ComplexCommand.Builder builder = ComplexCommand.builder();

        List<IDriverCommand> temp = Arrays.asList(
                new SetPositionCommand(0, 0, driver),
                new OperateToCommand(0, 120, driver),
                new OperateToCommand(120, 0, driver),
                new OperateToCommand(120, 120, driver),
                new OperateToCommand(0, 0, driver)
                );

        for (IDriverCommand command : temp) {
            builder = builder.addCommand(command);
        }

        return builder.build();
    }

    public static IDriverCommand triangle(Job2dDriver driver) {
        ComplexCommand.Builder builder = ComplexCommand.builder();

        List<IDriverCommand> temp = Arrays.asList(
                new SetPositionCommand(0, 0, driver),
                new OperateToCommand(60, 0, driver),
                new OperateToCommand(0, 60, driver),
                new OperateToCommand(60, 60, driver)
        );

        for (IDriverCommand command : temp) {
            builder = builder.addCommand(command);
        }

        return builder.build();
    }
}