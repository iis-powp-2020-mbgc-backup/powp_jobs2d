package edu.kis.powp.jobs2d.drivers.command;
import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand{
    private int x;
    private int y;
    private Job2dDriver Driver;
    OperateToCommand(int y, int x, Job2dDriver Driver) {
        this.y=y;
        this.x=x;
        this.Driver = Driver;
    }

    @Override
    public void execute(){
        if(this.Driver!=null){
            Driver.operateTo(this.x,this.y);
        }
    }


}
