/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap_project_;

import ap_project_.ControllerLogIn_;
import ap_project_.Player;
import java.io.File;
import java.io.IOException;
import java.net.URL;
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
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * FXML Controller class
 *
 * @author Jonab
 */
public class ControllerstudyPage3 implements Initializable {

    
    @FXML
    private MediaView Slvl3;

    
      @FXML
    private Button Plvl3;

    @FXML
    private Button stoplvl3;
    
   @FXML
   private Label score_label_study_page3;
   @FXML    
  private Label  level_label_study_page3;
    private File f3;
    private Media m3;
    private MediaPlayer r3;
    
     Player player;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        player = ControllerLogIn_.currentPlayer;

     score_label_study_page3.setText(player.getPscore().toString());
       level_label_study_page3.setText(player.getPlevel().toString());
    // level_label_review_page3.setText(player.getPlevel().toString());
        
         f3 =new File( "C:\\Users\\Jonab\\Desktop\\vidThree.mp4");
        m3 = new Media(f3.toURI().toString());
        r3 = new MediaPlayer(m3);
        Slvl3.setMediaPlayer(r3); 
       
    }
    
        @FXML
    private void lvl3studyPlay(ActionEvent event) {
        r3.play();
    }

    @FXML
    private void lvl3studyPush(ActionEvent event) {
       r3.pause();
    }

    @FXML
    private void lvl3studyReview(ActionEvent event) throws IOException {
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLreview.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void lvl3studyBack(ActionEvent event) throws IOException {
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLstudy_play.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    
    
}
