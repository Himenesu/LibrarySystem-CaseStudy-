package booking.service;

import booking.model.Book;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.BoxBlur;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class BorrowController {
    @FXML
    private Button borrowbtn, disagreebtn, backbtn, agreebtn, accountbtn;
    @FXML
    private Label close, minimize;
    @FXML
    private HBox titlebar, tsp, mama, paborito, me, brief, diktador, bone, young, kapitan, java, code, guns, tsp2, noli2, brief2;
    @FXML
    private Text tsptext, mamatext, sinotext, tcdtext, tgatext, brieftext, javatext, codetext, bonestext, nolitext, tdatext, hudastext;

    private Set<String> borrowedBooks = new HashSet<>();

    private double y = 0;
    private double x = 0;

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
    private void myAcc() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Resources/MyAcc.fxml"));
            Parent root1 = loader.load();
            Stage accstage = (Stage) accountbtn.getScene().getWindow();
            accstage.setScene(new Scene(root1, 935, 600));
            accstage.show();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void openBookingSystem3() {
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

    @FXML
    private void tspdeets() {
        try {
            Stage primaryStage = (Stage) tsp.getScene().getWindow();
            BoxBlur blur = new BoxBlur();
            blur.setWidth(13);
            blur.setHeight(10);
            blur.setIterations(3);
            primaryStage.getScene().getRoot().setEffect(blur);

            Stage tspstage = new Stage();
            Parent root1 = FXMLLoader.load(getClass().getResource("/Books/SilentPatient.fxml"));
            tspstage.initStyle(StageStyle.UNDECORATED);
            tspstage.setScene(new Scene(root1, 450, 620));
            tspstage.initModality(Modality.APPLICATION_MODAL);
            tspstage.initOwner(primaryStage);
            tspstage.setOnHidden(event -> primaryStage.getScene().getRoot().setEffect(null));

            tspstage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void mamasusan() {
        try {
            Stage primaryStage = (Stage) mama.getScene().getWindow();
            BoxBlur blur = new BoxBlur();
            blur.setWidth(13);
            blur.setHeight(10);
            blur.setIterations(3);
            primaryStage.getScene().getRoot().setEffect(blur);

            Stage tspstage = new Stage();
            Parent root1 = FXMLLoader.load(getClass().getResource("/Books/AngMgaKaibiganniMamaSusan.fxml"));
            tspstage.initStyle(StageStyle.UNDECORATED);
            tspstage.setScene(new Scene(root1, 450, 620));
            tspstage.initModality(Modality.APPLICATION_MODAL);
            tspstage.initOwner(primaryStage);

            tspstage.setOnHidden(event -> primaryStage.getScene().getRoot().setEffect(null));

            tspstage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void hudas() {
        try {
            Stage primaryStage = (Stage) paborito.getScene().getWindow();
            BoxBlur blur = new BoxBlur();
            blur.setWidth(13);
            blur.setHeight(10);
            blur.setIterations(3);
            primaryStage.getScene().getRoot().setEffect(blur);

            Stage tspstage = new Stage();
            Parent root1 = FXMLLoader.load(getClass().getResource("/Books/AngPaboritongLibroNiHudas.fxml"));
            tspstage.initStyle(StageStyle.UNDECORATED);
            tspstage.setScene(new Scene(root1, 450, 620));
            tspstage.initModality(Modality.APPLICATION_MODAL);
            tspstage.initOwner(primaryStage);

            tspstage.setOnHidden(event -> primaryStage.getScene().getRoot().setEffect(null));

            tspstage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void bones() {
        try {
            Stage primaryStage = (Stage) bone.getScene().getWindow();
            BoxBlur blur = new BoxBlur();
            blur.setWidth(13);
            blur.setHeight(10);
            blur.setIterations(3);
            primaryStage.getScene().getRoot().setEffect(blur);

            Stage tspstage = new Stage();
            Parent root1 = FXMLLoader.load(getClass().getResource("/Books/BonesofContention.fxml"));
            tspstage.initStyle(StageStyle.UNDECORATED);
            tspstage.setScene(new Scene(root1, 450, 620));
            tspstage.initModality(Modality.APPLICATION_MODAL);
            tspstage.initOwner(primaryStage);

            tspstage.setOnHidden(event -> primaryStage.getScene().getRoot().setEffect(null));

            tspstage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void code() {
        try {
            Stage primaryStage = (Stage) code.getScene().getWindow();
            BoxBlur blur = new BoxBlur();
            blur.setWidth(13);
            blur.setHeight(10);
            blur.setIterations(3);
            primaryStage.getScene().getRoot().setEffect(blur);

            Stage tspstage = new Stage();
            Parent root1 = FXMLLoader.load(getClass().getResource("/Books/Code.fxml"));
            tspstage.initStyle(StageStyle.UNDECORATED);
            tspstage.setScene(new Scene(root1, 450, 620));
            tspstage.initModality(Modality.APPLICATION_MODAL);
            tspstage.initOwner(primaryStage);

            tspstage.setOnHidden(event -> primaryStage.getScene().getRoot().setEffect(null));

            tspstage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void forkids() {
        try {
            Stage primaryStage = (Stage) java.getScene().getWindow();
            BoxBlur blur = new BoxBlur();
            blur.setWidth(13);
            blur.setHeight(10);
            blur.setIterations(3);
            primaryStage.getScene().getRoot().setEffect(blur);

            Stage tspstage = new Stage();
            Parent root1 = FXMLLoader.load(getClass().getResource("/Books/JavaScriptForKids.fxml"));
            tspstage.initStyle(StageStyle.UNDECORATED);
            tspstage.setScene(new Scene(root1, 450, 620));
            tspstage.initModality(Modality.APPLICATION_MODAL);
            tspstage.initOwner(primaryStage);

            tspstage.setOnHidden(event -> primaryStage.getScene().getRoot().setEffect(null));

            tspstage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void sino() {
        try {
            Stage primaryStage = (Stage) kapitan.getScene().getWindow();
            BoxBlur blur = new BoxBlur();
            blur.setWidth(13);
            blur.setHeight(10);
            blur.setIterations(3);
            primaryStage.getScene().getRoot().setEffect(blur);

            Stage tspstage = new Stage();
            Parent root1 = FXMLLoader.load(getClass().getResource("/Books/KapitanSino.fxml"));
            tspstage.initStyle(StageStyle.UNDECORATED);
            tspstage.setScene(new Scene(root1, 450, 620));
            tspstage.initModality(Modality.APPLICATION_MODAL);
            tspstage.initOwner(primaryStage);

            tspstage.setOnHidden(event -> primaryStage.getScene().getRoot().setEffect(null));

            tspstage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void noli() {
        try {
            Stage primaryStage = (Stage) me.getScene().getWindow();
            BoxBlur blur = new BoxBlur();
            blur.setWidth(13);
            blur.setHeight(10);
            blur.setIterations(3);
            primaryStage.getScene().getRoot().setEffect(blur);

            Stage tspstage = new Stage();
            Parent root1 = FXMLLoader.load(getClass().getResource("/Books/NoliMeTangere.fxml"));
            tspstage.initStyle(StageStyle.UNDECORATED);
            tspstage.setScene(new Scene(root1, 450, 620));
            tspstage.initModality(Modality.APPLICATION_MODAL);
            tspstage.initOwner(primaryStage);

            tspstage.setOnHidden(event -> primaryStage.getScene().getRoot().setEffect(null));

            tspstage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void history() {
        try {
            Stage primaryStage = (Stage) brief.getScene().getWindow();
            BoxBlur blur = new BoxBlur();
            blur.setWidth(13);
            blur.setHeight(10);
            blur.setIterations(3);
            primaryStage.getScene().getRoot().setEffect(blur);

            Stage tspstage = new Stage();
            Parent root1 = FXMLLoader.load(getClass().getResource("/Books/StephenHawking_Description.fxml"));
            tspstage.initStyle(StageStyle.UNDECORATED);
            tspstage.setScene(new Scene(root1, 450, 620));
            tspstage.initModality(Modality.APPLICATION_MODAL);
            tspstage.initOwner(primaryStage);

            tspstage.setOnHidden(event -> primaryStage.getScene().getRoot().setEffect(null));

            tspstage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void diary() {
        try {
            Stage primaryStage = (Stage) young.getScene().getWindow();
            BoxBlur blur = new BoxBlur();
            blur.setWidth(13);
            blur.setHeight(10);
            blur.setIterations(3);
            primaryStage.getScene().getRoot().setEffect(blur);

            Stage tspstage = new Stage();
            Parent root1 = FXMLLoader.load(getClass().getResource("/Books/TheDIaryOfYounggirl.fxml"));
            tspstage.initStyle(StageStyle.UNDECORATED);
            tspstage.setScene(new Scene(root1, 450, 620));
            tspstage.initModality(Modality.APPLICATION_MODAL);
            tspstage.initOwner(primaryStage);

            tspstage.setOnHidden(event -> primaryStage.getScene().getRoot().setEffect(null));

            tspstage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void august() {
        try {
            Stage primaryStage = (Stage) guns.getScene().getWindow();
            BoxBlur blur = new BoxBlur();
            blur.setWidth(13);
            blur.setHeight(10);
            blur.setIterations(3);
            primaryStage.getScene().getRoot().setEffect(blur);

            Stage tspstage = new Stage();
            Parent root1 = FXMLLoader.load(getClass().getResource("/Books/TheGunsOfAugust.fxml"));
            tspstage.initStyle(StageStyle.UNDECORATED);
            tspstage.setScene(new Scene(root1, 450, 620));
            tspstage.initModality(Modality.APPLICATION_MODAL);
            tspstage.initOwner(primaryStage);

            tspstage.setOnHidden(event -> primaryStage.getScene().getRoot().setEffect(null));

            tspstage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void diktador() {
        try {
            Stage primaryStage = (Stage) diktador.getScene().getWindow();
            BoxBlur blur = new BoxBlur();
            blur.setWidth(13);
            blur.setHeight(10);
            blur.setIterations(3);
            primaryStage.getScene().getRoot().setEffect(blur);

            Stage tspstage = new Stage();
            Parent root1 = FXMLLoader.load(getClass().getResource("/Books/TheConjugalDictatorship.fxml"));
            tspstage.initStyle(StageStyle.UNDECORATED);
            tspstage.setScene(new Scene(root1, 450, 620));
            tspstage.initModality(Modality.APPLICATION_MODAL);
            tspstage.initOwner(primaryStage);

            tspstage.setOnHidden(event -> primaryStage.getScene().getRoot().setEffect(null));

            tspstage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void borrow(ActionEvent event){
        String bookTitle = "THE SILENT PATIENT";
        if (borrowedBooks.contains(bookTitle)) {
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/AlreadyBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 379, 100));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
            return;
        }
        if(Book.title.equals("")){
            Book.title = tsptext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title1.equals("")){
            Book.title1 = tsptext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title2.equals("")){
            Book.title2 = tsptext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title3.equals("")){
            Book.title3 = tsptext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title4.equals("")){
            Book.title4 = tsptext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        borrowedBooks.add(bookTitle);
    }
    @FXML
    private void borrow1(ActionEvent event){
        String bookTitle = "BONES OF CONTENTION";
        if (borrowedBooks.contains(bookTitle)) {
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/AlreadyBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 379, 100));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
            return;
        }
        if(Book.title.equals("")){
            Book.title = bonestext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title1.equals("")){
            Book.title1 = bonestext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title2.equals("")){
            Book.title2 = bonestext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title3.equals("")){
            Book.title3 = bonestext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title4.equals("")){
            Book.title4 = bonestext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        borrowedBooks.add(bookTitle);
    }
    @FXML
    private void borrow2(ActionEvent event){
        String bookTitle = "THE DIARY OF A YOUNG GIRL";
        if (borrowedBooks.contains(bookTitle)) {
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/AlreadyBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 379, 100));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
            return;
        }
        if(Book.title.equals("")){
            Book.title = tdatext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title1.equals("")){
            Book.title1 = tdatext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title2.equals("")){
            Book.title2 = tdatext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title3.equals("")){
            Book.title3 = tdatext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title4.equals("")){
            Book.title4 = tdatext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        borrowedBooks.add(bookTitle);
    }
    @FXML
    private void borrow3(ActionEvent event){
        String bookTitle = "THE CONJUGAL DICTATORSHIP";
        if (borrowedBooks.contains(bookTitle)) {
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/AlreadyBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 379, 100));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }            return;
        }
        if(Book.title1.equals("")){
            Book.title = tcdtext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title1.equals("")){
            Book.title1 = tcdtext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title2.equals("")){
            Book.title2 = tcdtext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title3.equals("")){
            Book.title3 = tcdtext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title4.equals("")){
            Book.title4 = tcdtext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        borrowedBooks.add(bookTitle);
    }
    @FXML
    private void borrow4(ActionEvent event){
        String bookTitle = "A BRIEF HISTORY OF TIME";
        if (borrowedBooks.contains(bookTitle)) {
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/AlreadyBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 379, 100));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }            return;
        }
        if(Book.title.equals("")){
            Book.title = brieftext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title1.equals("")){
            Book.title1 = brieftext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title2.equals("")){
            Book.title2 = brieftext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title3.equals("")){
            Book.title3 = brieftext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title4.equals("")){
            Book.title4 = brieftext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        borrowedBooks.add(bookTitle);
    }
    @FXML
    private void borrow5(ActionEvent event){
        String bookTitle = "NOLI ME TANGERE";
        if (borrowedBooks.contains(bookTitle)) {
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/AlreadyBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 379, 100));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }            return;
        }
        if(Book.title.equals("")){
            Book.title = nolitext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title1.equals("")){
            Book.title1 = nolitext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title2.equals("")){
            Book.title2 = nolitext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title3.equals("")){
            Book.title3 = nolitext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title4.equals("")){
            Book.title4 = nolitext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        borrowedBooks.add(bookTitle);
    }
    @FXML
    private void borrow6(ActionEvent event){
        String bookTitle = "KAPITAN SINO";
        if (borrowedBooks.contains(bookTitle)) {
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/AlreadyBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 379, 100));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }            return;
        }
        if(Book.title.equals("")){
            Book.title = sinotext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title1.equals("")){
            Book.title1 = sinotext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title2.equals("")){
            Book.title2 = sinotext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title3.equals("")){
            Book.title3 = sinotext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title4.equals("")){
            Book.title4 = sinotext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        borrowedBooks.add(bookTitle);
    }
    @FXML
    private void borrow7(ActionEvent event){
        String bookTitle = "ANG MGA KAIBIGAN NI MAMA SUSAN";
        if (borrowedBooks.contains(bookTitle)) {
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/AlreadyBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 379, 100));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
            return;
        }
        if(Book.title.equals("")){
            Book.title = mamatext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title1.equals("")){
            Book.title1 = mamatext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title2.equals("")){
            Book.title2 = mamatext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title3.equals("")){
            Book.title3 = mamatext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title4.equals("")){
            Book.title4 = mamatext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        borrowedBooks.add(bookTitle);
    }
    @FXML
    private void borrow8(ActionEvent event){
        String bookTitle = "ANG PABORITONG LIBRO NI HUDAS";
        if (borrowedBooks.contains(bookTitle)) {
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/AlreadyBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 379, 100));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }            return;
        }
        if(Book.title.equals("")){
            Book.title = hudastext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title1.equals("")){
            Book.title1 = hudastext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title2.equals("")){
            Book.title2 = hudastext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title3.equals("")){
            Book.title3 = hudastext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title4.equals("")){
            Book.title4 = hudastext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        borrowedBooks.add(bookTitle);
    }
    @FXML
    private void borrow9(ActionEvent event){
        String bookTitle = "JAVASCRIPT FOR KIDS";
        if (borrowedBooks.contains(bookTitle)) {
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/AlreadyBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 379, 100));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }            return;
        }
        if(Book.title1.equals("")){
            Book.title = javatext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title1.equals("")){
            Book.title1 = javatext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title2.equals("")){
            Book.title2 = javatext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title3.equals("")){
            Book.title3 = javatext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title4.equals("")){
            Book.title4 = javatext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        borrowedBooks.add(bookTitle);
    }
    @FXML
    private void borrow10(ActionEvent event) {
        String bookTitle = "CODE";
        if (borrowedBooks.contains(bookTitle)) {
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/AlreadyBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 379, 100));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }            return;
        }
        if (Book.title.equals("")) {
            Book.title = codetext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (Book.title1.equals("")) {
            Book.title1 = codetext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (Book.title2.equals("")) {
            Book.title2 = codetext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (Book.title3.equals("")) {
            Book.title3 = codetext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (Book.title4.equals("")) {
            Book.title4 = codetext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        borrowedBooks.add(bookTitle);
    }
    @FXML
    private void borrow11(ActionEvent event){
        String bookTitle = "THE GUNS OF AUGUST";
        if (borrowedBooks.contains(bookTitle)) {
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/AlreadyBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 379, 100));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }            return;
        }
        if(Book.title.equals("")){
            Book.title = tgatext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title1.equals("")){
            Book.title1 = tgatext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title2.equals("")){
            Book.title2 = tgatext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title3.equals("")){
            Book.title3 = tgatext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(Book.title4.equals("")){
            Book.title4 = tgatext.getText();
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/BookBorrowed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 400));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        borrowedBooks.add(bookTitle);

    }
}
