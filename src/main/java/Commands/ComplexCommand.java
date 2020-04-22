package Commands;

import java.util.ArrayList;

public class ComplexCommand {
    ArrayList<DriverCommand> commands;

    public ComplexCommand(ArrayList<DriverCommand> commands) {
        this.commands = commands;
    }

    public ComplexCommand(){
        this.commands = new ArrayList<DriverCommand>();
    }

    public void addCommand(DriverCommand command){
        this.commands.add(command);
    }

    public void execute(){
        for (int i = 0; i<commands.size();i++){
            commands.get(i).execute();
        }
    }

}
