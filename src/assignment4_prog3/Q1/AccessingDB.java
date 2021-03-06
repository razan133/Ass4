/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4_prog3.Q1;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author hp
 */
public class AccessingDB extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        Pane paneStudentTableView = FXMLLoader.load(getClass().getResource("Table.fxml"));
        Scene scene = new Scene(paneStudentTableView);
        primaryStage.setTitle("Accessing Databased Using JDBC");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
