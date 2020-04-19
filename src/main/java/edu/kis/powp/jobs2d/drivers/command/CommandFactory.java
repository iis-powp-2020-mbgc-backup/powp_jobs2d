package edu.kis.powp.jobs2d.drivers.command;


import edu.kis.powp.jobs2d.Job2dDriver;

public class CommandFactory {

    public static DriverCommand getRectangleCommand(Job2dDriver job2dDriver){
        ComplexCommandBuilder complexCommandBuilder = new ComplexCommandBuilder();
        //top left
        int x1 = -150;
        int y1 = -100;
        //bottom right
        int x2 = 150;
        int y2 = 100;

        complexCommandBuilder.addCommand(new SetPositionCommand(x1,y1, job2dDriver));
        complexCommandBuilder.addCommand(new OperateToCommand(x1,y2, job2dDriver));
        complexCommandBuilder.addCommand(new OperateToCommand(x2,y2, job2dDriver));
        complexCommandBuilder.addCommand(new OperateToCommand(x2,y1, job2dDriver));
        complexCommandBuilder.addCommand(new OperateToCommand(x1,y1, job2dDriver));

        return complexCommandBuilder.getComplexCommand();
    }

    public static DriverCommand getCircleCommand(Job2dDriver job2dDriver){
        ComplexCommandBuilder complexCommandBuilder = new ComplexCommandBuilder();

        //center
        int x0 = 0;
        int y0 = 0;
        //radius
        int r = 100;
        
        int x, y;

        complexCommandBuilder.addCommand(new SetPositionCommand(x0 - r,y0, job2dDriver));
        for(x = x0 - r; x <= x0 + r; x++){
            y = (int) (y0 + Math.sqrt(r*r - (x - x0) * (x - x0)));
            complexCommandBuilder.addCommand(new OperateToCommand(x,y, job2dDriver));
        }
        for(x = x0 + r; x >= x0 - r; x--){
            y = (int) (y0 - Math.sqrt(r*r - (x - x0) * (x - x0)));
            complexCommandBuilder.addCommand(new OperateToCommand(x,y, job2dDriver));
        }

        return complexCommandBuilder.getComplexCommand();
    }

    public static DriverCommand getDiamondCommand(Job2dDriver job2dDriver){
        ComplexCommandBuilder complexCommandBuilder = new ComplexCommandBuilder();

        //middle
        int x0 = 0;
        int y0 = 0;
        //size
        int size = 200;

        complexCommandBuilder.addCommand(new SetPositionCommand(x0 + size,y0, job2dDriver));
        complexCommandBuilder.addCommand(new OperateToCommand(x0,y0 + size, job2dDriver));
        complexCommandBuilder.addCommand(new OperateToCommand(x0 - size,y0, job2dDriver));
        complexCommandBuilder.addCommand(new OperateToCommand(x0,y0 - size, job2dDriver));
        complexCommandBuilder.addCommand(new OperateToCommand(x0 + size,y0, job2dDriver));

        return complexCommandBuilder.getComplexCommand();
    }


}