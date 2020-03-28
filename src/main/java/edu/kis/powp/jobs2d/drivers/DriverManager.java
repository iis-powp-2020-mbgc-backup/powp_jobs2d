package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.LoggerDriver;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

/**
 * Driver manager provides means to setup the driver. It also enables other
 * components and features of the application to react on configuration changes.
 */
public class DriverManager {

	private static Job2dDriver currentDriver = new LoggerDriver();

	private static class LoggerDriver implements Job2dDriver {
		@Override
		public void setPosition(int x, int y) {
			System.out.println("Driver setPosition action...");
		}

		@Override
		public void operateTo(int i, int i1) {
			System.out.println("Driver operateTo action...");
		}
	}
	public static void main(String[] args) {

		FiguresJoe.figureScript1(currentDriver);
	}


	/**
	 * @param driver Set the driver as current.
	 */
	public synchronized void setCurrentDriver(Job2dDriver driver) {
		currentDriver = driver;
	}

	/**
	 * @return Current driver.
	 */
	public synchronized Job2dDriver getCurrentDriver() {
		return currentDriver;
	}
}
