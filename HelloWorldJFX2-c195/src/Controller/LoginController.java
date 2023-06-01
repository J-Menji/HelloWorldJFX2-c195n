package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class LoginController implements Initializable {


    public TextField usernameTextField;
    public PasswordField passwordField;
    public Button loginButton;
    public Button exitButton;
    public Label textFieldLocation;
    public Label zoneIdLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void usernameAction(ActionEvent actionEvent) {
    }

    public void passwordAction(ActionEvent actionEvent) {
    }

    public void loginClicked(ActionEvent actionEvent) throws Exception {

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../views/mainWindow.fxml")));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 400, 450);
        stage.setScene(scene);
        stage.show();



    }

    public void exitClicked(ActionEvent actionEvent) {
    }
}
