import javafx.application.Application;
import javafx.scene.control.*;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.layout.VBox;

public class labelDemo extends Application {
    VBox vbox = new VBox();    

    public void start(Stage stage){
        String commonStyles = "-fx-background-color: white;" +

        "-fx-font-family: 'Times New Roman';" +
        
        "-fx-font-size: 20px;" +
        
        "-fx-font-weight: bold;" +
        
        "-fx-border-style: solid;" +
        
        "-fx-border-color: yellow;";

      vbox.getChildren().addAll(  
        new Label("Kushagra Palod"){{
        setStyle(commonStyles + "-fx-text-fill: black;");
      }},
     
         new Label("20BCE0698"){{
        setStyle(commonStyles + "-fx-text-fill: blue;");
      }},
   

         new Label("Room no. 401 Netaji subhash chandra block hostel, VIT Vellore"){{
        setStyle(commonStyles + "-fx-text-fill: cyan;");
      }},    
         
        new Label("9752740856"){{
        setStyle(commonStyles + "-fx-text-fill: green;");
      }}
      );
       
       

      Scene scene = new Scene(vbox, 780, 640);
      stage.setTitle("Theory DA ");
      stage.setScene(scene);
      stage.show();
    }    

 public static void main(String[] args) {
     launch();
 }   
}
