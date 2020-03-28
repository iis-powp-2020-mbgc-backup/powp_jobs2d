package edu.kis.powp.jobs2d.shapes.lines;

import edu.kis.legacy.drawer.shape.line.AbstractLine;

import java.awt.*;

public class UserModifiableLine extends AbstractLine {

    private static final float DEFAULT_THICKNESS = 1.0f;
    private static final Color DEFAULT_COLOR = Color.BLACK;
    private static final boolean DEFAULT_STYLE = false;

    private UserModifiableLine(LineBuilder builder) {
        this.color = builder.color;
        this.dotted = builder.dotted;
        this.thickness = builder.thickness;
    }

    public UserModifiableLine() {
        this.thickness = DEFAULT_THICKNESS;
        this.color = DEFAULT_COLOR;
        this.dotted = DEFAULT_STYLE;
    }

    public static LineBuilder builder() {
        return new LineBuilder();
    }

    public LineBuilder rebuilder() {
        return new LineBuilder(this);
    }

    public static final class LineBuilder {

        private float thickness = DEFAULT_THICKNESS;
        private Color color = DEFAULT_COLOR;
        private boolean dotted = DEFAULT_STYLE;

        private LineBuilder() {
        }

        private LineBuilder(UserModifiableLine userModifiableLine) {
            thickness = userModifiableLine.thickness;
            color = userModifiableLine.color;
            dotted = userModifiableLine.dotted;
        }

        public LineBuilder withThickness(float thickness) {
            this.thickness = thickness;
            return this;
        }

        public LineBuilder withColor(Color color) {
            this.color = color;
            return this;
        }

        public LineBuilder useDottedStyle(boolean value) {
            this.dotted = value;
            return this;
        }

        public UserModifiableLine build() {
            return new UserModifiableLine(this);
        }
    }

}
