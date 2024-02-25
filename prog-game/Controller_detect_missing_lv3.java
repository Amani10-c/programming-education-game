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
public class Controller_detect_missing_lv3 implements Initializable {
//    // fxml 3
    int score = 0;
    @FXML
    private Label S31;
    @FXML
    private Button B22;
    @FXML
    private Button B23;
    @FXML
    private Button B24;
    @FXML
    private Button B25;
    @FXML
    private Button B26;
    @FXML
    private Button B21;
    @FXML
    private Rectangle L31;
    @FXML
    private Rectangle L32;
    @FXML
    private Rectangle L33;
    @FXML
    private Rectangle L34;
    @FXML
    private Rectangle L35;
    @FXML
    private Button ch;
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
    

    //fxml 3
    @FXML
    public void L1D3(MouseEvent event) {
        B21.setLayoutX(B21.getLayoutX() + event.getX());
        B21.setLayoutY(B21.getLayoutY() + event.getY());

    }

    @FXML
    public void L2D3(MouseEvent event) {
        B22.setLayoutX(B22.getLayoutX() + event.getX());
        B22.setLayoutY(B22.getLayoutY() + event.getY());

    }

    @FXML
    public void L3D3(MouseEvent event) {
        B23.setLayoutX(B23.getLayoutX() + event.getX());
        B23.setLayoutY(B23.getLayoutY() + event.getY());

    }

    @FXML
    public void L4D3(MouseEvent event) {
        B24.setLayoutX(B24.getLayoutX() + event.getX());
        B24.setLayoutY(B24.getLayoutY() + event.getY());

    }

    @FXML
    public void L5D3(MouseEvent event) {
        B25.setLayoutX(B25.getLayoutX() + event.getX());
        B25.setLayoutY(B25.getLayoutY() + event.getY());

    }

    @FXML
    public void L6D3(MouseEvent event) {
        B26.setLayoutX(B26.getLayoutX() + event.getX());
        B26.setLayoutY(B26.getLayoutY() + event.getY());

    }

    @FXML
    public void p3(ActionEvent e) {
       // for(int i =1;i<=5;i++){
          score = 0;
        double b = L31.getLayoutX() - 10;
        double f = L31.getLayoutX() + 10;
        if (B21.getLayoutX() < f && B21.getLayoutX() > b) {
            score +=2;
            S31.setText("" + score);
        }
        double f1 = L34.getLayoutX() + 10;
        double b1 = L34.getLayoutX() - 10;
        if (B23.getLayoutX() < f1 && B23.getLayoutX() > b1) {
            score +=2;
            S31.setText("" + score);
        }

        double f2 = L32.getLayoutX() + 10;
        double b2 = L32.getLayoutX() - 10;
        if (B22.getLayoutX() < f2 && B22.getLayoutX() > b2) {

             score +=2;
            S31.setText("" + score);
        }

        double f3 = L33.getLayoutX() + 10;
        double b3 = L33.getLayoutX() - 10;
        if (B25.getLayoutX() < f3 && B25.getLayoutX() > b3) {

             score +=2;
            S31.setText("" + score);
        }
        double f4 = L35.getLayoutX() + 10;
        double b4 = L35.getLayoutX() - 10;
        if (B26.getLayoutX() < f4 && B26.getLayoutX() > b4) {

             score +=2;
            S31.setText("" + score);
        }
        }
    
            @FXML
       private void lvl3DetecMissingBackBtn(ActionEvent event) throws IOException {
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLPlayPage.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void lvl3DetecMissingFinishBtn(ActionEvent event) throws IOException {
        
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


    

