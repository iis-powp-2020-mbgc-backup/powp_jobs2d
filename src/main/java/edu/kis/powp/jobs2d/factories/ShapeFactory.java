package edu.kis.powp.jobs2d.factories;

import edu.kis.powp.jobs2d.commands.ComplexCommand;
import edu.kis.powp.jobs2d.commands.OperateToCommand;
import edu.kis.powp.jobs2d.commands.SetPositionCommand;

public class ShapeFactory {

    private ShapeFactory(){}


    public static ComplexCommand createRectangleCommand(){
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new SetPositionCommand(0,0));
        complexCommand.addCommand(new OperateToCommand(100,0));
        complexCommand.addCommand(new OperateToCommand(100,100));
        complexCommand.addCommand(new OperateToCommand(0,100));
        complexCommand.addCommand(new OperateToCommand(0,0));

        return complexCommand;
    }

    public static ComplexCommand createTriangleCommand(){
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new SetPositionCommand(0,0));
        complexCommand.addCommand(new OperateToCommand(100,0));
        complexCommand.addCommand(new OperateToCommand(50,80));
        complexCommand.addCommand(new OperateToCommand(0,0));

        return complexCommand;
    }

}
