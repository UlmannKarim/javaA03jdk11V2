package com.example.a03v2jdk11;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Register extends Application {

    @Override //start is abstract in Application class
    public void start(Stage stage) throws Exception {
        GridPane gp;
        Scene scene;

        stage.setTitle("CS3318 A03");
        gp = build();
        makePretty(gp);
        scene = new Scene(gp, 800, 500);
        stage.setScene(scene);
        stage.show();
    }

    private GridPane build() {
        ColumnConstraints cC2;
        ColumnConstraints cC;
        GridPane gp;
        Pos center = Pos.CENTER;
        HPos right = HPos.RIGHT;

        gp = new GridPane();
        gp.setAlignment(center);
        gp.setPadding(new Insets(60, 60, 60, 60));

        cC = new ColumnConstraints(150, 150, Double.MAX_VALUE);
        cC.setHalignment(right);

        cC2 = new ColumnConstraints(250,250, Double.MAX_VALUE);
        gp.getColumnConstraints().addAll(cC, cC2);
        return gp;
    }

    private void makePretty(GridPane gp) {
        Label head;
        Label email;
        TextField emailBox;
        HPos center = HPos.CENTER;

        head = new Label("REGISTER.");
        head.setFont(Font.font("Helvetica", FontWeight.EXTRA_BOLD, 24));
        head.setTextFill(Color.web("#93FFe0"));
        head.setStyle("-fx-background-color: black;");

        gp.add(head, 0,0,6,1);
        gp.setMargin(head, new Insets(25, 0,35,0));
        gp.setHalignment(head, center);

        email = new Label("Email  ");
        email.setFont(Font.font("Helvetica", FontPosture.ITALIC,  20));
        email.setTextFill(Color.web("#93FFe0"));
        email.setStyle("-fx-background-color: black;");
        gp.add(email, 0, 1);

        emailBox = new TextField();
        emailBox.setPrefHeight(45);
        emailBox.setPrefWidth(100);
        emailBox.setStyle("-fx-background-color: grey;");
        gp.add(emailBox, 1, 2);

        Label pass;
        PasswordField passBox;
        pass = new Label("Password ");
        pass.setFont(Font.font("Helvetica",  FontPosture.ITALIC,  20));
        pass.setTextFill(Color.web("#93FFe0"));
        pass.setStyle("-fx-background-color: black;");
        gp.add(pass, 0, 3);

        passBox = new PasswordField();
        passBox.setPrefHeight(45);
        passBox.setPrefWidth(100);
        passBox.setStyle("-fx-background-color: grey;");
        gp.add(passBox, 1, 4);

        Button SUBMIT = new Button("SUBMIT");
        SUBMIT.setFont(Font.font("Helvetica", FontPosture.ITALIC, 18));
        SUBMIT.setPrefHeight(40);
        SUBMIT.setPrefWidth(100);
        SUBMIT.setDefaultButton(true);
        gp.add(SUBMIT, 0, 6, 2, 1);
        gp.setHalignment(SUBMIT, center);
        gp.setMargin(SUBMIT, new Insets(25, 0,25,0));

        gp.setStyle("-fx-background-color: #F5987D;");

        SUBMIT.setOnAction(new EventHandler<ActionEvent>() {

            @Override // check all input possibilities here.
            public void handle(ActionEvent event) {
                EmailRegisterValidator emailChecker = new EmailRegisterValidator();
//                PasswordFullValidator passwordFullValidator = new PasswordFullValidator();
                PasswordLengthValidator passwordLengthChecker = new PasswordLengthValidator();
                PasswordDigit passwordDigit = new PasswordDigit();
                PasswordLetter passwordLetter = new PasswordLetter();
                PasswordSpecialChars passwordSpecialChars = new PasswordSpecialChars();


                if(!emailChecker.test(emailBox.getText())) {
                    dropMessage(Alert.AlertType.ERROR, "Registration Rejected", "Invalid Email. \n Please insert a valid Email.");
                    emailBox.setText("");
                    passBox.setText("");
                    return;
                }
//                if(!passwordFullValidator.test(passBox.getText())){
//                    dropMessage(Alert.AlertType.ERROR, "Registration Rejected Password is not strong enough",
//                            "\n Please ensure that your password is \n\n\t •At least 7 characters in length." +
//                                    "\n\n\t •Contains at least one digit.\n\n\t •Contains at least one letter." +
//                                    "\n\n\t •Contains at least one of the following Special character\n\t *^&@!");
//                    emailBox.setText("");
//                    passBox.setText("");
//                    return;
//                }
                if(!passwordLengthChecker.test(passBox.getText())) {
                    dropMessage(Alert.AlertType.ERROR, "Registration Rejected",
                            "Invalid Password Length. " +
                                    "\n Passwords must be at least 7 characters in length.");
                    emailBox.setText("");
                    passBox.setText("");
                    return;
                }
                if(!passwordDigit.test(passBox.getText())){
                    dropMessage(Alert.AlertType.ERROR, "Registration Rejected",
                            "Password is not strong enough" +
                                    "\n A valid password must contain at least 1 digit");
                    emailBox.setText("");
                    passBox.setText("");
                    return;
                }
                if(!passwordLetter.test(passBox.getText())){
                    dropMessage(Alert.AlertType.ERROR, "Registration Rejected",
                            "Password is not strong enough" +
                                    "\n A valid password must contain at least 1 letter");
                    emailBox.setText("");
                    passBox.setText("");
                    return;
                }
                if(!passwordSpecialChars.test(passBox.getText())){
                    dropMessage(Alert.AlertType.ERROR, "Registration Rejected",
                            "Password is not strong enough" +
                                    "\n A valid password must contain one of the following character" +
                                    "\n *^&@!");
                }

                else {
                    dropMessage(Alert.AlertType.CONFIRMATION,"Successful Registration",
                            "Registration Successful! " +
                                    "\n Thank you for registering with us.");
                }
                emailBox.setText("");
                passBox.setText("");
                return;
            }
        });

    }

    private void dropMessage(Alert.AlertType type, String top, String msg) {
        Alert alertWindow = new Alert(type);
        alertWindow.setTitle(top);
        alertWindow.setHeaderText(null);
        alertWindow.setContentText(msg);
        alertWindow.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
//