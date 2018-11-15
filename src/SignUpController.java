import com.jfoenix.controls.JFXButton;
        import com.jfoenix.controls.JFXPasswordField;
        import com.jfoenix.controls.JFXTextField;
        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.scene.Node;
        import javafx.scene.control.Label;
        import javafx.scene.layout.AnchorPane;

public class SignUpController {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Label creercompte;

    @FXML
    private JFXTextField prenom;

    @FXML
    private JFXTextField nom;

    @FXML
    private JFXTextField email;

    @FXML
    private JFXPasswordField password;

    @FXML
    private JFXButton annulerButton;

    @FXML
    private JFXButton okButton;

    public void okButton (ActionEvent actionEvent){
        ((Node)actionEvent.getSource()).getScene().getWindow().hide();
    }
    public void anuulerButton(ActionEvent actionEvent){
        ((Node)actionEvent.getSource()).getScene().getWindow().hide();
    }

}
