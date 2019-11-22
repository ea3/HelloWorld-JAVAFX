package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        GridPane root = new GridPane();
//        root.setAlignment(Pos.CENTER);
//        root.setVgap(10);
//        root.setHgap(10);  // without using the FXML file.
//
//        Label greeting= new Label(" Welcome to JAVAfx");
//        greeting.setTextFill(Color.GREEN);
//        greeting.setFont(Font.font("Ties New Roman", FontWeight.BOLD, 70));
//        root.getChildren().add(greeting);
        primaryStage.setTitle("Hello Emilio");
        primaryStage.setScene(new Scene(root, 900, 975));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
