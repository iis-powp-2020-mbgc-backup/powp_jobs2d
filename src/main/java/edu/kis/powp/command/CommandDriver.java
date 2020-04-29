package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public interface CommandDriver {
    void execute(Job2dDriver target);
}
