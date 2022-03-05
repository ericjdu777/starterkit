package au.edu.unsw.infs2605.starterkit;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    @FXML
    Button addButton;
    @FXML
    Button minusButton;
    @FXML
    Button multiplyButton;
    @FXML
    Button divideButton;
    @FXML
    TextField n1;
    @FXML
    TextField n2;
    @FXML
    Text result;
    
    String number1 = null;
    String number2 = null;
    
    @FXML
    public void initialize(){
        result.setVisible(false);
    }
    
    @FXML
    private void add(){
        number1 = n1.getText();
        number2 = n2.getText();
        
        
        double n1a= Double.parseDouble(number1);
        double n2a= Double.parseDouble(number2);
        double result1 = n1a + n2a;
        String fRes = Double.toString(result1);
        result.setVisible(true);
        result.setText(fRes);
    }
    @FXML
    private void minus(){
        number1 = n1.getText();
        number2 = n2.getText();
        
        
        double n1a= Double.parseDouble(number1);
        double n2a= Double.parseDouble(number2);
        double result1 = n1a - n2a;
        String fRes = Double.toString(result1);
        result.setVisible(true);
        result.setText(fRes);
    }
     @FXML
    private void multiply(){
        number1 = n1.getText();
        number2 = n2.getText();
        
        
        double n1a= Double.parseDouble(number1);
        double n2a= Double.parseDouble(number2);
        double result1 = n1a * n2a;
        String fRes = Double.toString(result1);
        result.setVisible(true);
        result.setText(fRes);
    }
    @FXML
    private void divide(){
        number1 = n1.getText();
        number2 = n2.getText();
        
        
        double n1a= Double.parseDouble(number1);
        double n2a= Double.parseDouble(number2);
        double result1 = n1a / n2a;
        String fRes = Double.toString(result1);
        result.setVisible(true);
        result.setText(fRes);
    }
 
    
}