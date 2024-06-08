package booking.ui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.Node;
import java.io.IOException;

public class Controller {
    @FXML
    private Button continuebtn, accountbtn, disagreebtn, agreebtn, borrowbtn, backbtn;
    @FXML
    private Label close, minimize;
    @FXML
    private Label b1, b2, b3, b4, b5;
    @FXML
    private HBox titlebar, tsp, mama, paborito, me, brief, diktador, bone, young, kapitan, java, code, guns, tsp2, noli2, brief2;
    @FXML
    private Text tsptext, mamatext, sinotext, tcdtext, tgatext, brieftext, javatext, codetext, bonestext, nolitext, tdatext, hudastext;

    private double y = 0;
    private double x = 0;

    @FXML
    private void close(MouseEvent event) {
        Stage close = (Stage) ((Node) event.getSource()).getScene().getWindow();
        close.close();
    }

    @FXML
    private void disagree(MouseEvent event) {
        try {
            Stage signout = (Stage) disagreebtn.getScene().getWindow();
            Parent root1 = FXMLLoader.load(getClass().getResource("/Resources/LoginInterface.fxml"));
            signout.setTitle("Login");
            signout.setScene(new Scene(root1, 600, 400));
            signout.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void minimize(MouseEvent event) {
        Stage min = (Stage) ((Node) event.getSource()).getScene().getWindow();
        min.setIconified(true);
    }

    @FXML
    private void pressed(MouseEvent event) {
        x = event.getSceneX();
        y = event.getSceneY();
    }

    @FXML
    private void drag(MouseEvent event) {
        Stage drag = (Stage) titlebar.getScene().getWindow();
        drag.setX(event.getScreenX() - x);
        drag.setY(event.getScreenY() - y);
    }

    @FXML
    private void rules() {
        try {
            Stage rulesstage = (Stage) continuebtn.getScene().getWindow();
            Parent root1 = FXMLLoader.load(getClass().getResource("/Resources/Rules.fxml"));
            rulesstage.setTitle("Rules");
            rulesstage.setScene(new Scene(root1, 450, 700));
            rulesstage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void openBookingSystem() {
        try {
            if (backbtn != null) {
                Stage primaryStage = (Stage) backbtn.getScene().getWindow();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Resources/HomePage.fxml"));
                primaryStage.setScene(new Scene(root1, 935, 750));
                primaryStage.show();
            } else if (agreebtn != null) {
                Stage primaryStage = (Stage) agreebtn.getScene().getWindow();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Resources/HomePage.fxml"));
                primaryStage.setScene(new Scene(root1, 935, 750));
                primaryStage.show();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
