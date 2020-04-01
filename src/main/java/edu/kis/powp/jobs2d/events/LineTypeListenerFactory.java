package edu.kis.powp.jobs2d.events;

public class LineTypeListenerFactory {
	
	public SelectLineTypeListener getBasicLineTypeListener() {
		return new SelectBasicLineTypeListener();
	}
	
	public SelectLineTypeListener getDottedLineTypeListener() {
		return new SelectDottedLineTypeListener();
	}
	
	public SelectLineTypeListener getSpecialLineTypeListener() {
		return new SelectSpecialLineTypeListener();
	}
}
