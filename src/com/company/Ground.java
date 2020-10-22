package com.company;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Ground extends SimpleDrawObject {

    public Ground(int x, int y, int width, int height) {
        Rectangle rectangle = new Rectangle(x, y, width, height);
        rectangle.setFill(Color.rgb(21,194,37));
        holst.getChildren().addAll(rectangle);
    }
}
