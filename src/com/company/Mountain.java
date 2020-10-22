package com.company;

import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class Mountain extends SimpleDrawObject {

    public Mountain() {
        Polygon polygon1 = new Polygon(200, 500, 430, 350, 620, 500);
        polygon1.setFill(Color.rgb(91,91,91));
        Polygon polygon2 = new Polygon(-200,500,120,200,400,500);
        polygon2.setFill(Color.rgb(129,129,129));
        Polygon polygon3 = new Polygon(500,500,760,80,1200,500);
        polygon3.setFill(Color.rgb(119,119,119));
        holst.getChildren().addAll(polygon1, polygon2, polygon3);
    }
}
