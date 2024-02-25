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
 *
 * @author 96653
 */
public class Controller_word_search_lv2 implements Initializable {
    
     int flagLine1 , flagLine2 , flagLine3 , score2 = 0;
    int flagline11 , flagline22 , flagline33 , flagline44 , flagline55 , flagline66 = 0;
    @FXML
    private Label html2;
    @FXML
    private Label hhtml2;
    @FXML
    private Label head2;
    @FXML
    private Label hhead2;
    @FXML
    private Label title2;
    @FXML
    private Label body2;
    @FXML
    private Label body1;
    @FXML
    private Label h1;
    private Label li1;
    @FXML
    private Label ol2;
    @FXML
    private Label textarea1;
    @FXML
    private Label ol;
    @FXML
    private Label li;
   // @FXML
   // private Text score;
    @FXML
    private Button btn144;
    @FXML
    private Button btn133;
    @FXML
    private Button btn22;
    @FXML
    private Button btn33;
    @FXML
    private Button btn44;
    @FXML
    private Button btn55;
    @FXML
    private Button btn66;
    @FXML
    private Button btn77;
    @FXML
    private Button btn88;
    @FXML
    private Button btn99;
    @FXML
    private Button btn122;
    @FXML
    private Button btn111;
    @FXML
    private Button btn100;
    @FXML
    private Button btn11;
    @FXML
    private Button btn24;
    @FXML
    private Button btn23;
    @FXML
    private Button btn222;
    @FXML
    private Button btn21;
    @FXML
    private Button btn20;
    @FXML
    private Button btn19;
    @FXML
    private Button btn18;
    @FXML
    private Button btn17;
    @FXML
    private Button btn166;
    @FXML
    private Button btn155;
    @FXML
    private Line line11_l;
    @FXML
    private Line line11_a;
    @FXML
    private Line line11_b;
    @FXML
    private Line line11_e;
    @FXML
    private Line line11_l1;
    @FXML
    private Line line22_e;
    @FXML
    private Line line22_t;
    @FXML
    private Line line22_x;
    @FXML
    private Line line22_tt;
    @FXML
    private Line line22_a;
    @FXML
    private Line line22_r;
    @FXML
    private Line line22_ee;
    @FXML
    private Line line33_b;
    @FXML
    private Line line33_o;
    @FXML
    private Line line33_d;
    @FXML
    private Line line33_y;
    @FXML
    private Line line44_h;
    @FXML
    private Line line44_1;
    @FXML
    private Line line55_o;
    @FXML
    private Line line55_l;
    @FXML
    private Line line22_aa;
    @FXML
    private Line line66_l;
    @FXML
    private Line line66_i;
     @FXML
    private Label scorelvl2; 
     @FXML
    private Label label2;
    @FXML
    private Label ttextarea1;
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
    
     
 ///////////////////////////////////level2/////////////////////////////////////////////////
   

    
    @FXML
    private void h1line1(ActionEvent event) {
        line44_h.setVisible(true);
        flagline44++;
        
    }

    @FXML
    private void h1line2(ActionEvent event) {
        if(flagline44==1){
            line44_1.setVisible(true);
            score2=score2+2;
            scorelvl2.setText(""+score2);
            //h1.setText("<h1> MY FIRST HTML </h1>");
            h1.setVisible(true);
            flagline44++;
        }
    }
    
    @FXML
    private void labelline1(ActionEvent event) {
        line11_l.setVisible(true);
        flagline11++;
    }
    
    @FXML
    private void labelline2(ActionEvent event) {
        if(flagline11==1){
            line11_a.setVisible(true);
            flagline11++;
        }
    }

    @FXML
    private void labelline3(ActionEvent event) {
        if(flagline11==2){
            line11_b.setVisible(true);
            flagline11++;
        }
    }

    @FXML
    private void labelline4(ActionEvent event) {
        if(flagline11==3){
            line11_e.setVisible(true);
            flagline11++;
        }
    }

    @FXML
    private void labelline5(ActionEvent event) {
        if(flagline11==4){
            line11_l1.setVisible(true);
            score2=score2+2;
            scorelvl2.setText(""+score2);
            label2.setVisible(true);
           
            li1.setVisible(true);
            flagline11++;
        }
    }

    @FXML
    private void textarealine1(ActionEvent event) {
        line22_t.setVisible(true);
        flagline22++;
    }

 
    @FXML
    private void textarealine2(ActionEvent event) {
        if(flagline22==1){
            line22_e.setVisible(true);
            flagline22++;
        }
    }

    @FXML
    private void textarealine3(ActionEvent event) {
        if(flagline22==2){
            line22_x.setVisible(true);
            flagline22++;
        }
    }
    
    @FXML
    private void textarealine4(ActionEvent event) {
        if(flagline22==3){
            line22_tt.setVisible(true);
            flagline22++;
        }
    }

    @FXML
    private void textarealine5(ActionEvent event) {
        if(flagline22==4){
            line22_a.setVisible(true);
            flagline22++;
        }
    }

    @FXML
    private void textarealine6(ActionEvent event) {
        if(flagline22==5){
            line22_r.setVisible(true);
            flagline22++;
        }
    }

    @FXML
    private void textarealine7(ActionEvent event) {
        if(flagline22==6){
            line22_ee.setVisible(true);
            flagline22++;
        }
    }

    @FXML
    private void textarealine8(ActionEvent event) {
        if(flagline22==7){
            line22_aa.setVisible(true);
            score2=score2+2;
            scorelvl2.setText(""+score2);
            textarea1.setVisible(true);
            ttextarea1.setVisible(true);
            //textarea.setVisible(true);
            //textarea1.setVisible(true);
            flagline22++;
        }
    }

    
    @FXML
    private void bodyline1(ActionEvent event) {
        line33_b.setVisible(true);
        flagline33++;
    }
    
    @FXML
    private void bodyline2(ActionEvent event) {
        if(flagline33==1){
            line33_o.setVisible(true);
            flagline33++;
        }
    }

    @FXML
    private void bodyline3(ActionEvent event) {
        if(flagline33==2){
            line33_d.setVisible(true);
            flagline33++;
        }
    }

    @FXML
    private void bodyline4(ActionEvent event) {
        if(flagline33==3){
            line33_y.setVisible(true);
            score2=score2+2;
            scorelvl2.setText(""+score2);
            //body1.setText("<body>");
            //body2.setText("</body>");
            body1.setVisible(true);
            body2.setVisible(true);
            flagline33++;
        }
    }

    @FXML
    private void olline1(ActionEvent event) {
        line55_o.setVisible(true);
        
        flagline55++;
    }

    @FXML
    private void olline2(ActionEvent event) {
        if(flagline55==1){
            line55_l.setVisible(true);
            score2=score2+2;
            scorelvl2.setText(""+score2);
           // ol.setText("<ol>");
            //ol2.setText("</ol>");
            ol.setVisible(true);
            ol2.setVisible(true);
            flagline55++;
        }
    }
    
    @FXML
    private void liline1(ActionEvent event) {
        line66_l.setVisible(true);
        
        flagline66++;
    }
    
    @FXML
    private void liline2(ActionEvent event) {
        if(flagline66==1){
            line66_i.setVisible(true);
            score2=score2+2;
            scorelvl2.setText(""+score2);
           // li.setText("<li> i love html language</li>");
            li.setVisible(true);
            flagline66++;
        }
    }
    
    @FXML
       private void lvl2WordSearchBackBtn(ActionEvent event) throws IOException {
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLPlayPage.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void lvl2WordSearchFinishBtn(ActionEvent event) throws IOException {
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        //Player p = ControllerLogIn_.currentPlayer;
        int currentScore = player.getPscore();
        player.setPscore(currentScore+score2);
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
