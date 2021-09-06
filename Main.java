package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Ellipse;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //primaryStage.setTitle("Hello World");
        //primaryStage.setScene(new Scene(root, 300, 275));

        //********Display Article******
        WebView myWebView = new WebView();
        WebEngine engine = myWebView.getEngine();
        engine.load("https://medicine.iu.edu/blogs/student-life/i-am-not-invincible-my-covid-19-story");

        //*******Hyperlink Image*******
        ImageView imageView = new ImageView("https://i2.wp.com/freepolicybriefs.org/wp-content/uploads/2020/04/20200407-covid19-project-free-network-policy-brief-image-01.jpeg?w=2048&ssl=1");
        imageView.setFitHeight(200);
        imageView.setFitWidth(200);
        Hyperlink image = new Hyperlink("Covid");
        image.setOnAction(e ->{
            try {
                Test1 test1= new Test1();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });

        //*****Button****
        Button b1 = new javafx.scene.control.Button("Category 1");
        b1.setOnAction(actionEvent ->  {
            try {
                Test test = new Test();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        Button b2 = new javafx.scene.control.Button("Category 2");
        b2.setOnAction(actionEvent ->  {
            try {
                Test1 test1 = new Test1();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        Button b3 = new javafx.scene.control.Button("Category 3");
        b3.setOnAction(actionEvent ->  {
            try {
                Test2 test2 = new Test2();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });


        VBox root = new VBox();
        root.getChildren().addAll(myWebView,image,imageView,b1,b2,b3);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);


        primaryStage.show();
    }


}
