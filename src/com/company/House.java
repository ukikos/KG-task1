package com.company;

import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class House extends SimpleDrawObject {
    public House() {
        Rectangle house = new Rectangle(450, 400, 250,150);
        house.setFill(Color.rgb(237,175,40));

        Polygon roof = new Polygon(450,400,575,300,700,400);
        roof.setFill(Color.DARKBLUE);

        Rectangle windowOut = new Rectangle(480,430,60,75);
        windowOut.setFill(Color.BROWN);

        Rectangle windowIn = new Rectangle(485, 435, 50, 65);
        windowIn.setFill(Color.LIGHTBLUE);

        Rectangle door = new Rectangle(610, 420, 60, 110);
        door.setFill(Color.BROWN);

        Rectangle handle = new Rectangle(660, 470, 5, 10);
        handle.setFill(Color.BLACK);

        Rectangle bottom = new Rectangle(450,530,250,20);
        bottom.setFill(Color.DARKGRAY);

        holst.getChildren().addAll(house, roof, windowOut, windowIn, door, handle, bottom);

    }
}
