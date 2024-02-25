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
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;
import static sun.audio.AudioPlayer.player;

/**
 * FXML Controller class
 *
 * @author Jonab
 */
public class Controller_word_search_lv1 implements Initializable {
    
    
    Player player;
    @FXML
    private Label score_label_level_page;
    @FXML
    private Label level_label_level_page;
    
  
  int flagLine1 , flagLine2 , flagLine3 , score1 = 0;
    
    @FXML
    private Button btn1; 
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn13;
    @FXML
    private Button btn14;
//    @FXML
//    private Button btn11;
    @FXML
    private Button btn9;
    @FXML
    private Button btn10;
    @FXML
    private Button btn12;
    @FXML
    private Button btn15;
    @FXML
    private Button btn16;
    @FXML
    private Line line1_E;
    @FXML
    private Line line1_H;
    @FXML
    private Line line1_A;
    @FXML
    private Line line1_D;
    @FXML
    private Label head;
    @FXML
    private Label title;
   // private Text html1;
    @FXML
    private Line line3_t;
    @FXML
    private Line line3_m;
    @FXML
    private Line line3_l;
    @FXML
    private Line line3_h;
    @FXML
    private Line line2_l;
    @FXML
    private Line line2_e;
    @FXML
    private Line line2_tt;
    @FXML
    private Line line2_i;
    @FXML
    private Line line2_t;
    @FXML
    private Label html;
    @FXML
    private Label hhtml;
    @FXML
    private Label hhead;
    @FXML
    private Label scorelvl1;
    @FXML
    private Button btn11;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         player = ControllerLogIn_.currentPlayer;
         score_label_level_page.setText(player.getPscore().toString()); 
         level_label_level_page.setText(player.getPlevel().toString());
        // TODO
    }  
    ///////////////////////////////////level1/////////////////////////////////////////////////
    @FXML
    private void headline1(ActionEvent event) {
        
            line1_H.setVisible(true);
        
        flagLine1++;
    }

    @FXML
    private void headline2(ActionEvent event) {
        
    if (flagLine1==1){
         line1_E.setVisible(true);
         flagLine1++;
    }
           
    }

    @FXML
    private void headline3(ActionEvent event) {
       if (flagLine1==2){
         line1_A.setVisible(true);
         flagLine1++;
       }

           
        
    }

    @FXML
    private void headline4(ActionEvent event) {
        if (flagLine1==3){
            line1_D.setVisible(true); 
             //head.setText("<head>");
             //hhead.setText("</head>");
             head.setVisible(true);
             hhead.setVisible(true);
             score1=score1+3;
             scorelvl1.setText(""+score1);
           flagLine1++;    
        }
    }
    
    
    
   

    @FXML
    private void titleline1(ActionEvent event) {
        line2_t.setVisible(true);
        flagLine2++;
    }

    @FXML
    private void titleline2(ActionEvent event) {
        if (flagLine2==1){
            line2_i.setVisible(true);
            flagLine2++;
        }
    }
    
    @FXML
    private void titleline3(ActionEvent event) {
        if (flagLine2==2){
            line2_tt.setVisible(true);
            flagLine2++;
        }
    }
    
    @FXML
    private void titleline4(ActionEvent event) {
        if (flagLine2==3){
            line2_l.setVisible(true);
            flagLine2++;
        }
    }
    
    @FXML
    private void titleline5(ActionEvent event) {
        if (flagLine2==4){
            line2_e.setVisible(true);
            //title.setText("<title> YOU CAN DO IT </title>");
             title.setVisible(true);
             score1=score1+4;
             scorelvl1.setText(""+score1);
            flagLine2++;
        }
    }
    
    @FXML
    private void htmlline1(ActionEvent event) {
        line3_h.setVisible(true);
        flagLine3++;

    }

    @FXML
    private void htmlline2(ActionEvent event) {
        if (flagLine3==1){
            line3_t.setVisible(true);
            flagLine3++;
        }
    }
    
    @FXML
    private void htmlline3(ActionEvent event) {
        if (flagLine3==2){
            line3_m.setVisible(true);
            flagLine3++;
        }
    }

    @FXML
    private void htmlline4(ActionEvent event) {
        if (flagLine3==3){
            line3_l.setVisible(true);
            //html.setText("<html>");
            //hhtml.setText("</html>");
            html.setVisible(true);
            hhtml.setVisible(true);
            score1=score1+3;
            scorelvl1.setText(""+score1);
            flagLine3++;
        }
    }
@FXML
       private void lvl1WordSearchBackBtn(ActionEvent event) throws IOException {
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLPlayPage.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void lvl1WordSearchFinishBtn(ActionEvent event) throws IOException {
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        //Player p = ControllerLogIn_.currentPlayer;
        int currentScore = player.getPscore();
        player.setPscore(currentScore+score1);
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

