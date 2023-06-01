package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class AppointmentsController implements Initializable {
    public Button addButton;
    public Button modifyButton;
    public Button deleteButton;
    public Button backButton;
    public RadioButton allToggle;
    public ToggleGroup appointmentsToggle;
    public RadioButton monthToggle;
    public RadioButton weekToggle;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void addButtonClicked(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../views/addAppointments.fxml")));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 850, 400);
        stage.setScene(scene);
        stage.show();
    }

    public void modifyButtonCLicked(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../views/modifyAppointments.fxml")));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 850, 400);
        stage.setScene(scene);
        stage.show();
    }

    public void deleteButtonClicked(ActionEvent actionEvent) {
    }

    public void backButtonClicked(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../views/mainWindow.fxml")));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 400, 450);
        stage.setScene(scene);
        stage.show();
    }

    public void allToggleSelected(ActionEvent actionEvent) {
    }

    public void monthToggleSelected(ActionEvent actionEvent) {
    }

    public void weekToggleSelected(ActionEvent actionEvent) {
    }
}
