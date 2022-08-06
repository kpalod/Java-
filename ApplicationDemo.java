import javafx.application.Application;
import javafx.scene.control.*;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;

public class ApplicationDemo extends Application {
    private Label label;
    private TextField textfield;
    private String str;

    public void start (Stage stage) {
        str = System.getProperty("javafx.version");
        System.out.println(str);
        label = new Label(str);
        textfield = new TextField();
        textfield.setPrefHeight(50);
        textfield.setFont(Font.font(50));
        label.setFont(Font.font(50));
        Scene scene = new Scene(new StackPane(textfield),400,400);
        stage.setTitle("JavaFX Version");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}