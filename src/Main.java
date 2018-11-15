import com.jfoenix.controls.JFXButton;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static boolean login = false;
    @FXML
    static JFXButton sellButton;

    @Override
    public void start(Stage primaryStage){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
            Scene scene = new Scene(root);
            //scene.getStylesheets().add(getClass().getResource("Main/login_signUp.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.setTitle("Home Page");
            primaryStage.setResizable(false);
            //primaryStage.getIcons().add(new Image(this.getClass().getResource("C:\\JavaProjects\\MiniProjet_RMI\\src\\Main\\cabinet2.png").toString()));
            primaryStage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
