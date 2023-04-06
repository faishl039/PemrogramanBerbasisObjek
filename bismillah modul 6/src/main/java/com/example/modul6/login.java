package com.example.modul6;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class login extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Form Login");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 20,20,20));

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);

        Text sceneTitle = new Text("Welcome!");
        sceneTitle.setFont(Font.font("Bauhaus 93", FontWeight.NORMAL, 20));
        grid.add(sceneTitle, 0, 0, 2, 1);

        Label uname = new Label("Username : ");
        grid.add(uname, 0, 1);
        TextField unameTextField = new TextField();
        grid.add(unameTextField,1,1);

        Label pw = new Label("Password : ");
        grid.add(pw,0,2);
        PasswordField pwBox = new PasswordField();
        grid.add(pwBox,1,2);

        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn,1,4);

        final Text action = new Text();
        grid.add(action,1,6);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                action.setFill(Color.FIREBRICK);
                action.setText("Belum ada akun");
            }
        });

        primaryStage.show();
    }
}