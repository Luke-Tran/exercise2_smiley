package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        Pane pane = new Pane();
        Circle circle = new Circle(150, 137.5, 100);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        pane.getChildren().add(circle);

        int leftEyeX = 110;
        int leftEyeY = 110;
        int rightEyeX = 190;
        int rightEyeY = 110;
        Ellipse leftEye = new Ellipse(leftEyeX, leftEyeY, 28, 20);
        leftEye.setFill(Color.WHITE);
        leftEye.setStroke(Color.BLACK);
        pane.getChildren().add(leftEye);

        Ellipse rightEye = new Ellipse(rightEyeX, rightEyeY, 28, 20);
        rightEye.setFill(Color.WHITE);
        rightEye.setStroke(Color.BLACK);
        pane.getChildren().add(rightEye);

        int pupilSize = 12;
        Circle leftPupil = new Circle(leftEyeX, leftEyeY, pupilSize);
        pane.getChildren().add(leftPupil);
        Circle rightPupil = new Circle(rightEyeX, rightEyeY, pupilSize);
        pane.getChildren().add(rightPupil);

        // x, y, length, radiusX, radiusY, startAngle
        Arc arc2 = new Arc(150, 170, 60, 30, 180, 180);
        arc2.setFill(null);
        arc2.setType(ArcType.OPEN);
        arc2.setStroke(Color.BLACK);
        pane.getChildren().add(arc2);

        Arc arc1 = new Arc(150, 100, 80, 80, 30, 35); // Create an arc
        arc1.setFill(Color.RED); // Set fill color
        arc1.setType(ArcType.ROUND); // Set arc type

        HBox hBox = new HBox();
        hBox.setSpacing(10);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        borderPane.setBottom(hBox);
        BorderPane.setAlignment(hBox, Pos.CENTER);

        Scene scene = new Scene(borderPane, 300, 275);
        primaryStage.setTitle("Exercise 2: Smiley Face");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
