package ap_project_;

import static com.mchange.v2.c3p0.impl.C3P0Defaults.user;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 *
 * @author Jonab
 */
public class ControllerSingUp  implements Initializable {
    
     @FXML
    private TextField signGName = new TextField();
    @FXML
    private TextField signAge = new TextField();
    @FXML
    private TextField signPassword = new TextField();
    @FXML
    private TextField signPConfirm = new TextField();
    @FXML
    private Label signUpLabel = new Label();
    @FXML
    private Button singUpSingUpPageBtm;
    @FXML
    private Button BackBtm_singUpPage;
        /**
     * Initializes the controller class.
     */
    //   @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
       @FXML
    private void singUpSingUpPage(ActionEvent event) throws IOException {
        if (signGName.getText().isEmpty() || signAge.getText().isEmpty() || signPassword.getText().isEmpty() || signPConfirm.getText().isEmpty()) {
            signUpLabel.setText("All fields are required");
        } else if (!(signPassword.getText().equals(signPConfirm.getText()))) {
            signUpLabel.setText("passwore should match confirt password ");
        } else {
            System.out.println("yes");
            Player p = new Player();
            p.setPname(signGName.getText());
            p.setPage(Integer.parseInt(signAge.getText()));
            p.setPassword(signPassword.getText());
            p.setPscore(0);
            p.setPlevel(1);
            Session s1 = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = s1.beginTransaction();
            s1.save(p);
            tr.commit();
            s1.close();

            Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLhomePage.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }

    @FXML
    private void BackBtm_singUpPage(ActionEvent event) throws IOException {
     Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLhomePage.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();    
    }
    
}