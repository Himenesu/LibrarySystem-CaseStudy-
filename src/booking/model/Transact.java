package booking.model;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transact {
    @FXML
    private Button homebtn, signoutbtn;
    @FXML
    private Label b6,b7,b8,b9,b10, b1, labeltoupdate, date, dateofreturn;
    @FXML
    private HBox titlebar;

    private Stage stage;
    private Scene scene;
    private double y = 0;
    private double x = 0;

    public void initialize(){
        b6.setText(Book.title);
        b7.setText(Book.title1);
        b8.setText(Book.title2);
        b9.setText(Book.title3);
        b10.setText(Book.title4);
    }

    @FXML
    private void close(MouseEvent event){
        Stage close = (Stage) ((Node)event.getSource()).getScene().getWindow();
        close.close();
    }
    @FXML
    private void minimize(MouseEvent event) {
        Stage min = (Stage) ((Node)event.getSource()).getScene().getWindow();
        min.setIconified(true);
    }
    @FXML
    private void pressed(MouseEvent event){
        x = event.getSceneX();
        y = event.getSceneY();
    }
    @FXML
    private void drag(MouseEvent event){
        Stage drag = (Stage) titlebar.getScene().getWindow();
        drag.setX(event.getScreenX()-x);
        drag.setY(event.getScreenY()-y);
    }
    @FXML
    private void signout(MouseEvent event){
        try {
            Stage signout = (Stage) signoutbtn.getScene().getWindow();
            Parent root1 = FXMLLoader.load(getClass().getResource("/Resources/LoginInterface.fxml"));
            signout.setTitle("Login");
            signout.setScene(new Scene(root1, 600, 400));
            signout.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void openBookingSystem2() {
        try {
            if(homebtn!=null) {
                Stage primaryStage = (Stage) homebtn.getScene().getWindow();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Resources/HomePage.fxml"));
                primaryStage.setScene(new Scene(root1, 935, 750));
                primaryStage.show();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void displayDays(int days){
        labeltoupdate.setText(days+" days.");
        LocalDateTime currentDateTime = LocalDateTime.now();
        date.setText(currentDateTime.format(DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss")));
        LocalDateTime returnDateTime = currentDateTime.plusDays(days);
        dateofreturn.setText(returnDateTime.format(DateTimeFormatter.ofPattern("MM-dd-yyyy")));
    }
}
