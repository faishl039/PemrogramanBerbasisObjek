package com.example.modul6;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Biodata extends Application {

    private TableView tableBiodata = new TableView();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Form Biodata");
        GridPane gPane = new GridPane();
//        gPane.setGridLinesVisible(false);
        gPane.setAlignment(Pos.CENTER);
        gPane.setHgap(10);
        gPane.setVgap(8);
//        gPane.setPadding(new Insets(10,10,10,10));


        Text pembuka = new Text("Isi Biodata Anda!");
        pembuka.setFont(Font.font("Arial Black", FontPosture.ITALIC, 45));
        gPane.add(pembuka, 0, 0, 2, 1);

        Text nama = new Text("Nama  ");
        gPane.add(nama, 0, 1);
        TextField fieldNama = new TextField();
        gPane.add(fieldNama, 1, 1);

        Text nim = new Text("NIM  ");
        gPane.add(nim, 0, 2);
        TextField fieldNim = new TextField();
        gPane.add(fieldNim, 1, 2);

        Text email = new Text("Email  ");
        gPane.add(email, 0, 3);
        TextField fieldEmail = new TextField();
        Text ujung = new Text("@webmail.umm.ac.id");
        gPane.add(fieldEmail, 1, 3);
        gPane.add(ujung, 2, 3);

        Text fakultas = new Text("Fakultas  ");
        gPane.add(fakultas, 0, 4);
        TextField fieldFak = new TextField();
        gPane.add(fieldFak, 1, 4);

        Text jurusan = new Text("Jurusan  ");
        gPane.add(jurusan, 0, 5);
        TextField fieldJur = new TextField();
        gPane.add(fieldJur, 1, 5);

        Text alamat = new Text("Alamat ");
        gPane.add(alamat, 0, 6);
        TextArea fieldAlamat = new TextArea();
        fieldAlamat.setMaxSize(500, 80);
        gPane.add(fieldAlamat, 1, 6);

        Text kota = new Text("Kota ");
        gPane.add(kota, 0, 7);
        TextField fieldKota = new TextField();
        gPane.add(fieldKota, 1, 7);

        HBox hbxSub = new HBox(20);
        hbxSub.setAlignment(Pos.BOTTOM_RIGHT);
        Button submit = new Button("Submit");
        submit.setStyle("-fx-background-color:#00A86B ; -fx-text-fill: white");

        hbxSub.getChildren().add(submit);
        gPane.add(hbxSub, 1, 8);
        Scene scn1 = new Scene(gPane, 700, 550);

        //scene2
        TableColumn tNama = new TableColumn("Nama");
        TableColumn tNim = new TableColumn("NIM");
        TableColumn tEmail = new TableColumn("Email");
        TableColumn tFakultas = new TableColumn("Fakultas");
        TableColumn tJurusan = new TableColumn("Jurusan");
        TableColumn tAlamat = new TableColumn("Alamat");
        TableColumn tKota = new TableColumn("Kota");

        tableBiodata.getColumns().addAll(tNama, tNim, tEmail, tFakultas, tJurusan, tAlamat, tKota);

        ObservableList<GetSetBiodata> gsBio = FXCollections.observableArrayList();
        tNama.setCellValueFactory(new PropertyValueFactory<GetSetBiodata, String>("mdNama"));
        tNim.setCellValueFactory(new PropertyValueFactory<GetSetBiodata, String>("mdNim"));
        tEmail.setCellValueFactory(new PropertyValueFactory<GetSetBiodata, String>("mdEmail"));
        tFakultas.setCellValueFactory(new PropertyValueFactory<GetSetBiodata, String>("mdFak"));
        tJurusan.setCellValueFactory(new PropertyValueFactory<GetSetBiodata, String>("mdJur"));
        tAlamat.setCellValueFactory(new PropertyValueFactory<GetSetBiodata, String>("mdAlamat"));
        tKota.setCellValueFactory(new PropertyValueFactory<GetSetBiodata, String>("mdKota"));

        tableBiodata.setItems(gsBio);

        Scene scn2 = new Scene(tableBiodata, 800, 750);

        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (fieldNim.getText().isEmpty() || fieldNama.getText().isEmpty()
                        || fieldAlamat.getText().isEmpty() || fieldKota.getText().isEmpty()) {
                    Alert nimAlert = new Alert(Alert.AlertType.WARNING);
                    nimAlert.setTitle("Warning!");
                    nimAlert.setHeaderText("Field Cant Be Empty!");
                    nimAlert.showAndWait();
                } else if (fieldNim.getText().matches("[0-9]*")) {
                    primaryStage.setScene(scn2);
                    gsBio.add(new GetSetBiodata(
                            fieldNama.getText(), fieldNim.getText(), fieldEmail.getText()+"@webmail.umm.ac.id",
                            fieldFak.getText(), fieldJur.getText(),
                            fieldAlamat.getText(), fieldKota.getText()
                    ));
                } else {
                    Alert nimAlert2 = new Alert(Alert.AlertType.WARNING);
                    nimAlert2.setTitle("Warning!");
                    nimAlert2.setHeaderText("Field NIM Must Be a Number!");
                    nimAlert2.showAndWait();
                }
            }
        });

        primaryStage.setScene(scn1);
        primaryStage.show();
    }
}