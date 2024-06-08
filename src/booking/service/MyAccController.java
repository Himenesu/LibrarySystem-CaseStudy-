package booking.service;

import booking.model.Book;
import booking.model.Transact;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class MyAccController{
    @FXML
    private Button returnbtn, proceedbtn ;
    @FXML
    private Label close, minimize, b1, b2, b3, b4, b5;
    @FXML
    private HBox titlebar;
    @FXML
    private TextField Days;

    private Parent root;
    private Stage stage;
    private double y = 0;
    private double x = 0;

    public void initialize(){
        if(Book.title.equals("")){
            b1.setText("Please select a book.");
        }
        else{
            b1.setText(Book.title);
        }
        if(Book.title1.equals("")){
            b2.setText("Please select a book.");
        }else{
            b2.setText(Book.title1);
        }
        if(Book.title2.equals("")){
            b3.setText("Please select a book.");
        }else{
            b3.setText(Book.title2);

        }
        if(Book.title3.equals("")){
            b4.setText("Please select a book.");
        }else{
            b4.setText(Book.title3);

        }
        if(Book.title4.equals("")){
            b5.setText("Please select a book.");
        }else{
            b5.setText(Book.title4);
        }
    }
    @FXML
    private void clear(ActionEvent event){
        b1.setText("");
        Book.title = "";
    }
    @FXML
    private void clear1(ActionEvent event){
        b2.setText("");
        Book.title1 = "";
    }
    @FXML
    private void clear2(ActionEvent event){
        b3.setText("");
        Book.title2 = "";
    }
    @FXML
    private void clear3(ActionEvent event){
        b4.setText("");
        Book.title3 = "";
    }
    @FXML
    private void clear4(ActionEvent event){
        b5.setText("");
        Book.title4 = "";
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
    private void openBookingSystem1() {
        try {
            if(returnbtn!=null) {
                Stage primaryStage = (Stage) returnbtn.getScene().getWindow();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Resources/HomePage.fxml"));
                primaryStage.setScene(new Scene(root1, 935, 750));
                primaryStage.show();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void proceed(ActionEvent event){
        try {
            if(!Book.title.equals("")||!Book.title1.equals("")||!Book.title2.equals("")||!Book.title3.equals("")||!Book.title4.equals("")) {
                int days = Integer.parseInt(Days.getText());
                if (days <= 10) {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/Resources/Receipt.fxml"));
                    root = loader.load();
                    Transact subController = (Transact) loader.getController();
                    subController.displayDays(days);
                    stage = (Stage) proceedbtn.getScene().getWindow();
                    stage.setScene(new Scene(root, 470, 700));
                    stage.show();
                } else {
                    try {
                        Stage Stage = new Stage();
                        Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/PleaseTakeNote.fxml"));
                        Stage.initStyle(StageStyle.UNDECORATED);
                        Stage.setScene(new Scene(root1, 379, 132));
                        Stage.show();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            else {
                try {
                    Stage Stage = new Stage();
                    Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/ErrorSelection.fxml"));
                    Stage.initStyle(StageStyle.UNDECORATED);
                    Stage.setScene(new Scene(root1, 379, 124));
                    Stage.show();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        catch(NumberFormatException e) {
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/InputInvalid.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 350, 100));
                Stage.show();

            } catch (IOException e1) {
                e1.printStackTrace();
            }        }

        catch (IOException e){
            e.printStackTrace();
        }
    }

}
