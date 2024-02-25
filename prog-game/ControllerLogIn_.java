

package ap_project_;

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

public class ControllerLogIn_ implements Initializable {
    public static Player currentPlayer ;
    @FXML
    private PasswordField ppassword ;
    @FXML
    private TextField pname;
    @FXML
    private Button logInLogInPageBtm;
    @FXML
    private Label label;
    @FXML
    private Button BackBtm_LogInPage;

       /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
     @FXML
    private void logInLogInPage_(ActionEvent event) throws IOException {

        String name = pname.getText();
        System.out.println(name);
         System.out.println(pname.getText());
        
         Session sessionread = HibernateUtil.getSessionFactory().openSession();
        List<Player> play = null;
        org.hibernate.Query query = sessionread.createQuery("from Player");
        play = query.list();
        sessionread.close();

        boolean found = false;
        //Player temp = null;
        
        for (Player p : play) {
            String nameFromDatabase = p.getPname();
                 System.out.println(p);
                System.out.println(name + "----" +nameFromDatabase );
            if (nameFromDatabase.equals(name) && p.getPassword().equals(ppassword.getText())) {
                System.out.println(name + "----" +nameFromDatabase );
                System.out.println(ppassword.getText());
                found = true;
                currentPlayer = p;
                System.out.println("currentPlayer"+currentPlayer );

                Session session = HibernateUtil.getSessionFactory().openSession();
                Transaction tx = session.beginTransaction();
                session.update(currentPlayer);
                tx.commit();
                session.close();
                
                System.out.println(p.getPname() + " found");
                System.out.println(p.getPassword());
                

            }
        }
        if (!found) {
            label.setText(" wrong name or password ");
        } else if (pname.getText().isEmpty() || ppassword.getText().isEmpty()) {
            label.setText(" Enter player name and password ");
        }  else {

            FXMLLoader loader = new FXMLLoader();
           loader.setLocation(getClass().getResource("FXMLlevelPage.fxml"));
            Parent root = loader.load();
            
            // ControllerLevelPage controller = loader.getController();
            // controller.setPlayerData(temp);
            Scene scene = new Scene(root);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(scene);
            window.show();
       }  
    }

      @FXML
    private void BackBtm_LogInPage(ActionEvent event) throws IOException {
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLhomePage.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}

            