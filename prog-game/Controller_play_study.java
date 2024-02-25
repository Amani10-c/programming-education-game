/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap_project_;

import static ap_project_.ControllerLevelPage.levelBtn;
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
import javafx.stage.Stage;

/**
 *
 * @author Jonab
 */
public class Controller_play_study implements Initializable {
     @FXML
    private Button playBtm;
    @FXML
    private Label score_label_level_page;
    @FXML
    private Label level_label_level_page;
        /**
     * Initializes the controller class.
     */
    //   @Override
     
       Player player;
    
   
    @Override
      public void initialize(URL url, ResourceBundle rb) {
         player = ControllerLogIn_.currentPlayer;
         score_label_level_page.setText(player.getPscore().toString()); 
         level_label_level_page.setText(player.getPlevel().toString());
        
    }
    
     @FXML
    private void playAction1(ActionEvent event) throws IOException {
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLPlayPage.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();  
    }
         @FXML
    private void studyAction(ActionEvent event) throws IOException {
          //   if (null!=player.getPlevel()) 
            switch (levelBtn) {
             case 1:{
                 Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLstudyPage1.fxml"));
                 Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                 Scene scene = new Scene(root);
                 stage.setScene(scene);
                 stage.show();
                     break;
                 }
             case 2:{
                 Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLstudyPage2.fxml"));
                 Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                 Scene scene = new Scene(root);
                 stage.setScene(scene);
                 stage.show();
                     break;
                 }
             case 3:{
                 Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLstudyPage3.fxml"));
                 Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                 Scene scene = new Scene(root);
                 stage.setScene(scene);
                 stage.show();
                     break;
                 }
             default:
                 break;
         }
      
    }
    

    @FXML
    private void lvl1BackLevelPage(ActionEvent event) throws IOException {
          Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLlevelPage.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
}
