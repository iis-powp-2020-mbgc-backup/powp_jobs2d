package edu.kis.powp.command;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComplexCommand implements IDriverCommand {

    private List<IDriverCommand> queue;

    private ComplexCommand(Builder builder) {
        this.queue = builder.queue;
    }

    @Override
    public void execute() {
        for (IDriverCommand command : queue) {
            command.execute();
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private ArrayList<IDriverCommand> queue;

        private Builder() {
            queue = new ArrayList<>();
        }

        public Builder addCommand(IDriverCommand command) {
            if(command != null) {
                queue.add(command);
            }
            return this;
        }

        public ComplexCommand build() {
            return new ComplexCommand(this);
        }
    }
}
