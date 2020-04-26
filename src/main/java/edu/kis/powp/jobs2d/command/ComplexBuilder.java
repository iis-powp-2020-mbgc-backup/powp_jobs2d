package edu.kis.powp.jobs2d.command;

import java.util.LinkedList;

public class ComplexBuilder {
    private LinkedList<DriverCommand> list=new LinkedList<>();

    void addCommand(DriverCommand command)
    {
        list.add(command);
    }

    public DriverCommand makeComplexCommand()
    {
        return new ComplexCommand(list);
    }
}
