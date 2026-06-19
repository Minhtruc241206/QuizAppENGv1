package com.nmt.quizappengv1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;


public class PrimaryController implements Initializable{
    @FXML private ComboBox<Option.option> cmThemes;
    
    public void manageQuestion(ActionEvent e){
        single1.single1.getInstance().showMessage("comming soon");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cmThemes.setItems(FXCollections.observableArrayList(Option.option.values()));
    }
    
    public void Changetheme(ActionEvent e){
        switch (this.cmThemes.getSelectionModel().getSelectedItem()) {
            case DARK:
                
                this.cmThemes.getScene().getRoot().getStylesheets().clear();
                this.cmThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("style2.css").toExternalForm());
                break;
            case LIGHT:
                this.cmThemes.getScene().getRoot().getStylesheets().clear();
                this.cmThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("style3.css").toExternalForm());
            default:
                throw new AssertionError();
        }
    }
}
