package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.commands.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.commands.DriverCommand;
import edu.kis.powp.jobs2d.drivers.commands.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.commands.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.commands.shapes.ComplexCommandFactory;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private final DriverManager driverManager;
	private final Figure figure;

	public SelectTestFigureOptionListener(DriverManager driverManager, Figure figure) {
		this.driverManager = driverManager;
		this.figure = figure;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Job2dDriver driver = driverManager.getCurrentDriver();
		switch(figure) {
			case FIGURE_JOE_1:
				FiguresJoe.figureScript1(driver);
				break;
			case FIGURE_JOE_2:
				FiguresJoe.figureScript2(driver);
				break;
			case COMMAND_TEST:
				DriverCommand command = new SetPositionCommand(100, 100);
				command.execute(driver);
				command = new OperateToCommand( -100,-100);
				command.execute(driver);
				command = new OperateToCommand( -100,0);
				command.execute(driver);
				command = new OperateToCommand( 100,100);
				command.execute(driver);
				break;
			case COMPLEX_COMMAND:
				ComplexCommand complexCommand = new ComplexCommand();
				complexCommand.addComannd(new SetPositionCommand(50, 50));
				complexCommand.addComannd(new OperateToCommand(100, 50));
				complexCommand.addComannd(new OperateToCommand(50, 100));
				complexCommand.addComannd(new OperateToCommand(0, 0));
				complexCommand.execute(driver);
				break;
			case RECTANGLE_COMPEX_COMMAND:
				ComplexCommand rectangleCommand = ComplexCommandFactory.getRectangleComplexCommand(300, 100, -100, -100);
				rectangleCommand.execute(driver);
				break;
			case RHOMBUS_COMPLEX_COMMAND:
				ComplexCommand rhombusCommand = ComplexCommandFactory.getRhombusComplexCommand(300, -150, -150);
				rhombusCommand.execute(driver);
				break;
		}
	}
}
