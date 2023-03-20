package com.mycompany.kalkulator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


/**
 * JavaFX App
 */
public class App extends Application implements EventHandler<ActionEvent> {

    String current="";
    String num1="";
    String num2="";
    int numi1=0;
    int numi2=0;
    int typop=1;
    
    @FXML
    private Button n0;
    
    @FXML
    private Button n1;
    
    @FXML
    private Button n2;
    
    @FXML
    private Button n3;
    
    @FXML
    private Button n4;
    
    @FXML
    private Button n5;
    
    @FXML
    private Button n6;
    
    @FXML
    private Button n7;
    
    @FXML
    private Button n8;
    
    @FXML
    private Button n9;
    
    @FXML
    private Button add;
    
    @FXML
    private Button sub;
    
    @FXML
    private Button mul;
    
    @FXML
    private Button div;
    
    @FXML
    private Button clear;
    
    @FXML
    private Button equal;
    
    @FXML
    private Label result;
    
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("calculator"), 223, 286);
        stage.setScene(scene);
        stage.setTitle("Kalkulator");
        stage.setResizable(false);
        stage.show();
        
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void handle(ActionEvent t) {
        
        if(t.getSource()==n0)
        {
            current+='0';
            result.setText(" "+current);
        }
        else if(t.getSource()==n1)
        {
            current+='1';
            result.setText(" "+current);
        }
        else if(t.getSource()==n2)
        {
            current+='2';
            result.setText(" "+current);
        }
        else if(t.getSource()==n3)
        {
            current+='3';
            result.setText(" "+current);
        }
        else if(t.getSource()==n4)
        {
            current+='4';
            result.setText(" "+current);
        }
        else if(t.getSource()==n5)
        {
            current+='5';
            result.setText(" "+current);
        }
        else if(t.getSource()==n6)
        {
            current+='6';
            result.setText(" "+current);
        }
        else if(t.getSource()==n7)
        {
            current+='7';
            result.setText(" "+current);
        }
        else if(t.getSource()==n8)
        {
            current+='8';
            result.setText(" "+current);
        }
        else if(t.getSource()==n9)
        {
            current+='9';
            result.setText(" "+current);
        }
        
 
        
        else if(t.getSource()==add)
        {
            if(num1.isEmpty())
            {
                num1=current;
                
                current="";
                
            }
            
            typop=1;
                
        }
        
        else if(t.getSource()==sub)
        {
           if(num1.isEmpty())
            {
                num1=current;
                
                current="";
                
            }
            
            typop=2;
        }
        
         else if(t.getSource()==mul)
        {
            if(num1.isEmpty())
            {
                num1=current;
                
                current="";
                
            }
            
            typop=3;
        }
        
         else if(t.getSource()==div)
        {
            if(num1.isEmpty())
            {
                num1=current;
                
                current="";
                
            }
            
            typop=4;
        }
        else if(t.getSource()==clear)
        {
          num1="";
          num2="";
        }
        
        else if(t.getSource()==equal&&!num1.isBlank()&&!current.isBlank())
        {
            try
            {
            num2=current;
            numi1=Integer.parseInt(num1);
            numi2=Integer.parseInt(num2);
                System.out.println("num2 = "+numi2);
            
            switch (typop)
            {
                
                case 1:
                numi1+=numi2;
                break;
                case 2:
                numi1-=numi2;
                break;
                case 3:
                numi1*=numi2;
                break;
                case 4:
                numi1/=numi2;
                break;            
            }
            current=numi1+"";
            result.setText(" "+current);
            num1=current;
            num2="";
            current="";
            }catch(Exception e) {
        result.setText(" error");
        }
       
}
        
        System.out.println(num1+" n1 "+ num2+" n2 " +current);
        
    }

    
}