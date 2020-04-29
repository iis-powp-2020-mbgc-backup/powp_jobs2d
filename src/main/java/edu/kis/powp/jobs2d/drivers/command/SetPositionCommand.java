package edu.kis.powp.jobs2d.drivers.command;
import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand{
    private int x;
    private int y;
    private Job2dDriver Driver;
    SetPositionCommand(int x,int y,Job2dDriver Driver){
        this.x=x;
        this.y=y;
        this.Driver=Driver;
    }

    @Override
    public void execute(){
        if(this.Driver!=null){
            Driver.setPosition(this.x,this.y);
        }
    }
}
