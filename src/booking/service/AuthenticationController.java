package booking.service;

import booking.model.User;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;

public class AuthenticationController {
    @FXML
    private HBox titlebar;
    @FXML
    private TextField usernameField, usernameField1;
    @FXML
    private PasswordField passwordField, passwordField1;
    @FXML
    private AnchorPane signupForm, loginForm;
    @FXML
    private Hyperlink forgotpass;
    @FXML
    private ImageView i1, i2, i3, i4;
    @FXML
    private TextField emailField;
    @FXML
    private Label close, minimize;
    @FXML
    private Button loginButton, okbtn, disagreebtn, signupButton, continuebtn, SIGNUP1, LOGIN1, sendButton;

    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])" + "(?=.*[a-z])" + "(?=.*[A-Z])" + "(?=.*[!@#$%^&*()_+])" + "(?=\\S+$).{8,}$";
    private final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
    private double y = 0;
    private double x = 0;
    private List<User> registeredUsers;

    @FXML
    public void initialize() {

        registeredUsers = new ArrayList<>();

        if (usernameField1 != null) {
            usernameField1.setVisible(false);
            passwordField1.setVisible(false);
            signupButton.setVisible(false);
            LOGIN1.setVisible(false);
            i1.setVisible(false);
            i2.setVisible(false);
            usernameField.setOnKeyPressed(event -> {
                if (event.getCode() == KeyCode.ENTER) {
                    Login();
                }
            });

            passwordField.setOnKeyPressed(event -> {
                if (event.getCode() == KeyCode.ENTER) {
                    Login();
                }
            });
            usernameField1.setOnKeyPressed(event -> {
                if (event.getCode() == KeyCode.ENTER) {
                    Signup();
                }
            });
            passwordField1.setOnKeyPressed(event -> {
                if (event.getCode() == KeyCode.ENTER) {
                    Signup();
                }
            });
        }
    }

    @FXML
    private void close(MouseEvent event){
        Stage close = (Stage) ((Node)event.getSource()).getScene().getWindow();
        close.close();
    }

    @FXML
    private void disagree(MouseEvent event){
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
    private void btn(MouseEvent event){
        TranslateTransition slide = new TranslateTransition();
        TranslateTransition slide2 = new TranslateTransition();
        slide.setDuration(Duration.seconds(0.7));
        slide.setNode(loginForm);
        slide2.setDuration(Duration.seconds(0.7));
        slide2.setNode(signupForm);

        slide.setToX(-350);
        slide.play();
        slide2.setToX(240);
        slide2.play();

        signupButton.setVisible(true);
        forgotpass.setVisible(false);
        LOGIN1.setVisible(true);
        i1.setVisible(true);
        i2.setVisible(true);
        usernameField1.setVisible(true);
        passwordField1.setVisible(true);
        SIGNUP1.setVisible(false);
        loginButton.setVisible(false);
        i3.setVisible(false);
        i4.setVisible(false);
        usernameField.setVisible(false);
        passwordField.setVisible(false);


        slide.setOnFinished((actionEvent -> {}));

    }

    @FXML
    private void btn2(MouseEvent event){
        TranslateTransition slide = new TranslateTransition();
        TranslateTransition slide2 = new TranslateTransition();
        slide.setDuration(Duration.seconds(0.7));
        slide.setNode(signupForm);
        slide2.setDuration(Duration.seconds(0.7));
        slide2.setNode(loginForm);

        slide.setToX(0);
        slide.play();
        slide2.setToX(0);
        slide2.play();

        loginButton.setVisible(true);
        forgotpass.setVisible(true);
        SIGNUP1.setVisible(true);
        i3.setVisible(true);
        i4.setVisible(true);
        usernameField.setVisible(true);
        passwordField.setVisible(true);
        usernameField1.setVisible(false);
        passwordField1.setVisible(false);
        LOGIN1.setVisible(false);
        signupButton.setVisible(false);
        i1.setVisible(false);
        i2.setVisible(false);


        slide.setOnFinished((actionEvent -> {}));
    }

    @FXML
    private void Login() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (AuthenticationManager.login(username, password)) {
            try {
                Stage Stage = (Stage) loginButton.getScene().getWindow();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/WelcomeUI.fxml"));
                Stage.setScene(new Scene(root1, 450, 500));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/LogInFailedUI.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 350, 100));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @FXML
    private void Signup() {
        String username = usernameField1.getText();
        String password = passwordField1.getText();

        if (username.isEmpty() || password.isEmpty()) {
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/RegistrationFailed.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 400, 100));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
            return;
        }

        if (isUsernameTaken(username)) {
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/RegistrationFailed2.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 400, 125));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
            return;
        }

        if (pattern.matcher(password).matches()) {

            registeredUsers.add(new User(username, password));

            AuthenticationManager.setRegisteredUsers(registeredUsers);

            System.out.println("Registered users:");
            for (User user : registeredUsers) {
                System.out.println(user.getUsername() + " - " + user.getPassword());
            }

            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/RegistrationSuccessfully.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 380, 464));
                Stage.show();

                if (continuebtn != null) {
                    continuebtn.setOnKeyPressed(event -> {
                        if (event.getCode() == KeyCode.ENTER) {
                            Stage.close();
                        }
                    });
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }else {
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/PasswordInvalid.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 480, 155));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private boolean isUsernameTaken(String username) {
        for (User user : registeredUsers) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    @FXML
    private void forgotPassword() {
        try {
            Stage forgotStage = new Stage();
            Parent root1 = FXMLLoader.load(getClass().getResource("/Resources/ForgotPass.fxml"));
            forgotStage.initStyle(StageStyle.UNDECORATED);
            forgotStage.setScene(new Scene(root1, 600, 400));
            forgotStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void forgotPass(){
        String email = emailField.getText();
        if (email != null && !email.isEmpty()) {
            if (!email.contains("@")) {
                try {
                    Stage Stage = new Stage();
                    Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/InvalidEmail.fxml"));
                    Stage.initStyle(StageStyle.UNDECORATED);
                    Stage.setScene(new Scene(root1, 350, 100));
                    Stage.show();

                } catch (IOException e) {
                    e.printStackTrace();
                }            }
            else{
                String temporaryPassword = generateRandomPassword();

                sendTemporaryPasswordByEmail(email, temporaryPassword);

                try {
                    Stage Stage = new Stage();
                    Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/PasswordReset.fxml"));
                    Stage.initStyle(StageStyle.UNDECORATED);
                    Stage.setScene(new Scene(root1, 400, 128));
                    Stage.show();

                } catch (IOException e) {
                    e.printStackTrace();
                }                Stage stage = (Stage) sendButton.getScene().getWindow();
                stage.close();
            }

        }
        else {
            try {
                Stage Stage = new Stage();
                Parent root1 = FXMLLoader.load(getClass().getResource("/Error UI/EmptyEmail.fxml"));
                Stage.initStyle(StageStyle.UNDECORATED);
                Stage.setScene(new Scene(root1, 379, 111));
                Stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private String generateRandomPassword() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int length = 10;
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    private void sendTemporaryPasswordByEmail(String email, String temporaryPassword) {
        System.out.println("Temporary Password for " + email + ": " + temporaryPassword);
    }
}

