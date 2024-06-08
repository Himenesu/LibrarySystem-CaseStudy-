package booking.ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.io.IOException;

public class BookingSystemMain extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        try{
        Parent root = FXMLLoader.load(getClass().getResource("/Resources/LoginInterface.fxml"));
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
        }
    catch(IOException e) {
        e.printStackTrace();
    }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
