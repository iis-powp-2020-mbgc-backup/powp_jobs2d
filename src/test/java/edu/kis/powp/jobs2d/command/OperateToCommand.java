package edu.kis.powp.jobs2d.command;
import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand
{
    private Job2dDriver driver;
    private int x, y;

    public OperateToCommand(Job2dDriver driver, int x, int y)
    {
        this.driver = driver;
        this.x = x;
        this.y = y;
    }

    @Override
    public void executeCommand()
    {
        driver.operateTo(x, y);
    }
}
