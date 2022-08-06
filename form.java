import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import java.sql.*;
import java.util.*;

public class form extends Application {
    @Override
    public void start(Stage stage){
        

        stage.setTitle("Registration Form");
        TextField t1 = new TextField("");
        Label l1 = new Label("Enter your username");
        TextField t2 = new TextField("");
        Label l2 = new Label("Enter your email");
        
        PasswordField p1 = new PasswordField();
        Label l3 = new Label("Enter password");

        Button button = new Button("Submit");

        GridPane gridpane = new GridPane();
        gridpane.setHgap(10);
        gridpane.setVgap(20);
        gridpane.add(l1,0,0,1,1);
        gridpane.add(t1,1,0,1,1);
        gridpane.add(l2,0,1,1,1);
        gridpane.add(t2,1,1,1,1);
        gridpane.add(l3,0,2,1,1);
        gridpane.add(p1,1,2,1,1);
        gridpane.add(button,1,3,1,1);

        button.setOnAction((click)->{
            String username1 = t1.getText();
            String password1 = p1.getText();
            String email = t2.getText();
           // System.out.println("Username: "+username);
           // System.out.println("Password: "+password);
           try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/db1";
            String username = "root";
            String password = "123456";
            Connection con = DriverManager.getConnection(url, username, password);
            Statement statement = con.createStatement();
            String query = "Insert into jfx values('" + username1 + "','" + password1 + "','" + email + "');";
            statement.executeUpdate(query);
            



        }
        catch(Exception e){
            e.printStackTrace();

        }
        
        });

        gridpane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(gridpane,800,500);
        stage.setScene(scene);
        stage.show();   
        

    }
    public static void main(String[] args) {
        launch();

    }

}
