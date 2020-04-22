package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.commands.DriverCommand;
import edu.kis.powp.jobs2d.drivers.commands.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.commands.SetPositionCommand;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Figure Joe 1")) {
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		} else if(e.getActionCommand().equals("Figure Joe 2")) {
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		} else if(e.getActionCommand().equals("Command test")) {
			Job2dDriver driver = driverManager.getCurrentDriver();
			SetPositionCommand command = new SetPositionCommand();
			command.setXY(50, 50);
			command.execute(driver);

			OperateToCommand operateTo = new OperateToCommand();
			operateTo.setXY(100, 50);
			operateTo.execute(driver);
			operateTo.setXY(100, 100);
			operateTo.execute(driver);
			operateTo.setXY(150, 100);
			operateTo.execute(driver);
			operateTo.setXY(150, 150);
			operateTo.execute(driver);
		}
	}
}
