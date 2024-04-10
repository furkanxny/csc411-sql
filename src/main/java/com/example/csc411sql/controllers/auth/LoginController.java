package com.example.csc411sql.controllers.auth;

import com.example.csc411sql.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class LoginController {
    @FXML
    private TextField passwordTF;

    @FXML
    private TextField usernameTF;

    Application application = new Application();


    @FXML
    void signInOnAction(ActionEvent event) {

    }
    @FXML
    void click(MouseEvent event) throws IOException {
     application.changeScenes(event, "register.fxml");
    }


}