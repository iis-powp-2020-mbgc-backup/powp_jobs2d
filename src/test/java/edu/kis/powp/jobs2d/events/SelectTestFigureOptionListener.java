package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.ShapeFactory;
import edu.kis.powp.command.ShapeTypeEnum;
import edu.kis.powp.jobs2d.FigureTypeEnum;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.AbstractDriverAdapter;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestFigureOptionListener implements ActionListener {

    private DriverManager driverManager;
    private FigureTypeEnum figureTypeEnum;

    public SelectTestFigureOptionListener(DriverManager driverManager,FigureTypeEnum figureTypeEnum) {
        this.driverManager = driverManager;
        this.figureTypeEnum = figureTypeEnum;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (this.figureTypeEnum) {
            case FIGUREJOE1:
                FiguresJoe.figureScript1(driverManager.getCurrentDriver());
                break;
            case FIGUREJOE2:
                FiguresJoe.figureScript2(driverManager.getCurrentDriver());
                break;
            case FIGUREJANE1:
                FiguresJane.figureScript(new AbstractDriverAdapter(driverManager.getCurrentDriver()));
                break;
            case TRIANGLE:
                ShapeFactory.getShape(driverManager, ShapeTypeEnum.TRIANGLE).execute();
                break;
            case SQUARE:
                ShapeFactory.getShape(driverManager, ShapeTypeEnum.SQUARE).execute();
                break;
            case RECTANGLE:
                ShapeFactory.getShape(driverManager, ShapeTypeEnum.RECTANGLE).execute();
                break;
            default:
                System.out.println("Wrong command");
        }
    }
}
