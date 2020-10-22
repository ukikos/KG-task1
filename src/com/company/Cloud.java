package com.company;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Cloud extends SimpleDrawObject {

    public Cloud(double centerX, double centerY, int size) {
        for (int i = 0; i < (int)(Math.random() * 5 + 3); i++) {
            Circle circle = new Circle(Math.random() * size + 30);
            circle.setCenterX(centerX + 45 * i);
            circle.setCenterY(centerY + Math.random() * 20 - Math.random() * 20);
            circle.setFill(Color.LIGHTBLUE);
            holst.getChildren().add(circle);
        }
    }
}
