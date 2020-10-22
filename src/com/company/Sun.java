package com.company;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Sun extends SimpleDrawObject {

    public Sun(double centerX, double centerY, int radius) {
        Circle sun = new Circle(centerX, centerY, radius);
        sun.setFill(Color.YELLOW);
        holst.getChildren().addAll(sun);
    }
}
