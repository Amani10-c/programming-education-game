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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonab
 */
public class ControllerLevelPage  implements Initializable   {

    @FXML
    private Button levelOneLevelPagebtm;
    @FXML
    private Button levelTwoLevelPagebtm;
    @FXML
    private Button levelThreeLevelPagebtm;
    @FXML
    private Label score_label_level_page;
    @FXML
    private Label level_label_level_page;
    
    Player player;
    @FXML
    private Label wrongMessage_Lable;
    @FXML
    private Button BackBtm_LevelPage;
    
    static int levelBtn; 
    
   
    @Override
      public void initialize(URL url, ResourceBundle rb) {
         player = ControllerLogIn_.currentPlayer;
          score_label_level_page.setText(player.getPscore().toString()); 
          level_label_level_page.setText(player.getPlevel().toString());
        
    }

    @FXML
    private void levelOneLevelPage(ActionEvent event) throws IOException {
        
       /* Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        int currentScore = player.getPscore();
        player.setPlevel(1);
        session.update(player);
        tx.commit(); 
        session.close();*/
       
        levelBtn = 1;
       FXMLLoader loader = new FXMLLoader();
       loader.setLocation(getClass().getResource("FXMLstudy_play.fxml"));
       Parent root = loader.load();
       Scene scene = new Scene(root);
       Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
       window.setScene(scene);
       window.show();
           
    }

    @FXML
    private void levelTwoLevelPage(ActionEvent event) throws IOException {
        
        /*Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        int currentScore = player.getPscore();
        player.setPlevel(2);
        session.update(player);
        tx.commit(); 
        session.close();*/
        
        levelBtn = 2;
        int score = Integer.parseInt(score_label_level_page.getText());
        if(score>=30){
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLstudy_play.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();  
        }
        else
        {
           wrongMessage_Lable.setText("Your score can't open this level for you..");
        }
        
        
    }

    @FXML
    private void levelThreeLevelPage(ActionEvent event) throws IOException {
        
       /* Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        int currentScore = player.getPscore();
        player.setPlevel(3);
        session.update(player);
        tx.commit(); 
        session.close();
        */
       levelBtn = 3;
        int score = Integer.parseInt(score_label_level_page.getText());
        if(score>=60){
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLstudy_play.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();  
        }  else
        {
            wrongMessage_Lable.setText("Your score can't open this level for you..");
        }
        
    }

    @FXML
    private void lvl1BackLevelPage(ActionEvent event) throws IOException {
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLlogInPage.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
        @FXML
    private void WineBtn(ActionEvent event) throws IOException {
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLWine.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    
    
       
    
}
