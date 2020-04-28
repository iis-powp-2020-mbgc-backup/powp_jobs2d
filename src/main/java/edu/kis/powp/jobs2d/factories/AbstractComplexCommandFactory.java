package edu.kis.powp.jobs2d.factories;

import edu.kis.powp.jobs2d.commands.ComplexCommand;

public abstract class AbstractComplexCommandFactory {

    abstract protected ComplexCommand makeComplexCommand();

    public ComplexCommand getComplexCommand(){
        return this.makeComplexCommand();
    }

}
