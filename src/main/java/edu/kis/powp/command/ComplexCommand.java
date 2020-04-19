package edu.kis.powp.command;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComplexCommand implements DriverCommand {

    private ArrayList<DriverCommand> queue;

    @Override
    public void execute() {
        for (DriverCommand command : queue) {
            command.execute();
        }
    }

    public ComplexCommand(ArrayList<DriverCommand> builder) {
        this.queue =  builder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private List<DriverCommand> queue;

        private Builder() {
            queue = Collections.emptyList();
        }

        public Builder addCommand(DriverCommand command) {
            if(command != null) {
                queue.add(command);
            }
            return this;
        }

//        public ComplexCommand build() {
//            return new ComplexCommand(this);
//        }
    }
}