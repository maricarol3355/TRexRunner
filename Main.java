package t.rex.runner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
//import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
//import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class Main extends Application{
    @Override
    public void start(Stage stage){
        VBox pane = new VBox();
        
        Text text = new Text("Hello World!");
        text.setFont(Font.font("Sans serif", FontWeight.NORMAL, FontPosture.REGULAR, 33));
        text.setFill(Color.RED);
        
        pane.getChildren().add(text);
        
        Button button = new Button("Click me!");
        button.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e){
                //can use "e."
                System.out.println("Good job.");
            }
        });
        
        pane.getChildren().add(button);
        
        CheckBox checkBox = new CheckBox("Yes?");
        checkBox.isSelected();
        
        pane.getChildren().add(checkBox);
        
        TextField field = new TextField();
        //PasswordField field = new PasswordField(); //this writes in dots
        field.setOnKeyPressed(new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent e){
                //can use e.getCode()
                if( e.getCode() == KeyCode.ENTER){
                    System.out.println(field.getText());
                }
            }
        });
        
        pane.getChildren().add(field);
        
        ImageView image = new ImageView(new Image(getClass().getResourceAsStream("/res/trex.png"), 100, 100, true, true));
        pane.getChildren().add(image);
        
        stage.setScene(new Scene(pane, 640, 480));
        stage.setTitle("T-Rex Runner");
        
        stage.setResizable(false);
        stage.show();
        
        
    }//end start method???
    public static void main(String[] args){
        launch(args);
    }
}
