package com.example.modul6;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class PercobaanDua extends Application {

    private TableView table = new TableView();
    private ObservableList data;

    public static void main(String[] args) {
        launch(args);
    }

    public static class Maha{
        private SimpleStringProperty name;
        private SimpleStringProperty nim;
        private SimpleStringProperty email;

        private Maha(String name, String nim, String email){
            this.name = new SimpleStringProperty();
            this.nim= new SimpleStringProperty();
            this.email = new SimpleStringProperty();
        }

        public String getName() {
            return name.get();
        }
        public void setName(String name) {
            this.name.set(name);
        }

        public String getNim() {
            return nim.get();
        }
        public void setEmail(String email) {
            this.email.set(email);
        }

        public String getEmail() {
            return email.get();
        }
        public void setNim(String nim) {
            this.nim.set(nim);
        }
        
        final ObservableList<Maha> data = FXCollections.observableArrayList(
                new Maha("Pesal","202110370311018","pesal@gmail.com")
        );
        
        
    }

    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(new Group());
        primaryStage.setTitle("Test TableView");
        primaryStage.setWidth(450);
        primaryStage.setHeight(550);
        final Label label = new Label("Daftar Mahasiswa");
        label.setFont(new Font("Berlin Sans FB", 30));

        table.setEditable(true);
        TableColumn nameCol = new TableColumn("Nama");
        TableColumn nimColl = new TableColumn("NIM");
        TableColumn emailColl = new TableColumn("Email");

        table.getColumns().addAll(nameCol, nimColl, emailColl);

        final VBox vbox = new VBox();
        vbox.setSpacing(8);
        vbox.setPadding(new Insets(20,10,10,10));
        vbox.getChildren().addAll(label, table);

        ((Group) scene.getRoot()).getChildren().addAll(vbox);

        nameCol.setCellFactory(new PropertyValueFactory<Maha, String>("name"));
        nameCol.setCellFactory(new PropertyValueFactory<Maha, String>("nim"));
        nameCol.setCellFactory(new PropertyValueFactory<Maha, String>("email"));

        table.setItems(data);

        final TextField addName = new TextField();
        addName.setMaxWidth(nameCol.getPrefWidth());
        addName.setPromptText("Nama Mahasiswa");
        final TextField addNim = new TextField();
        addNim.setMaxWidth(nimColl.getPrefWidth());
        addNim.setPromptText("NIM");
        final TextField addEmail = new TextField();
        addEmail.setMaxWidth(emailColl.getPrefWidth());
        addEmail.setPromptText("Email");
        final Button addButton = new Button("Add");
        addButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                data.add(new Maha(
                        addName.getText(),
                        addNim.getText(),
                        addEmail.getText()
                ));
            }
        });

        addName.clear();
        addNim.clear();
        addEmail.clear();

        final HBox hboxInput = new HBox();
        hboxInput.getChildren().addAll(addName, addNim, addEmail, addButton);
        hboxInput.setSpacing(10);

        vbox.getChildren().addAll(label, table, hboxInput);

        primaryStage.setScene(scene);
        primaryStage.show();

    }
}