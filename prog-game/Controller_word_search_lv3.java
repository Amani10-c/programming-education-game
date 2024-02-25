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
public class Controller_word_search_lv3 implements Initializable {
    
//    //////////////3////////////////////////////
     int flagLine1 , flagLine2 , flagLine3 , score3 = 0;            
    int flagline111 , flagline222 , flagline333,flagline444,flagline555= 0;

    
    @FXML
    private Button btn_1;
    @FXML
    private Button btn_2;
    @FXML
    private Button btn_4;
    @FXML
    private Button btn_6;
    @FXML
    private Button btn_7;
    @FXML
    private Button btn_9;
    @FXML
    private Button btn_11;
    @FXML
    private Button btn_12;
    @FXML
    private Button btn_14;
    @FXML
    private Button btn_3;
    @FXML
    private Button btn_8;
    @FXML
    private Button btn_13;
    @FXML
    private Button btn_5;
    @FXML
    private Button btn_10;
    @FXML
    private Button btn_15;
    @FXML
    private Button btn_16;
    @FXML
    private Button btn_17;
    @FXML
    private Button btn_18;
    @FXML
    private Button btn_19;
    @FXML
    private Button btn_20;
    @FXML
    private Button btn_21;
    @FXML
    private Button btn_22;
    @FXML
    private Button btn_23;
    @FXML
    private Button btn_24;
    @FXML
    private Button btn_25;
    @FXML
    private Button btn_26;
    @FXML
    private Button btn_27;
    @FXML
    private Button btn_28;
    @FXML
    private Button btn_29;
    @FXML
    private Button btn_30;
    @FXML
    private Line Lform2;
    @FXML
    private Line Lform4;
    @FXML
    private Line Lform3;
    @FXML
    private Line Lfieldset1;
    @FXML
    private Line Lfieldset3;
    @FXML
    private Line Lfieldset4;
    @FXML
    private Line Lform1;
    @FXML
    private Line Lfieldset6;
    @FXML
    private Line Lfieldset7;
    @FXML
    private Line Lselect3;
    @FXML
    private Line Lfieldset8;
    @FXML
    private Line Lselect1;
    @FXML
    private Line Lfieldset5;
    @FXML
    private Line Loption3;
    @FXML
    private Line Lselect2;
    @FXML
    private Line Lselect4;
    @FXML
    private Line Loption2;
    @FXML
    private Line Loption1;
    @FXML
    private Line Loption4;
    @FXML
    private Line Llegend6;
    @FXML
    private Line Loption5;
    @FXML
    private Line Loption6;
    @FXML
    private Line Lfieldset2;
    @FXML
    private Line Llegend1;
    @FXML
    private Line Llegend2;
    @FXML
    private Line Llegend4;
    @FXML
    private Line Llegend3;
    @FXML
    private Line Llegend5;
    @FXML
    private Line Lselect5;
    @FXML
    private Line Lselect6;
    @FXML
    private Label html3;
    @FXML
    private Label hhtml3;
    @FXML
    private Label head3;
    @FXML
    private Label hhead3;
    @FXML
    private Label title3;
    @FXML
    private Label html31;
    @FXML
    private Label select1;
    @FXML
    private Label head31;
    @FXML
    private Label legend;
    @FXML
    private Label form1;
    @FXML
    private Label select2;
    @FXML
    private Label option2;
    @FXML
    private Label option1;
    @FXML
    private Label fieldset2;
    @FXML
    private Label fieldset1;
    @FXML
    private Label form2;
     @FXML
    private Label scorelvl3;
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
    

////////////////////////////////////level3////////////////////////////////////////////////

    
     

    @FXML
    private void form1(ActionEvent event) {
        Lform1.setVisible(true);
        flagline111++;
    }
    
    @FXML
    private void form2(ActionEvent event) {
       
        if(flagline111==1){
            Lform2.setVisible(true);
            
            flagline111++;
        }
    }

    @FXML
    private void form3(ActionEvent event) {
        if(flagline111==2){
            Lform3.setVisible(true);
            
            flagline111++;
        }
    }
    
    @FXML
    private void form4(ActionEvent event) {
        if(flagline111==3){
            Lform4.setVisible(true);
            score3=score3+2;
            scorelvl3.setText(""+score3);
           // form1.setText("<form>");
           // form2.setText("</form>");
            form1.setVisible(true);
            form2.setVisible(true);
            flagline111++;
        }
        
    }
   
    @FXML
    private void select1(ActionEvent event) {
        Lselect1.setVisible(true);
        flagline222++;
    }

    @FXML
    private void select2(ActionEvent event) {
        if(flagline222==1){
            Lselect2.setVisible(true);
            
            //h1.setText("<h1> MY FIRST HTML </h1>");
            flagline222++;
        }
    }
    
    @FXML
    private void select3(ActionEvent event) {
        if(flagline222==2){
            Lselect3.setVisible(true);
            
            //h1.setText("<h1> MY FIRST HTML </h1>");
            flagline222++;
        }
    }

    @FXML
    private void select4(ActionEvent event) {
        if(flagline222==3){
            Lselect4.setVisible(true);
            
            //h1.setText("<h1> MY FIRST HTML </h1>");
            flagline222++;
        }
    }
    
    @FXML
    private void select5(ActionEvent event) {
        if(flagline222==4){
            Lselect5.setVisible(true);
           // textarea1.setVisible(true);
            // ttextarea1.setVisible(true);
           // h1.setText("<h1> MY FIRST HTML </h1>");
            flagline222++;
        }
    }
    
    @FXML
    private void select6(ActionEvent event) {
        if(flagline222==5){
            Lselect6.setVisible(true);
            score3=score3+2;
            scorelvl3.setText(""+score3);
            select1.setVisible(true);
            select2.setVisible(true);
            
        }
        flagline222++;
    }

    @FXML
    private void option1(ActionEvent event) {
        Loption1.setVisible(true);
        flagline333++;
    }

    @FXML
    private void option2(ActionEvent event) {
        if(flagline333==1){
            Loption2.setVisible(true);
            
            flagline333++;
        }
    }

    @FXML
    private void option3(ActionEvent event) {
        if(flagline333==2){
            Loption3.setVisible(true);
            
            
            flagline333++;
        }
    }

    @FXML
    private void option4(ActionEvent event) {
        if(flagline333==3){
            Loption4.setVisible(true);
            
            
            flagline333++;
        }
    }

    @FXML
    private void option5(ActionEvent event) {
        if(flagline333==4){
            Loption5.setVisible(true);
            
            
            flagline333++;
        }
    }
    
    @FXML
    private void option6(ActionEvent event) {
        if(flagline333==5){
            Loption6.setVisible(true);
            score3=score3+2;
            scorelvl3.setText(""+score3);
           // option1.setText("<option>                         </option>");
           // option2.setText("<option>                         </option>");
            option1.setVisible(true);
            option2.setVisible(true);
           
        }
        flagline333++;
    }
    
    @FXML
    private void legend1(ActionEvent event) {
        Llegend1.setVisible(true);
        flagline444++;
    }
    
    @FXML
    private void legend2(ActionEvent event) {
        if(flagline444==1){
            Llegend2.setVisible(true);
            
            
            flagline444++;
        }
    }

    @FXML
    private void legend3(ActionEvent event) {
        if(flagline444==2){
            Llegend3.setVisible(true);
            
            
            flagline444++;
        }
    }
    
    @FXML
    private void legend4(ActionEvent event) {
        if(flagline444==3){
            Llegend4.setVisible(true);
            
            
            flagline444++;
        }
    }
    
    @FXML
    private void legend5(ActionEvent event) {
        if(flagline444==4){
            Llegend5.setVisible(true);
            
            
            flagline444++;
        }
    }
    
    @FXML
    private void legend6(ActionEvent event) {
        if(flagline444==5){
            Llegend6.setVisible(true);
            score3=score3+2;
            scorelvl3.setText(""+score3);
            
            legend.setVisible(true);
            
        }
        flagline444++;
    }
    
    @FXML
    private void fieldset1(ActionEvent event) {
        Lfieldset1.setVisible(true);
        flagline555++;
    }
    
    @FXML
    private void fieldset2(ActionEvent event) {
        if(flagline555==1){
            Lfieldset2.setVisible(true);
            
            
            flagline555++;
        }
    }

    @FXML
    private void fieldset3(ActionEvent event) {
        if(flagline555==2){
            Lfieldset3.setVisible(true);
            
            //h1.setText("<h1> MY FIRST HTML </h1>");
            flagline555++;
        }
    }

    @FXML
    private void fieldset4(ActionEvent event) {
        if(flagline555==3){
            Lfieldset4.setVisible(true);
            
            //h1.setText("<h1> MY FIRST HTML </h1>");
            flagline555++;
        }
    }
    
    @FXML
    private void fieldset5(ActionEvent event) {
        if(flagline555==4){
            Lfieldset5.setVisible(true);
            
            //h1.setText("<h1> MY FIRST HTML </h1>");
            flagline555++;
        }
    }
    
    @FXML
    private void fieldset6(ActionEvent event) {
        if(flagline555==5){
            Lfieldset6.setVisible(true);
            
            //h1.setText("<h1> MY FIRST HTML </h1>");
            flagline555++;
        }
    }
    
    @FXML
    private void fieldset7(ActionEvent event) {
        if(flagline555==6){
            Lfieldset7.setVisible(true);
            
            //h1.setText("<h1> MY FIRST HTML </h1>");
            flagline555++;
        }
    }
    
    @FXML
    private void fieldset8(ActionEvent event) {
        if(flagline555==7){
            Lfieldset8.setVisible(true);
            score3=score3+2;
            scorelvl3.setText(""+score3);
           // fieldset1.setText("<fieldset>");
            fieldset1.setVisible(true);
            fieldset2.setVisible(true);
           // fieldset2.setText("</fieldset>");
            flagline555++;
        }
    }
    
       private void lvl3WordSearchBackBtn(ActionEvent event) throws IOException {
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLPlayPage.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void lvl3WordSearchFinishBtn(ActionEvent event) throws IOException {
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        //Player p = ControllerLogIn_.currentPlayer;
        int currentScore = player.getPscore();
        player.setPscore(currentScore+score3);
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
    
    

