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
 * @author 96653
 */
public class ControllerPlayPage  implements Initializable {

    @FXML
    private Button Back_btm_PlayPage;
   
   
    Player player;
    @FXML
    private Label score_label_play_page;
    @FXML
    private Label level_label_play_page;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         player = ControllerLogIn_.currentPlayer;
         score_label_play_page.setText(player.getPscore().toString()); 
         level_label_play_page.setText(player.getPlevel().toString());
       
    }
    @FXML
    private void lvl1WordSearchPlayPage1(ActionEvent event) throws IOException {
        if(levelBtn==1){
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLword_search_lvl1.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        }else if (levelBtn==2){
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLword_search_lvl2.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        }else if (levelBtn==3){
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLword_search_lvl3.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        }

    }

    @FXML
    private void lvl1DetectMissingPlayPage1(ActionEvent event) throws IOException {
        if(levelBtn==1){
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLdetect_missing_lvl1.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        }else if (levelBtn==2){
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLdetect_missing_lvl2.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        }else if (levelBtn==3){
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLdetect_missing_lvl3.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        }

    }

    @FXML
    private void lvl1ConnectTagPlayPage1(ActionEvent event) throws IOException {
       if(levelBtn==1){
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLconnect_tag_lvl1.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        }else if (levelBtn==2){
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLconnect_tag_lvl2.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        }else if (levelBtn==3){
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLconnect_tag_lvl3.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        }

    }

    @FXML
    private void lvl1BackPlayPage1(ActionEvent event) throws IOException {
         Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLstudy_play.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
}