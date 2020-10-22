package com.company;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Run extends Application {
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene frame = new Scene(root, 825, 600, Color.GREEN);

        Sky sky = new Sky(0, 0, 825, 600);
        sky.putOnGroup(root);

        Sun sun = new Sun(100, 60, 30);
        sun.putOnGroup(root);

        Ground ground = new Ground(0, 500, 825, 100);
        ground.putOnGroup(root);

        Mountain mountain = new Mountain();
        mountain.putOnGroup(root);

        for (int i = 0; i < 3; i++) {
            Cloud cloud = new Cloud(Math.random() * 825, Math.random() * 100 + 80, (int)(20+Math.random()*10));
            cloud.putOnGroup(root);
        }

        House house = new House();
        house.putOnGroup(root);

        primaryStage.setTitle("task1");
        primaryStage.setScene(frame);
        primaryStage.show();
    }
}
