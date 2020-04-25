package factories;

import Commands.ComplexCommand;
import Commands.OperateToCommand;
import Commands.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.adapter.Pane2dDrawerAdapter;

public class TriangleFactory {

    ComplexCommand triangle;

    public ComplexCommand createTriangle(){
        triangle = new ComplexCommand();
        triangle.addCommand(new SetPositionCommand(0,0,new Pane2dDrawerAdapter()));

        triangle.addCommand(new OperateToCommand(10,0,new Pane2dDrawerAdapter()));
        triangle.addCommand(new SetPositionCommand(10,0,new Pane2dDrawerAdapter()));

        triangle.addCommand(new OperateToCommand(12,7,new Pane2dDrawerAdapter()));
        triangle.addCommand(new SetPositionCommand(12,7,new Pane2dDrawerAdapter()));

        triangle.addCommand(new OperateToCommand(0,0,new Pane2dDrawerAdapter()));
        triangle.addCommand(new SetPositionCommand(0,0,new Pane2dDrawerAdapter()));


        return triangle;
    }
}
