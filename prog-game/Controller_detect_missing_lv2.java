/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 *
 * @author 96653
 */
public class Controller_detect_missing_lv2 implements Initializable {
    
   //fxml 2
   int score = 0;
    @FXML
    private Label S21;
    @FXML
    private Button B2;
    @FXML
    private Button B3;
    @FXML
    private Button B4;
    @FXML
    private Button B5;
    @FXML
    private Button B6;
    @FXML
    private Button B1;
    @FXML
    private Rectangle L21;
    @FXML
    private Rectangle L22;
    @FXML
    private Rectangle L23;
    @FXML
    private Rectangle L24;
    @FXML
    private Rectangle L25;
    @FXML
    private Button ch1;
    @FXML
    private Label score_label_level_page;
    @FXML
    private Label level_label_level_page;
    
     Player player;
    
    @Override
      public void initialize(URL url, ResourceBundle rb) {
         player = ControllerLogIn_.currentPlayer;
         score_label_level_page.setText(player.getPscore().toString()); 
         level_label_level_page.setText(player.getPlevel().toString());
        
    }
    

    //fxml 2
    @FXML
    public void L1D2(MouseEvent event) {
        B1.setLayoutX(B1.getLayoutX() + event.getX());
        B1.setLayoutY(B1.getLayoutY() + event.getY());

    }

    @FXML
    public void L2D2(MouseEvent event) {
        B2.setLayoutX(B2.getLayoutX() + event.getX());
        B2.setLayoutY(B2.getLayoutY() + event.getY());

    }

    @FXML
    public void L3D2(MouseEvent event) {
        B3.setLayoutX(B3.getLayoutX() + event.getX());
        B3.setLayoutY(B3.getLayoutY() + event.getY());

    }

    @FXML
    public void L4D2(MouseEvent event) {
        B4.setLayoutX(B4.getLayoutX() + event.getX());
        B4.setLayoutY(B4.getLayoutY() + event.getY());

    }

    @FXML
    public void L5D2(MouseEvent event) {
        B5.setLayoutX(B5.getLayoutX() + event.getX());
        B5.setLayoutY(B5.getLayoutY() + event.getY());

    }

    @FXML
    public void L6D2(MouseEvent event) {
        B6.setLayoutX(B6.getLayoutX() + event.getX());
        B6.setLayoutY(B6.getLayoutY() + event.getY());

    }

    @FXML
    public void p2(ActionEvent e) {
        score = 0;
        double b = L22.getLayoutX() - 10;
        double f = L22.getLayoutX() + 10;
        if (B1.getLayoutX() < f && B1.getLayoutX() > b) {
            score+=2;
            S21.setText("" + score);
        }
        double f1 = L21.getLayoutX() + 10;
        double b1 = L21.getLayoutX() - 10;
        if (B2.getLayoutX() < f1 && B2.getLayoutX() > b1) {
            score+=2;
            S21.setText("" + score);
        }

        double f2 = L24.getLayoutX() + 10;
        double b2 = L24.getLayoutX() - 10;
        if (B3.getLayoutX() < f2 && B3.getLayoutX() > b2) {

            score+=2;
            S21.setText("" + score);
        }

        double f3 = L23.getLayoutX() + 10;
        double b3 = L23.getLayoutX() - 10;
        if (B5.getLayoutX() < f3 && B5.getLayoutX() > b3) {

           score+=2;
            S21.setText("" + score);
        }
        double f4 = L25.getLayoutX() + 10;
        double b4 = L25.getLayoutX() - 10;
        if (B6.getLayoutX() < f4 && B6.getLayoutX() > b4) {

            score+=2;
            S21.setText("" + score);
        }
    }
        @FXML
       private void lvl2DetecMissingBackBtn(ActionEvent event) throws IOException {
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLPlayPage.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void lvl2DetecMissingFinishBtn(ActionEvent event) throws IOException {
        
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
