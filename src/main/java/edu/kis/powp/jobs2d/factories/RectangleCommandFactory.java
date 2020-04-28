package edu.kis.powp.jobs2d.factories;

import edu.kis.powp.jobs2d.builders.ComplexCommandBuilder;
import edu.kis.powp.jobs2d.commands.ComplexCommand;
import edu.kis.powp.jobs2d.commands.OperateToCommand;
import edu.kis.powp.jobs2d.commands.SetPositionCommand;

public class RectangleCommandFactory extends AbstractComplexCommandFactory{

    @Override
    protected ComplexCommand makeComplexCommand(){
        ComplexCommandBuilder builder = new ComplexCommandBuilder();
        builder.addCommand(new SetPositionCommand(0,0));
        builder.addCommand(new OperateToCommand(100,0));
        builder.addCommand(new OperateToCommand(100,100));
        builder.addCommand(new OperateToCommand(0,100));
        builder.addCommand(new OperateToCommand(0,0));
        return builder.build();
    }
}
