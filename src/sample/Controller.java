package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    String adrss;

    @FXML
    TextField txt1;
    @FXML
    Button but_go;
    @FXML
    private void but_go_Act(ActionEvent actionEvent){
    adrss=txt1.getText();
    System.out.println(adrss);
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
