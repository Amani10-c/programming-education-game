
package ap_project_;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 * FXML Controller class
 *
 * @author Jonab
 */
public class Controller_detect_missing_lv1 implements Initializable {


    
    int score = 0;

   @FXML
    private Label S1;

    @FXML
    private Button L2;

    @FXML
    private Button L3;

    @FXML
    private Button L4;

    @FXML
    private Button L5;

    @FXML
    private Button L6;

    @FXML
    private Button L1;

    @FXML
    private Rectangle L8;

    @FXML
    private Rectangle L9;

    @FXML
    private Rectangle L7;

    @FXML
    private Button ch2;

        
    Player player;

    @FXML
    private Label score_label_level_page;
    @FXML
    private Label level_label_level_page;

     @Override
    public void initialize(URL url, ResourceBundle rb) {
         player = ControllerLogIn_.currentPlayer;
        score_label_level_page.setText(player.getPscore().toString()); 
        level_label_level_page.setText(player.getPlevel().toString());
        // TODO
    }  

    //fxml 1
    @FXML
    public void L1D(MouseEvent event) {
        L1.setLayoutX(L1.getLayoutX() + event.getX());
        L1.setLayoutY(L1.getLayoutY() + event.getY());

    }

    @FXML
    public void L2D(MouseEvent event) {
        L2.setLayoutX(L2.getLayoutX() + event.getX());
        L2.setLayoutY(L2.getLayoutY() + event.getY());

    }

    @FXML
    public void L3D(MouseEvent event) {
        L3.setLayoutX(L3.getLayoutX() + event.getX());
        L3.setLayoutY(L3.getLayoutY() + event.getY());

    }

    @FXML
    public void L4D(MouseEvent event) {
        L4.setLayoutX(L4.getLayoutX() + event.getX());
        L4.setLayoutY(L4.getLayoutY() + event.getY());

    }

    @FXML
    public void L5D(MouseEvent event) {
        L5.setLayoutX(L5.getLayoutX() + event.getX());
        L5.setLayoutY(L5.getLayoutY() + event.getY());

    }

    @FXML
    public void L6D(MouseEvent event) {
        L6.setLayoutX(L6.getLayoutX() + event.getX());
        L6.setLayoutY(L6.getLayoutY() + event.getY());

    }

    public void L1R(MouseEvent event) {
        double b = L7.getLayoutX() - 10;
        double f = L7.getLayoutX() + 10;
        if (L1.getLayoutX() < f && L1.getLayoutX() > b) {

            score++;
            S1.setText("" + score);
        }

    }

    public void L2R(MouseEvent event) {
        double b = L8.getLayoutX() - 10;
        double f = L8.getLayoutX() + 10;
        if (L2.getLayoutX() < f && L2.getLayoutX() > b) {

            score++;
            S1.setText("" + score);
        }
    }

    public void L3R(MouseEvent event) {
        double f = L9.getLayoutX() + 10;
        double b = L9.getLayoutX() - 10;
        if (L3.getLayoutX() < f && L3.getLayoutX() > b) {

            score++;
            S1.setText("" + score);
        }

    }

    @FXML
    public void p(ActionEvent e) {
        score = 0;
        double b = L7.getLayoutX() - 10;
        double f = L7.getLayoutX() + 10;
        if (L1.getLayoutX() < f && L1.getLayoutX() > b) {
            score+=3;
            S1.setText("" + score);
        }
        double f1 = L8.getLayoutX() + 10;
        double b1 = L8.getLayoutX() - 10;
        if (L2.getLayoutX() < f1 && L2.getLayoutX() > b1) {
            score+=4;
            S1.setText("" + score);
        }

        double f2 = L9.getLayoutX() + 10;
        double b2 = L9.getLayoutX() - 10;
        if (L3.getLayoutX() < f2 && L3.getLayoutX() > b2) {

            score+=3;
            S1.setText("" + score);
            
        }
    }
        
        @FXML
       private void lvl1DetecMissingBackBtn(ActionEvent event) throws IOException {
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLPlayPage.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void lvl1DetecMissingFinishBtn(ActionEvent event) throws IOException {
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        //Player p = ControllerLogIn_.currentPlayer;
        int currentScore = player.getPscore();
        player.setPscore(currentScore+score);
        session.update(player);
        tx.commit(); 
        session.close();
        
         Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLPlayPage.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
}