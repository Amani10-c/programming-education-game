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
import javafx.scene.control.TextField;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author 96653
 */
public class Controller_connect_tag_lv3 implements Initializable {

 int flagTitle , flagH1 , flagHead , flagHtml , flagBody , flagP= 0;
 int flagHtml2 , flagLi2 , flagUl2 , flagLabel2 , flagBody2 , flagOl2, flagTextarea2= 0;
  int flagForm3 , flagFildset3 , flagButton3 , flagLabel3, flagLegend3 , flagSelect3, flagOption3= 0;
 int lvl1_score ,lvl2_score , lvl3_score = 0;
 
//    @FXML
//    private Line lv1title_L3;
//    @FXML
//    private Line lv1title_L2;
//    @FXML
//    private Line lv1title_L1; 
//    @FXML
//    private Label lvl1_titleOpn;
//    @FXML
//    private Label lvl1_titleCls;
//    @FXML
//    private Label lv1_score;
//    @FXML
//    private Line lv1h1_L1;
//    @FXML
//    private Line lv1h1_L2;
//    @FXML
//    private Line lv1h1_L3;
//    @FXML
//    private Line lv1head_L1;
//    @FXML
//    private Line lv1p_L3;
//    @FXML
//    private Line lv1p_L4;
//    @FXML
//    private Line lv1h1_L5;
//    @FXML
//    private Line lv1h1_L4;
//    @FXML
//    private Line lv1body_L2;
//    @FXML
//    private Line lv1body_L1;
//    @FXML
//    private Line lv1p_L1;
//    @FXML
//    private Line lv1p_L2;
//    @FXML
//    private Line lv1html_L2;
//    @FXML
//    private Line lv1html_L1;
//    @FXML
//    private Label lvl1_headOpn;
//    @FXML
//    private Label lvl1_headCls;
//    @FXML
//    private Label lvl1_bodyOpn;
//    @FXML
//    private Label lvl1_bodyCls;
//    @FXML
//    private Label lvl1_htmlCls;
//    @FXML
//    private Label lvl1_htmlOpn;
//    @FXML
//    private Label lvl1_h1Opn;
//    @FXML
//    private Label lv1_h1Cls;
//    @FXML
//    private Label lvl1_pOpn;
//    @FXML
//    private Label lvl1_pCls;
//    private Line lv2textarea_L4;
//    private Line lv2textarea_L1;
//    private Line lv2ol_L6;
//    private Line lv2label_L1;
//    private Line lv2label_L2;
//    private Line lv2ol_L3;
//    private Line lv2ol_L4;
//    private Line lv2li_L3;
//    private Line lv2li_L4;
//    private Line lv2ul_L4;
//    private Line lv2ul_L1;
//    private Line lv2body_L1;
//    private Label lvl2headOpn;
//    private Label lvl2headCls;
//    private Label lvl2titleOpn;
//    private Label lvl2titleCls;
//    private Label lvl2bodyOpn;
//    private Label lvl2bodyCls;
//    private Label lvl2htmlCls;
//    private Label lvl2htmlOpn;
//    private Label lvl2labelOpn;
//    private Label lvl2labelCls;
//    private Label lvl2olOpn;
//    private Label lvl2olCls;
//    private Label lvl2li1Opn;
//    private Label lvl2li1Cls;
//    private Label lvl2ulOpn;
//    private Label lvl2ulCls;
//    private Label lvl2li2Opn;
//    private Label lvl2li2Cls;
//    private Line lv2textarea_L3;
//    private Line lv2textarea_L2;
//    private Line lv2ul_L3;
//    private Line lv2ul_L2;
//    private Line lv2ul_L5;
//    private Line lv2ul_L6;
//    private Line lv2body_L3;
//    private Line lv2body_L2;
//    private Line lv2ol_L2;
//    private Line lv2ol_L1;
//    private Line lv2ol_L5;
//    private Line lv2ol_L7;
//    private Line lv2ol_L8;
//    private Line lv2li_L2;
//    private Line lv2li_L1;
//    private Line lv2html_L1;
//    private Line lv2html_L2;
//    private Label lv2_score;
//    private Label lvl2_textareaOpn;
//    private Label lvl2_textareaCls;
    @FXML
    private Line lv3fildset_L4;
    @FXML
    private Line lv3fildset_L1;
    @FXML
    private Line lv3button_L10;
    @FXML
    private Line lv3label_L1;
    @FXML
    private Line lv3button_L3;
    @FXML
    private Line lv3option_L2;
    @FXML
    private Line lv3option_L3;
    @FXML
    private Line lv3option_L1;
    @FXML
    private Line lv3select_L7;
    @FXML
    private Line lv3legend_L1;
    @FXML
    private Line lv3form_L7;
    @FXML
    private Line lv3form_L6;
    @FXML
    private Line lv3form_L3;
    @FXML
    private Line lv3form_L10;
    @FXML
    private Line lv3form_L5;
    @FXML
    private Line lv3select_L6;
    @FXML
    private Line lv3select_L5;
    @FXML
    private Line lv3select_L4;
    @FXML
    private Line lv3select_L3;
    @FXML
    private Line lv3button_L13;
    @FXML
    private Line lv3form_L9;
    @FXML
    private Line lv3fildset_L3;
    @FXML
    private Line lv3fildset_L2;
    @FXML
    private Line lv3select_L9;
    @FXML
    private Line lv3button_L9;
    @FXML
    private Line lv3button_L4;
    @FXML
    private Line lv3button_L11;
    @FXML
    private Line lv3button_L12;
    @FXML
    private Line lv3button_L5;
    @FXML
    private Line lv3button_L6;
    @FXML
    private Line lv3legend_L3;
    @FXML
    private Line lv3button_L8;
    @FXML
    private Line lv3select_L1;
    @FXML
    private Line lv3label_L5;
    @FXML
    private Line lv3form_L4;
    @FXML
    private Line lv3select_L8;
    @FXML
    private Line lv3select_L2;
    @FXML
    private Line lv3legend_L2;
    @FXML
    private Line lv3form_L8;
    @FXML
    private Line lv3form_L1;
    @FXML
    private Line lv3form_L2;
    @FXML
    private Line lv3button_L7;
    @FXML
    private Line lv3button_L2;
    @FXML
    private Line lv3button_L1;
    @FXML
    private Line lv3label_L4;
    @FXML
    private Line lv3label_L2;
    @FXML
    private Line lv3label_L3;
    @FXML
    private Label lvl3fildsetOpn;
    @FXML
    private Label lvl3formOpn;
    @FXML
    private Label lvl3fildsetCls;
    @FXML
    private Label lvl3formCls;
    @FXML
    private Label lvl3legendOpn;
    @FXML
    private Label lvl3legendCls;
    @FXML
    private Label lvl3selectOpn;
    @FXML
    private Label lvl3option2Cls;
    @FXML
    private Label lvl3buttonOpn;
    @FXML
    private Label lvl3option2Opn;
    @FXML
    private Label lvl3selectCls;
    @FXML
    private Label lvl3buttonCls;
    @FXML
    private Label lvl3option1Cls;
    @FXML
    private Label lvl3option1Opn;
    @FXML
    private Label lvl3labelCls;
    @FXML
    private Label lvl3labelOpn;
    @FXML
    private Label lv3_score;
//    @FXML
//    private Button lvl1btn18;
//    @FXML
//    private Button lvl1btn6;
//    @FXML
//    private Button lvl1btn7;
//    @FXML
//    private Button lvl1btn10;
//    @FXML
//    private Button lvl1btn11;
//    @FXML
//    private Button lvl1btn12;
//    @FXML
//    private Button lvl1btn15;
//    @FXML
//    private Button lvl1btn16;
//    @FXML
//    private Button lvl1btn17;
//    @FXML
//    private Button lvl1btn14;
//    @FXML
//    private Button lvl1btn20;
//    @FXML
//    private Button lvl1btn21;
//    @FXML
//    private Button lvl1btn22;
//    @FXML
//    private Button lvl1btn125;
//    @FXML
//    private Button lvl1btn2;
//    @FXML
//    private Button lvl1btn3;
//    @FXML
//    private Button lvl1btn4;
//    @FXML
//    private Button lvl1btn8;
//    @FXML
//    private Button lvl1btn13;
//    @FXML
//    private Button lvl1btn19;
//    @FXML
//    private Button lvl1btn23;
//    @FXML
//    private Button lvl1btn24;
//    @FXML
//    private Button lvl1btn9;
//    @FXML
//    private Button lvl1btn5;
//    @FXML
//    private Button lvl1btn1;
//    
    @FXML
    private Button lvl3btn40;
    @FXML
    private Button lvl3btn24;
    @FXML
    private Button lvl3btn25;
    @FXML
    private Button lvl3btn28;
    @FXML
    private Button lvl3btn31;
    @FXML
    private Button lvl3btn32;
    @FXML
    private Button lvl3btn35;
    @FXML
    private Button lvl3btn38;
    @FXML
    private Button lvl3btn39;
    @FXML
    private Button lvl3btn34;
    @FXML
    private Button lvl3btn42;
    @FXML
    private Button lvl3btn45;
    @FXML
    private Button lvl3btn49;
    @FXML
    private Button lvl3btn1;
    @FXML
    private Button lvl3btn18;
    @FXML
    private Button lvl3btn19;
    @FXML
    private Button lvl3btn20;
    @FXML
    private Button lvl3btn26;
    @FXML
    private Button lvl3btn33;
    @FXML
    private Button lvl3btn41;
    @FXML
    private Button lvl3btn47;
    @FXML
    private Button lvl3btn48;
    @FXML
    private Button lvl3btn27;
    @FXML
    private Button lvl3btn21;
    @FXML
    private Button lvl3btn17;
    @FXML
    private Button lvl3btn12;
    @FXML
    private Button lvl3btn16;
    @FXML
    private Button lvl3btn13;
    @FXML
    private Button lvl3btn44;
    @FXML
    private Button lvl3btn14;
    @FXML
    private Button lvl3btn9;
    @FXML
    private Button lvl3btn10;
    @FXML
    private Button lvl3btn37;
    @FXML
    private Button lvl3btn7;
    @FXML
    private Button lvl3btn3;
    @FXML
    private Button lvl3btn36;
    @FXML
    private Button lvl3btn29;
    @FXML
    private Button lvl3btn22;
    @FXML
    private Button lvl3btn15;
    @FXML
    private Button lvl3btn8;
    @FXML
    private Button lvl3btn11;
    @FXML
    private Button lvl3btn23;
    @FXML
    private Button lvl3btn30;
    @FXML
    private Button lvl3btn4;
    @FXML
    private Button lvl3btn43;
    @FXML
    private Button lvl3btn6;
    @FXML
    private Button lvl3btn46;
    @FXML
    private Button lvl3btn5;
    @FXML
    private Button lvl3btn2;
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
//  //________________________________________________level_three__________________________________________
    @FXML
    private void lvl3btn24(ActionEvent event) {
         flagForm3++;
         lv3form_L1.setVisible(true);
    }

    @FXML
    private void lvl3btn31(ActionEvent event) {
        if(flagForm3==1){
            lv3form_L2.setVisible(true);
            flagForm3++;
        }
    }

    @FXML
    private void lvl3btn30(ActionEvent event) {
        if(flagForm3==2){
            lv3form_L3.setVisible(true);
            flagForm3++;
        }
    }

    @FXML
    private void lvl3btn29(ActionEvent event) {
        if(flagForm3==3){
            lv3form_L4.setVisible(true);
            flagForm3++;
        }
    }

    @FXML
    private void lvl3btn22(ActionEvent event) {
        if(flagForm3==4){
            lv3form_L5.setVisible(true);
            flagForm3++;
        }
    }

    @FXML
    private void lvl3btn15(ActionEvent event) {
        if(flagForm3==5){
            lv3form_L6.setVisible(true);
            flagForm3++;
        }
    }

    @FXML
    private void lvl3btn8(ActionEvent event) {
        if(flagForm3==6){
            lv3form_L7.setVisible(true);
            flagForm3++;
        }
    }

    @FXML
    private void lvl3btn1(ActionEvent event) {
        if(flagForm3==7){
            lv3form_L8.setVisible(true);
            flagForm3++;
        }
    }

    @FXML
    private void lvl3btn2(ActionEvent event) {
        if(flagForm3==8){
            lv3form_L9.setVisible(true);
            flagForm3++;
        }
    }

    @FXML
    private void lvl3btn3(ActionEvent event) {
        if(flagForm3==9){
            lv3form_L10.setVisible(true);
            flagForm3++;
        }
    }

    @FXML
    private void lvl3btn4(ActionEvent event) {
        if(flagForm3==10){
            lvl3formOpn.setVisible(true);
            lvl3formCls.setVisible(true);
             lvl3_score +=2;
             lv3_score.setText("" + lvl3_score);          
        }
        flagForm3++;
    }

    
    
    @FXML
    private void lvl3btn32(ActionEvent event) {
        flagButton3++;
        lv3button_L1.setVisible(true);
    }

    @FXML
    private void lvl3btn25(ActionEvent event) {
        if (flagButton3==1) {
            lv3button_L2.setVisible(true);
            flagButton3++;
        }
    }

    @FXML
    private void lvl3btn26(ActionEvent event) {
         if (flagButton3==2) {
            lv3button_L3.setVisible(true);
            flagButton3++;
        }
    }

    @FXML
    private void lvl3btn27(ActionEvent event) {
        if (flagButton3==3) {
            lv3button_L4.setVisible(true);
            lv3button_L5.setVisible(true);
            flagButton3++;
        }
    }

    @FXML
    private void lvl3btn20(ActionEvent event) {
        if (flagButton3==4) {
            lv3button_L6.setVisible(true);
            flagButton3++;
        }
    }

    @FXML
    private void lvl3btn21(ActionEvent event) {
        if (flagButton3==5) {
            lv3button_L7.setVisible(true);
            lv3button_L8.setVisible(true);
            flagButton3++;
        }
    }

    @FXML
    private void lvl3btn14(ActionEvent event) {
        if (flagButton3==6) {
            lv3button_L9.setVisible(true);
            flagButton3++;
        }
    }

    @FXML
    private void lvl3btn7(ActionEvent event) {
        if (flagButton3==7) {
            lv3button_L10.setVisible(true);
            lv3button_L11.setVisible(true);
            flagButton3++;
        }
    }

    @FXML
    private void lvl3btn6(ActionEvent event) {
        if (flagButton3==8) {
            lv3button_L12.setVisible(true);
            flagButton3++;
        }
    }

    @FXML
    private void lvl3btn5(ActionEvent event) {
         if (flagButton3==9) {
            lv3button_L13.setVisible(true);
            lvl3buttonOpn.setVisible(true);
             lvl3buttonCls.setVisible(true);
              lvl3_score +=2;
             lv3_score.setText("" + lvl3_score);       
           
        }
         flagButton3++;
    }
    
    

    @FXML
    private void lvl3btn36(ActionEvent event) {
        flagSelect3++;
        lv3select_L1.setVisible(true);
    }

    @FXML
    private void lvl3btn43(ActionEvent event) {
        if (flagSelect3==1) {
            lv3select_L2.setVisible(true);
            flagSelect3++;
        }
    }

    @FXML
    private void lvl3btn44(ActionEvent event) {
         if (flagSelect3==2) {
            lv3select_L3.setVisible(true);
            flagSelect3++;
        }
    }

    @FXML
    private void lvl3btn45(ActionEvent event) {
        if (flagSelect3==3) {
            lv3select_L4.setVisible(true);
            flagSelect3++;
        }
    }

    @FXML
    private void lvl3btn46(ActionEvent event) {
        if (flagSelect3==4) {
            lv3select_L5.setVisible(true);
            flagSelect3++;
        }
    }

    @FXML
    private void lvl3btn47(ActionEvent event) {
        if (flagSelect3==5) {
            lv3select_L6.setVisible(true);
            flagSelect3++;
        }
    }

    @FXML
    private void lvl3btn48(ActionEvent event) {
        if (flagSelect3==6) {
            lv3select_L7.setVisible(true);
            flagSelect3++;
        }
    }

    @FXML
    private void lvl3btn49(ActionEvent event) {
        if (flagSelect3==7) {
            lv3select_L8.setVisible(true);
            flagSelect3++;
        }
    }
    @FXML
    private void lvl3btn42(ActionEvent event) {
         if (flagSelect3==9) {
            lv3select_L9.setVisible(true);
            lvl3selectOpn.setVisible(true);
             lvl3selectCls.setVisible(true);
              lvl3_score +=2;
             lv3_score.setText("" + lvl3_score);   
           
        }
         flagSelect3++;
    }
    
    

    @FXML
    private void lvl3btn41(ActionEvent event) {
        flagOption3++;
        
    }

    @FXML
    private void lvl3btn40(ActionEvent event) {
        if (flagOption3==1) {
            lv3option_L1.setVisible(true);
            flagOption3++;
        }
    }

    @FXML
    private void lvl3btn39(ActionEvent event) {
        if (flagOption3==2) {
             lv3option_L2.setVisible(true);
            flagOption3++;
        }
    }

    @FXML
    private void lvl3btn38(ActionEvent event) {
        if (flagOption3==3) {
            lv3option_L3.setVisible(true);
            flagOption3++;
        }
    }

    @FXML
    private void lvl3btn37(ActionEvent event) {
         if (flagOption3==4) {
            lvl3option1Opn.setVisible(true);
             lvl3option1Cls.setVisible(true);
             lvl3option2Opn.setVisible(true);
             lvl3option2Cls.setVisible(true);
              lvl3_score +=1;
             lv3_score.setText("" + lvl3_score);       
           
        }
         flagOption3++;
    }
    
    

    @FXML
    private void lvl3btn33(ActionEvent event) {
            flagLegend3++;
            lv3legend_L1.setVisible(true);
            
    }

    @FXML
    private void lvl3btn34(ActionEvent event) {
        if (flagLegend3==1) {
             lv3legend_L2.setVisible(true);
            flagLegend3++;
        }
    }

    @FXML
    private void lvl3btn35(ActionEvent event) {
        if (flagLegend3==2) {
            lv3legend_L3.setVisible(true);
            flagLegend3++;
        }
    }

    @FXML
    private void lvl3btn28(ActionEvent event) {
         if (flagLegend3==3) {
            lvl3legendOpn.setVisible(true);
             lvl3legendCls.setVisible(true);
             lvl3_score +=1;
             lv3_score.setText("" + lvl3_score);       
        }
         flagLegend3++;
    }

    
    
    @FXML
    private void lvl3btn23(ActionEvent event) {
        flagFildset3++;
        lv3fildset_L1.setVisible(true);      
    }

    @FXML
    private void lvl3btn16(ActionEvent event) {
        if (flagFildset3==1) {
            lv3fildset_L2.setVisible(true);
            flagFildset3++;
        }
    }

    @FXML
    private void lvl3btn9(ActionEvent event) {
        if (flagFildset3==2) {
             lv3fildset_L3.setVisible(true);
            flagFildset3++;
        }
    }

    @FXML
    private void lvl3btn10(ActionEvent event) {
        if (flagFildset3==3) {
           lv3fildset_L4.setVisible(true);
            flagFildset3++;
        }
    }

    @FXML
    private void lvl3btn11(ActionEvent event) {
         if (flagFildset3==4) {
             lvl3fildsetOpn.setVisible(true);
             lvl3fildsetCls.setVisible(true);
             lvl3_score +=1;
             lv3_score.setText("" + lvl3_score);       
           
        }
         flagFildset3++;
    }
    
    

    @FXML
    private void lvl3btn17(ActionEvent event) {
        flagLabel3++;
        lv3label_L1.setVisible(true);      
    }

    @FXML
    private void lvl3btn18(ActionEvent event) {
        if (flagLabel3==1) {
            lv3label_L2.setVisible(true);
            flagLabel3++;
        }
    }

    @FXML
    private void lvl3btn19(ActionEvent event) {
        if (flagLabel3==2) {
             lv3label_L3.setVisible(true);
            flagLabel3++;
        }
    }

    @FXML
    private void lvl3btn12(ActionEvent event) {
        if (flagLabel3==3) {
            lv3label_L4.setVisible(true);
            flagLabel3++;
        }
    }

    @FXML
    private void lvl3btn13(ActionEvent event) {
         if (flagLabel3==4) {
              lv3label_L5.setVisible(true);
            lvl3labelOpn.setVisible(true);
             lvl3labelCls.setVisible(true);
             lvl3_score +=1;
             lv3_score.setText("" + lvl3_score);       
           
        }
         flagLabel3++;
    }
   
        @FXML
       private void lvl3ConnectTagBackBtn(ActionEvent event) throws IOException {
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLPlayPage.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void lvl3ConnectTagFinishBtn(ActionEvent event) throws IOException {
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        //Player p = ControllerLogIn_.currentPlayer;
        int currentScore = player.getPscore();
        player.setPscore(currentScore+lvl3_score);
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
    
