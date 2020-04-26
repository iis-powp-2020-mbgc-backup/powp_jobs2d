package edu.kis.powp.jobs2d.command;
import java.util.LinkedList;

public class ComplexCommand implements DriverCommand {

    private LinkedList<DriverCommand>list;

    ComplexCommand(LinkedList<DriverCommand>list){
        this.list=list;
    }

    @Override public void execute() {
        for(DriverCommand command:list){
            command.execute();
        }
    }
}
