package com.example.csc411sql.controllers.auth;

import com.example.csc411sql.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class RegisterController {
    Application application = new Application();



    @FXML
    void signUpOnAction(ActionEvent event) {
    }


    @FXML
    void signInOnMouse(MouseEvent event) throws IOException {
        application.changeScenes(event, "login.fxml");
    }
}
