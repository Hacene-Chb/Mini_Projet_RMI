import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HomeController  {
    static int loged_in = 0;
    @FXML
    private VBox pnl_scroll;

    @FXML
    private JFXTextField user_name_input;

    @FXML
    private JFXPasswordField password_input;

    @FXML
    JFXButton sellButton;

    @FXML
    void Exit(ActionEvent event) {
        ((Node)event.getSource()).getScene().getWindow().hide();

    }
    @FXML
    void Connect(ActionEvent event){
        if(user_name_input.getText().equals("Hacene")&& password_input.getText().equals("12345")) {
            ((Node)event.getSource()).getScene().getWindow().hide();
//            System.out.println(sellButton.getText());
            System.out.println("password : "+ password_input.getText());
            loged_in = 1;
        }
        else{
            user_name_input.setText("inputs incorrect");
            password_input.setText("inputs incorrect");
        }
    }
    @FXML
    private void handleButtonAction(ActionEvent actionEvent) {
        refreshNodes();
    }
    private void refreshNodes()
    {
        pnl_scroll.getChildren().clear();

        Node[] nodes = new  Node[15];

        for(int i = 0; i<5; i++)
        {
            try {
                nodes[i] = (Node)FXMLLoader.load(getClass().getResource("item.fxml"));
                pnl_scroll.getChildren().add(nodes[i]);

            } catch (IOException ex) {
                Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
    public void login(ActionEvent actionEvent){
        try {
            //((Node)actionEvent.getSource()).getScene().getWindow().hide();
            Stage primaryStage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader();
            Pane root = null;
            root = fxmlLoader.load(getClass().getResource("Login.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
            /*pnl_scroll.getChildren().clear();
            Node node = (Node)FXMLLoader.load(getClass().getResource("Login.fxml"));
            pnl_scroll.getChildren().add(node);*/
        } catch (IOException e) {
            e.printStackTrace();
        }
    }public void signUp(ActionEvent actionEvent){
        try {
            //((Node)actionEvent.getSource()).getScene().getWindow().hide();
            Stage primaryStage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader();
            Pane root = null;
            root = fxmlLoader.load(getClass().getResource("SignUp.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public void exit(ActionEvent actionEvent){
        System.exit(1);
    }
    public void sellProduct(ActionEvent actionEvent){
        if(loged_in==1){
            try {
                //((Node)actionEvent.getSource()).getScene().getWindow().hide();
                Stage primaryStage = new Stage();
                FXMLLoader fxmlLoader = new FXMLLoader();
                Pane root = null;
                root = fxmlLoader.load(getClass().getResource("Add_Item.fxml"));
                Scene scene = new Scene(root);
                primaryStage.setScene(scene);
                primaryStage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else
        {
            try {
                Stage primaryStage = new Stage();
                Pane root = FXMLLoader.load(getClass().getResource("Error_Notif.fxml"));
                Scene scene = new Scene(root);
                primaryStage.setScene(scene);
                primaryStage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void showPassword(ActionEvent actionEvent){
        System.out.println("hacen nashkopi");
    }


}
