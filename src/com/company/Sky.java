package com.company;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Sky extends SimpleDrawObject {

    public Sky(int x, int y, int width, int height) {
        Rectangle rectangle = new Rectangle(x, y, width, height);
        rectangle.setFill(Color.rgb(0,198,254));
        holst.getChildren().addAll(rectangle);
    }
}
