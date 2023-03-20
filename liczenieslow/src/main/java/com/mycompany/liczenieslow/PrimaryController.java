package com.mycompany.liczenieslow;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class PrimaryController {
    @FXML
    Label label;
    
    @FXML
    TextArea textarea;
    
    @FXML
    private void calculate() throws IOException {
        String text1 = " "+textarea.getText();
        int liczba=0;
        
        for(int i=1;i<text1.length();i++)
        {
            if(text1.charAt(i-1)==' ' && text1.charAt(i)!=' ')
            liczba++;
        }
        label.setText("Liczba znaków:"+ textarea.getText().length() + " liczba wyrazów:"+liczba);
    }
}
