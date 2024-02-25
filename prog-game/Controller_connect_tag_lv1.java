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
 * @author Jonab
 */
public class Controller_connect_tag_lv1 implements Initializable {
    
 int flagTitle , flagH1 , flagHead , flagHtml , flagBody , flagP= 0;
 int flagHtml2 , flagLi2 , flagUl2 , flagLabel2 , flagBody2 , flagOl2, flagTextarea2= 0;
  int flagForm3 , flagFildset3 , flagButton3 , flagLabel3, flagLegend3 , flagSelect3, flagOption3= 0;
 int lvl1_score ,lvl2_score , lvl3_score = 0;
 
    @FXML
    private Line lv1title_L3;
    @FXML
    private Line lv1title_L2;
    @FXML
    private Line lv1title_L1; 
    @FXML
    private Label lvl1_titleOpn;
    @FXML
    private Label lvl1_titleCls;
    @FXML
    private Label lv1_score;
    @FXML
    private Line lv1h1_L1;
    @FXML
    private Line lv1h1_L2;
    @FXML
    private Line lv1h1_L3;
    @FXML
    private Line lv1head_L1;
    @FXML
    private Line lv1p_L3;
    @FXML
    private Line lv1p_L4;
    @FXML
    private Line lv1h1_L5;
    @FXML
    private Line lv1h1_L4;
    @FXML
    private Line lv1body_L2;
    @FXML
    private Line lv1body_L1;
    @FXML
    private Line lv1p_L1;
    @FXML
    private Line lv1p_L2;
    @FXML
    private Line lv1html_L2;
    @FXML
    private Line lv1html_L1;
    @FXML
    private Label lvl1_headOpn;
    @FXML
    private Label lvl1_headCls;
    @FXML
    private Label lvl1_bodyOpn;
    @FXML
    private Label lvl1_bodyCls;
    @FXML
    private Label lvl1_htmlCls;
    @FXML
    private Label lvl1_htmlOpn;
    @FXML
    private Label lvl1_h1Opn;
    @FXML
    private Label lv1_h1Cls;
    @FXML
    private Label lvl1_pOpn;
    @FXML
    private Label lvl1_pCls;
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
//    private Line lv3fildset_L4;
//    private Line lv3fildset_L1;
//    private Line lv3button_L10;
//    private Line lv3label_L1;
//    private Line lv3button_L3;
//    private Line lv3option_L2;
//    private Line lv3option_L3;
//    private Line lv3option_L1;
//    private Line lv3select_L7;
//    private Line lv3legend_L1;
//    private Line lv3form_L7;
//    private Line lv3form_L6;
//    private Line lv3form_L3;
//    private Line lv3form_L10;
//    private Line lv3form_L5;
//    private Line lv3select_L6;
//    private Line lv3select_L5;
//    private Line lv3select_L4;
//    private Line lv3select_L3;
//    private Line lv3button_L13;
//    private Line lv3form_L9;
//    private Line lv3fildset_L3;
//    private Line lv3fildset_L2;
//    private Line lv3select_L9;
//    private Line lv3button_L9;
//    private Line lv3button_L4;
//    private Line lv3button_L11;
//    private Line lv3button_L12;
//    private Line lv3button_L5;
//    private Line lv3button_L6;
//    private Line lv3legend_L3;
//    private Line lv3button_L8;
//    private Line lv3select_L1;
//    private Line lv3label_L5;
//    private Line lv3form_L4;
//    private Line lv3select_L8;
//    private Line lv3select_L2;
//    private Line lv3legend_L2;
//    private Line lv3form_L8;
//    private Line lv3form_L1;
//    private Line lv3form_L2;
//    private Line lv3button_L7;
//    private Line lv3button_L2;
//    private Line lv3button_L1;
//    private Line lv3label_L4;
//    private Line lv3label_L2;
//    private Line lv3label_L3;
//    private Label lvl3fildsetOpn;
//    private Label lvl3formOpn;
//    private Label lvl3fildsetCls;
//    private Label lvl3formCls;
//    private Label lvl3legendOpn;
//    private Label lvl3legendCls;
//    private Label lvl3selectOpn;
//    private Label lvl3option2Cls;
//    private Label lvl3buttonOpn;
//    private Label lvl3option2Opn;
//    private Label lvl3selectCls;
//    private Label lvl3buttonCls;
//    private Label lvl3option1Cls;
//    private Label lvl3option1Opn;
//    private Label lvl3labelCls;
//    private Label lvl3labelOpn;
//    private Label lv3_score;
    @FXML
    private Button lvl1btn18;
    @FXML
    private Button lvl1btn6;
    @FXML
    private Button lvl1btn7;
    @FXML
    private Button lvl1btn10;
    @FXML
    private Button lvl1btn11;
    @FXML
    private Button lvl1btn12;
    @FXML
    private Button lvl1btn15;
    @FXML
    private Button lvl1btn16;
    @FXML
    private Button lvl1btn17;
    @FXML
    private Button lvl1btn14;
    @FXML
    private Button lvl1btn20;
    @FXML
    private Button lvl1btn21;
    @FXML
    private Button lvl1btn22;
    @FXML
    private Button lvl1btn125;
    @FXML
    private Button lvl1btn2;
    @FXML
    private Button lvl1btn3;
    @FXML
    private Button lvl1btn4;
    @FXML
    private Button lvl1btn8;
    @FXML
    private Button lvl1btn13;
    @FXML
    private Button lvl1btn19;
    @FXML
    private Button lvl1btn23;
    @FXML
    private Button lvl1btn24;
    @FXML
    private Button lvl1btn9;
    @FXML
    private Button lvl1btn5;
    @FXML
    private Button lvl1btn1;
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
    
    
    //________________________________________________level_one__________________________________________
   @FXML
    private void lvl1btn1(ActionEvent event) {
        flagTitle++;
    }
    @FXML
    private void lvl1btn2(ActionEvent event) {
         if(flagTitle==1){
            lv1title_L1.setVisible(true);
            flagTitle++;
        }
    }
    @FXML
    private void lvl1btn3(ActionEvent event) {
         if(flagTitle==2){
            lv1title_L2.setVisible(true);
            flagTitle++;
        }
    }
    @FXML
    private void lvl1btn4(ActionEvent event) {
         if(flagTitle==3){
            lv1title_L3.setVisible(true);
            flagTitle++;
        }
    }
    @FXML
    private void lvl1btn5(ActionEvent event) {
        if (flagTitle == 4) {
            lvl1_score += 2;
            lv1_score.setText("" + lvl1_score);
            lvl1_titleOpn.setVisible(true);
            lvl1_titleCls.setVisible(true);
        }
        flagTitle++;

    }

    
    @FXML
    private void lvl1btn6(ActionEvent event) {
        flagH1++;
    }
    @FXML
    private void lvl1btn7(ActionEvent event) {
        if(flagH1==1){
            lv1h1_L1.setVisible(true);
            flagH1++;
        }
    }
    @FXML
    private void lvl1btn8(ActionEvent event) {
        if(flagH1==2){
            lv1h1_L2.setVisible(true);
            flagH1++;
        }
    }
    @FXML
    private void lvl1btn9(ActionEvent event) {
        if(flagH1==3){
            lv1h1_L3.setVisible(true);
            flagH1++;
        }
    }
    @FXML
    private void lvl1btn10(ActionEvent event) {
        if(flagH1==4){
            lv1h1_L4.setVisible(true);
            flagH1++;
        }
    }
    @FXML
    private void lvl1btn15(ActionEvent event) {
        if(flagH1==5){
            lv1h1_L5.setVisible(true);
            lvl1_score += 2;
            lv1_score.setText("" + lvl1_score);
            lvl1_h1Opn.setVisible(true);
            lv1_h1Cls.setVisible(true);        
        }
        flagH1++;
    }

    
    @FXML
    private void lvl1btn11(ActionEvent event) {
        flagHead++;
        
    }
    @FXML
    private void lvl1btn12(ActionEvent event) {
        if (flagHead==1) {
            lv1head_L1.setVisible(true);
            flagHead++;
         }
    }
    @FXML
    private void lvl1btn13(ActionEvent event) {
         if (flagHead==2) {
            lvl1_score += 2;
            lv1_score.setText("" + lvl1_score);
            lvl1_headOpn.setVisible(true);
            lvl1_headCls.setVisible(true);
         }
         flagHead++;
    }

    
    @FXML
    private void lvl1btn14(ActionEvent event) {
        flagHtml++;
    }
    @FXML
    private void lvl1btn19(ActionEvent event) {
         if (flagHtml==1) {
            lv1html_L1.setVisible(true);
            flagHtml++;
         }
    }
    @FXML
    private void lvl1btn18(ActionEvent event) {
        if (flagHtml==2) {
            lv1html_L2.setVisible(true);
            lvl1_score += 1;
            lv1_score.setText("" + lvl1_score);
            lvl1_htmlOpn.setVisible(true);
            lvl1_htmlCls.setVisible(true);          
         }
        flagHtml++;
    }

    
    @FXML
    private void lvl1btn17(ActionEvent event) {
        flagBody++;
    }
    @FXML
    private void lvl1btn16(ActionEvent event) {
        if (flagBody==1) {
            lv1body_L1.setVisible(true);
            flagBody++;
        }
    }
    @FXML
    private void lvl1btn21(ActionEvent event) {
         if (flagBody==2) {
            lv1body_L2.setVisible(true);
            lvl1_score += 1;
            lv1_score.setText("" + lvl1_score);
            lvl1_bodyOpn.setVisible(true);
            lvl1_bodyCls.setVisible(true);           
        }
         flagBody++;
    }

    
    @FXML
    private void lvl1btn20(ActionEvent event) {
        flagP++;
        lv1p_L1.setVisible(true);
    }  
    @FXML
    private void lvl1btn25(ActionEvent event) {
        if (flagP==1) {
            lv1p_L2.setVisible(true);
            flagP++;          
        }
    }
    @FXML
    private void lvl1btn24(ActionEvent event) {
        if (flagP==2) {
            lv1p_L3.setVisible(true);
            flagP++;          
        }
    }
    @FXML
    private void lvl1btn23(ActionEvent event) {
         if (flagP==3) {
            lv1p_L4.setVisible(true);
            flagP++;          
        }
    }
    @FXML
    private void lvl1btn22(ActionEvent event) {
         if (flagP==4) {
            lvl1_score += 2;
            lv1_score.setText("" + lvl1_score);
            lvl1_pOpn.setVisible(true);
            lvl1_pCls.setVisible(true);                    
        }
         flagP++;
         
    }
    
       @FXML
       private void lvl1ConnectTagBackBtm(ActionEvent event) throws IOException {
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLPlayPage.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void lvl1ConnectTagFinishBtm(ActionEvent event) throws IOException {
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        //Player p = ControllerLogIn_.currentPlayer;
        int currentScore = player.getPscore();
        player.setPscore(currentScore+lvl1_score);
        session.update(player);
        tx.commit(); 
        session.close();
        
         Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLPlayPage.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
      //________________________________________________level_two_______________________________________

//    private void lvl21btn13(ActionEvent event) {
//        flagTextarea2++;
//         lv2textarea_L1.setVisible(true);
//    }
//    private void lvl21btn7(ActionEvent event) {
//        if (flagTextarea2==1) {
//            lv2textarea_L2.setVisible(true);
//            flagTextarea2++;           
//        }
//    }
//    private void lvl21btn1(ActionEvent event) {
//        if (flagTextarea2==2) {
//            lv2textarea_L3.setVisible(true);
//            flagTextarea2++;           
//        }
//    }
//    private void lvl21btn2(ActionEvent event) {
//        if (flagTextarea2==3) {
//            lv2textarea_L4.setVisible(true);
//            flagTextarea2++;           
//        }
//    }
//    private void lvl21btn3(ActionEvent event) {
//        if (flagTextarea2==4) {
//            lvl2_score +=1;
//            lv2_score.setText("" + lvl2_score);
//            lvl2_textareaOpn.setVisible(true);
//            lvl2_textareaCls.setVisible(true); 
//        }
//        flagTextarea2++;           
//        
//    }
//    
//    
//    private void lvl21btn21(ActionEvent event) {
//        flagOl2++;
//        
//    }
//    private void lvl21btn15(ActionEvent event) {
//        if (flagOl2==1) {
//           lv2ol_L1.setVisible(true);
//           flagOl2++;
//        }
//    }
//    private void lvl21btn16(ActionEvent event) {
//         if (flagOl2==2) {
//           lv2ol_L2.setVisible(true);
//           flagOl2++;
//        }
//    }
//    private void lvl21btn17(ActionEvent event) {
//         if (flagOl2==3) {
//           lv2ol_L3.setVisible(true);
//           flagOl2++;
//        }
//    }
//    private void lvl21btn18(ActionEvent event) {
//         if (flagOl2==4) {
//           lv2ol_L4.setVisible(true);
//           flagOl2++;
//        }
//    }
//    private void lvl21btn12(ActionEvent event) {
//         if (flagOl2==5) {
//           lv2ol_L5.setVisible(true);
//           flagOl2++;
//        }
//    }
//    private void lvl21btn6(ActionEvent event) {
//         if (flagOl2==6) {
//           lv2ol_L6.setVisible(true);
//           flagOl2++;
//        }
//    }
//    private void lvl21btn5(ActionEvent event) {
//         if (flagOl2==7) {
//           lv2ol_L7.setVisible(true);
//           flagOl2++;
//        }
//    }
//    private void lvl21btn4(ActionEvent event) {
//         if (flagOl2==8) {
//           lv2ol_L8.setVisible(true);
//           lvl2olOpn.setVisible(true);
//           lvl2olCls.setVisible(true);
//           lvl2_score +=2;
//           lv2_score.setText("" + lvl2_score);
//           
//        }
//         flagOl2++;
//    }
//    
//    
//    private void lvl21btn8(ActionEvent event) {
//        flagLabel2++;
//    }
//    private void lvl21btn9(ActionEvent event) {
//        if (flagLabel2==1) {
//            lv2label_L1.setVisible(true);
//            flagLabel2++;           
//        }
//    }
//    private void lvl21btn10(ActionEvent event) {
//        if (flagLabel2==2) {
//            lv2label_L2.setVisible(true);
//            flagLabel2++;           
//        }
//    }
//    private void lvl21btn11(ActionEvent event) {
//        if (flagLabel2==3) {
//            lvl2labelOpn.setVisible(true);
//            lvl2labelCls.setVisible(true);   
//            lvl2_score +=1;
//            lv2_score.setText("" + lvl2_score);
//        }
//        flagLabel2++;
//    }
//
//    
//    private void lvl21btn14(ActionEvent event) {
//        flagUl2++;
//        lv2ul_L1.setVisible(true);
//    }
//    private void lvl21btn20(ActionEvent event) {
//        if (flagUl2==1) {
//            lv2ul_L2.setVisible(true);
//            flagUl2++;
//        }
//        
//    }
//    private void lvl21btn26(ActionEvent event) {
//        if (flagUl2==2) {
//            lv2ul_L3.setVisible(true);
//            flagUl2++;
//        }
//    }
//    private void lvl21btn27(ActionEvent event) {
//        if (flagUl2==3) {
//            lv2ul_L4.setVisible(true);
//            flagUl2++;
//        }
//    }
//    private void lvl21btn28(ActionEvent event) {
//        if (flagUl2==4) {
//            lv2ul_L5.setVisible(true);
//            flagUl2++;
//        }
//    }
//    private void lvl21btn22(ActionEvent event) {
//        if (flagUl2==5) {
//            lv2ul_L6.setVisible(true);
//            lvl2ulOpn.setVisible(true);
//            lvl2ulCls.setVisible(true);
//            lvl2_score +=2;
//            lv2_score.setText("" + lvl2_score);
//        }
//        flagUl2++;
//    }
//    
//    
//    private void lvl21btn24(ActionEvent event) {
//        flagHtml2++;
//         lv2html_L1.setVisible(true);
//    }
//    private void lvl21btn23(ActionEvent event) {
//        if (flagHtml2==1) {
//            lv2html_L2.setVisible(true);
//            flagHtml2++;
//        }
//        
//    }
//    private void lvl21btn29(ActionEvent event) {
//        if (flagHtml2==2) {
//            lvl2htmlOpn.setVisible(true);
//            lvl2htmlCls.setVisible(true);
//            lvl2headOpn.setVisible(true);
//            lvl2headCls.setVisible(true);
//            lvl2titleOpn.setVisible(true);
//            lvl2titleCls.setVisible(true);
//            lvl2_score +=1;
//            lv2_score.setText("" + lvl2_score);
//        }
//         flagHtml2++;
//    }
//
//    
//    private void lvl21btn19(ActionEvent event) {
//        flagBody2++;
//        lv2body_L1.setVisible(true);
//    }
//    private void lvl21btn25(ActionEvent event) {
//        if (flagBody2==1) {
//            lv2body_L2.setVisible(true);
//             flagBody2++;
//        }
//    }
//    private void lvl21btn31(ActionEvent event) {
//        if (flagBody2==2) {
//            lv2body_L3.setVisible(true);
//             flagBody2++;
//        }
//    }
//    private void lvl21btn32(ActionEvent event) {
//        if (flagBody2==3) {
//            lvl2bodyOpn.setVisible(true);
//            lvl2bodyCls.setVisible(true);
//            lvl2_score +=1;
//            lv2_score.setText("" + lvl2_score);
//        }
//       flagBody2++;
//    }
//
//    
//    private void lvl21btn30(ActionEvent event) {
//        flagLi2++;
//        lv2li_L1.setVisible(true);
//    }
//    private void lvl21btn36(ActionEvent event) {
//        if ( flagLi2==1) {
//            lv2li_L2.setVisible(true);
//             flagLi2++;
//        }
//    }
//    private void lvl21btn35(ActionEvent event) {
//        if ( flagLi2==2) {
//            lv2li_L3.setVisible(true);
//             flagLi2++;
//        }
//    }
//    private void lvl21btn34(ActionEvent event) {
//        if ( flagLi2==3) {
//             lv2li_L4.setVisible(true);
//             flagLi2++;
//        }
//    }
//    private void lvl21btn33(ActionEvent event) {
//        if (flagLi2==4) {
//             lvl2li1Opn.setVisible(true);
//              lvl2li1Cls.setVisible(true);
//              lvl2li2Opn.setVisible(true);
//              lvl2li2Cls.setVisible(true);
//             lvl2_score +=2;
//             lv2_score.setText("" + lvl2_score);
//        }
//        flagLi2++;
//        
//    }
//  //________________________________________________level_three__________________________________________
//    private void lvl3btn24(ActionEvent event) {
//         flagForm3++;
//         lv3form_L1.setVisible(true);
//    }
//
//    private void lvl3btn31(ActionEvent event) {
//        if(flagForm3==1){
//            lv3form_L2.setVisible(true);
//            flagForm3++;
//        }
//    }
//
//    private void lvl3btn30(ActionEvent event) {
//        if(flagForm3==2){
//            lv3form_L3.setVisible(true);
//            flagForm3++;
//        }
//    }
//
//    private void lvl3btn29(ActionEvent event) {
//        if(flagForm3==3){
//            lv3form_L4.setVisible(true);
//            flagForm3++;
//        }
//    }
//
//    private void lvl3btn22(ActionEvent event) {
//        if(flagForm3==4){
//            lv3form_L5.setVisible(true);
//            flagForm3++;
//        }
//    }
//
//    private void lvl3btn15(ActionEvent event) {
//        if(flagForm3==5){
//            lv3form_L6.setVisible(true);
//            flagForm3++;
//        }
//    }
//
//    private void lvl3btn8(ActionEvent event) {
//        if(flagForm3==6){
//            lv3form_L7.setVisible(true);
//            flagForm3++;
//        }
//    }
//
//    private void lvl3btn1(ActionEvent event) {
//        if(flagForm3==7){
//            lv3form_L8.setVisible(true);
//            flagForm3++;
//        }
//    }
//
//    private void lvl3btn2(ActionEvent event) {
//        if(flagForm3==8){
//            lv3form_L9.setVisible(true);
//            flagForm3++;
//        }
//    }
//
//    private void lvl3btn3(ActionEvent event) {
//        if(flagForm3==9){
//            lv3form_L10.setVisible(true);
//            flagForm3++;
//        }
//    }
//
//    private void lvl3btn4(ActionEvent event) {
//        if(flagForm3==10){
//            lvl3formOpn.setVisible(true);
//            lvl3formCls.setVisible(true);
//             lvl3_score +=2;
//             lv3_score.setText("" + lvl3_score);          
//        }
//        flagForm3++;
//    }
//
//    
//    
//    private void lvl3btn32(ActionEvent event) {
//        flagButton3++;
//        lv3button_L1.setVisible(true);
//    }
//
//    private void lvl3btn25(ActionEvent event) {
//        if (flagButton3==1) {
//            lv3button_L2.setVisible(true);
//            flagButton3++;
//        }
//    }
//
//    private void lvl3btn26(ActionEvent event) {
//         if (flagButton3==2) {
//            lv3button_L3.setVisible(true);
//            flagButton3++;
//        }
//    }
//
//    private void lvl3btn27(ActionEvent event) {
//        if (flagButton3==3) {
//            lv3button_L4.setVisible(true);
//            lv3button_L5.setVisible(true);
//            flagButton3++;
//        }
//    }
//
//    private void lvl3btn20(ActionEvent event) {
//        if (flagButton3==4) {
//            lv3button_L6.setVisible(true);
//            flagButton3++;
//        }
//    }
//
//    private void lvl3btn21(ActionEvent event) {
//        if (flagButton3==5) {
//            lv3button_L7.setVisible(true);
//            lv3button_L8.setVisible(true);
//            flagButton3++;
//        }
//    }
//
//    private void lvl3btn14(ActionEvent event) {
//        if (flagButton3==6) {
//            lv3button_L9.setVisible(true);
//            flagButton3++;
//        }
//    }
//
//    private void lvl3btn7(ActionEvent event) {
//        if (flagButton3==7) {
//            lv3button_L10.setVisible(true);
//            lv3button_L11.setVisible(true);
//            flagButton3++;
//        }
//    }
//
//    private void lvl3btn6(ActionEvent event) {
//        if (flagButton3==8) {
//            lv3button_L12.setVisible(true);
//            flagButton3++;
//        }
//    }
//
//    private void lvl3btn5(ActionEvent event) {
//         if (flagButton3==9) {
//            lv3button_L13.setVisible(true);
//            lvl3buttonOpn.setVisible(true);
//             lvl3buttonCls.setVisible(true);
//              lvl3_score +=2;
//             lv3_score.setText("" + lvl3_score);       
//           
//        }
//         flagButton3++;
//    }
//    
//    
//
//    private void lvl3btn36(ActionEvent event) {
//        flagSelect3++;
//        lv3select_L1.setVisible(true);
//    }
//
//    private void lvl3btn43(ActionEvent event) {
//        if (flagSelect3==1) {
//            lv3select_L2.setVisible(true);
//            flagSelect3++;
//        }
//    }
//
//    private void lvl3btn44(ActionEvent event) {
//         if (flagSelect3==2) {
//            lv3select_L3.setVisible(true);
//            flagSelect3++;
//        }
//    }
//
//    private void lvl3btn45(ActionEvent event) {
//        if (flagSelect3==3) {
//            lv3select_L4.setVisible(true);
//            flagSelect3++;
//        }
//    }
//
//    private void lvl3btn46(ActionEvent event) {
//        if (flagSelect3==4) {
//            lv3select_L5.setVisible(true);
//            flagSelect3++;
//        }
//    }
//
//    private void lvl3btn47(ActionEvent event) {
//        if (flagSelect3==5) {
//            lv3select_L6.setVisible(true);
//            flagSelect3++;
//        }
//    }
//
//    private void lvl3btn48(ActionEvent event) {
//        if (flagSelect3==6) {
//            lv3select_L7.setVisible(true);
//            flagSelect3++;
//        }
//    }
//
//    private void lvl3btn49(ActionEvent event) {
//        if (flagSelect3==7) {
//            lv3select_L8.setVisible(true);
//            flagSelect3++;
//        }
//    }
//    private void lvl3btn42(ActionEvent event) {
//         if (flagSelect3==9) {
//            lv3select_L9.setVisible(true);
//            lvl3selectOpn.setVisible(true);
//             lvl3selectCls.setVisible(true);
//              lvl3_score +=2;
//             lv3_score.setText("" + lvl3_score);   
//           
//        }
//         flagSelect3++;
//    }
//    
//    
//
//    private void lvl3btn41(ActionEvent event) {
//        flagOption3++;
//        
//    }
//
//    private void lvl3btn40(ActionEvent event) {
//        if (flagOption3==1) {
//            lv3option_L1.setVisible(true);
//            flagOption3++;
//        }
//    }
//
//    private void lvl3btn39(ActionEvent event) {
//        if (flagOption3==2) {
//             lv3option_L2.setVisible(true);
//            flagOption3++;
//        }
//    }
//
//    private void lvl3btn38(ActionEvent event) {
//        if (flagOption3==3) {
//            lv3option_L3.setVisible(true);
//            flagOption3++;
//        }
//    }
//
//    private void lvl3btn37(ActionEvent event) {
//         if (flagOption3==4) {
//            lvl3option1Opn.setVisible(true);
//             lvl3option1Cls.setVisible(true);
//             lvl3option2Opn.setVisible(true);
//             lvl3option2Cls.setVisible(true);
//              lvl3_score +=1;
//             lv3_score.setText("" + lvl3_score);       
//           
//        }
//         flagOption3++;
//    }
//    
//    
//
//    private void lvl3btn33(ActionEvent event) {
//            flagLegend3++;
//            lv3legend_L1.setVisible(true);
//            
//    }
//
//    private void lvl3btn34(ActionEvent event) {
//        if (flagLegend3==1) {
//             lv3legend_L2.setVisible(true);
//            flagLegend3++;
//        }
//    }
//
//    private void lvl3btn35(ActionEvent event) {
//        if (flagLegend3==2) {
//            lv3legend_L3.setVisible(true);
//            flagLegend3++;
//        }
//    }
//
//    private void lvl3btn28(ActionEvent event) {
//         if (flagLegend3==3) {
//            lvl3legendOpn.setVisible(true);
//             lvl3legendCls.setVisible(true);
//             lvl3_score +=1;
//             lv3_score.setText("" + lvl3_score);       
//        }
//         flagLegend3++;
//    }
//
//    
//    
//    private void lvl3btn23(ActionEvent event) {
//        flagFildset3++;
//        lv3fildset_L1.setVisible(true);      
//    }
//
//    private void lvl3btn16(ActionEvent event) {
//        if (flagFildset3==1) {
//            lv3fildset_L2.setVisible(true);
//            flagFildset3++;
//        }
//    }
//
//    private void lvl3btn9(ActionEvent event) {
//        if (flagFildset3==2) {
//             lv3fildset_L3.setVisible(true);
//            flagFildset3++;
//        }
//    }
//
//    private void lvl3btn10(ActionEvent event) {
//        if (flagFildset3==3) {
//           lv3fildset_L4.setVisible(true);
//            flagFildset3++;
//        }
//    }
//
//    private void lvl3btn11(ActionEvent event) {
//         if (flagFildset3==4) {
//             lvl3fildsetOpn.setVisible(true);
//             lvl3fildsetCls.setVisible(true);
//             lvl3_score +=1;
//             lv3_score.setText("" + lvl3_score);       
//           
//        }
//         flagFildset3++;
//    }
//    
//    
//
//    private void lvl3btn17(ActionEvent event) {
//        flagLabel3++;
//        lv3label_L1.setVisible(true);      
//    }
//
//    private void lvl3btn18(ActionEvent event) {
//        if (flagLabel3==1) {
//            lv3label_L2.setVisible(true);
//            flagLabel3++;
//        }
//    }
//
//    private void lvl3btn19(ActionEvent event) {
//        if (flagLabel3==2) {
//             lv3label_L3.setVisible(true);
//            flagLabel3++;
//        }
//    }
//
//    private void lvl3btn12(ActionEvent event) {
//        if (flagLabel3==3) {
//            lv3label_L4.setVisible(true);
//            flagLabel3++;
//        }
//    }
//
//    private void lvl3btn13(ActionEvent event) {
//         if (flagLabel3==4) {
//              lv3label_L5.setVisible(true);
//            lvl3labelOpn.setVisible(true);
//             lvl3labelCls.setVisible(true);
//             lvl3_score +=1;
//             lv3_score.setText("" + lvl3_score);       
//           
//        }
//         flagLabel3++;
//    }
//    
//
//  
//
//
// 
//
//
//    
//    

 
}