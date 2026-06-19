/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package single1;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

/**
 *
 * @author admin
 */
public class single1 {
    private static single1 instance;
    private final Alert alert;
    
    private single1(){
        this.alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("quizzapp");
        alert.setHeaderText("quizzapp");
    }
    
    public static single1 getInstance(){
        if (instance == null) {
            instance = new single1();
                    
        }
        return instance;
    }
    
    public void showMessage(String message) {
        this.alert.setContentText(message);
        this.alert.show();
    }
}
