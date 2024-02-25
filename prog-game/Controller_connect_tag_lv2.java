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
public class Controller_connect_tag_lv2 implements Initializable {
    
 int flagTitle , flagH1 , flagHead , flagHtml , flagBody , flagP= 0;
 int flagHtml2 , flagLi2 , flagUl2 , flagLabel2 , flagBody2 , flagOl2, flagTextarea2= 0;
  int flagForm3 , flagFildset3 , flagButton3 , flagLabel3, flagLegend3 , flagSelect3, flagOption3= 0;
 int lvl1_score ,lvl2_score , lvl3_score = 0;
 
    @FXML
    private Line lv2textarea_L4;
    @FXML
    private Line lv2textarea_L1;
    @FXML
    private Line lv2ol_L6;
    @FXML
    private Line lv2label_L1;
    @FXML
    private Line lv2label_L2;
    @FXML
    private Line lv2ol_L3;
    @FXML
    private Line lv2ol_L4;
    @FXML
    private Line lv2li_L3;
    @FXML
    private Line lv2li_L4;
    @FXML
    private Line lv2ul_L4;
    @FXML
    private Line lv2ul_L1;
    @FXML
    private Line lv2body_L1;
    @FXML
    private Label lvl2headOpn;
    @FXML
    private Label lvl2headCls;
    @FXML
    private Label lvl2titleOpn;
    @FXML
    private Label lvl2titleCls;
    @FXML
    private Label lvl2bodyOpn;
    @FXML
    private Label lvl2bodyCls;
    @FXML
    private Label lvl2htmlCls;
    @FXML
    private Label lvl2htmlOpn;
    @FXML
    private Label lvl2labelOpn;
    @FXML
    private Label lvl2labelCls;
    @FXML
    private Label lvl2olOpn;
    @FXML
    private Label lvl2olCls;
    @FXML
    private Label lvl2li1Opn;
    @FXML
    private Label lvl2li1Cls;
    @FXML
    private Label lvl2ulOpn;
    @FXML
    private Label lvl2ulCls;
    @FXML
    private Label lvl2li2Opn;
    @FXML
    private Label lvl2li2Cls;
    @FXML
    private Line lv2textarea_L3;
    @FXML
    private Line lv2textarea_L2;
    @FXML
    private Line lv2ul_L3;
    @FXML
    private Line lv2ul_L2;
    @FXML
    private Line lv2ul_L5;
    @FXML
    private Line lv2ul_L6;
    @FXML
    private Line lv2body_L3;
    @FXML
    private Line lv2body_L2;
    @FXML
    private Line lv2ol_L2;
    @FXML
    private Line lv2ol_L1;
    @FXML
    private Line lv2ol_L5;
    @FXML
    private Line lv2ol_L7;
    @FXML
    private Line lv2ol_L8;
    @FXML
    private Line lv2li_L2;
    @FXML
    private Line lv2li_L1;
    @FXML
    private Line lv2html_L1;
    @FXML
    private Line lv2html_L2;
    @FXML
    private Label lv2_score;
    private Label lvl2_textareaOpn;
    private Label lvl2_textareaCls;
    private Line lv3fildset_L4;
    private Line lv3fildset_L1;
    private Line lv3button_L10;
    private Line lv3label_L1;
    private Line lv3button_L3;
    private Line lv3option_L2;
    private Line lv3option_L3;
    private Line lv3option_L1;
    private Line lv3select_L7;
    private Line lv3legend_L1;
    private Line lv3form_L7;
    private Line lv3form_L6;
    private Line lv3form_L3;
    private Line lv3form_L10;
    private Line lv3form_L5;
    private Line lv3select_L6;
    private Line lv3select_L5;
    private Line lv3select_L4;
    private Line lv3select_L3;
    private Line lv3button_L13;
    private Line lv3form_L9;
    private Line lv3fildset_L3;
    private Line lv3fildset_L2;
    private Line lv3select_L9;
    private Line lv3button_L9;
    private Line lv3button_L4;
    private Line lv3button_L11;
    private Line lv3button_L12;
    private Line lv3button_L5;
    private Line lv3button_L6;
    private Line lv3legend_L3;
    private Line lv3button_L8;
    private Line lv3select_L1;
    private Line lv3label_L5;
    private Line lv3form_L4;
    private Line lv3select_L8;
    private Line lv3select_L2;
    private Line lv3legend_L2;
    private Line lv3form_L8;
    private Line lv3form_L1;
    private Line lv3form_L2;
    private Line lv3button_L7;
    private Line lv3button_L2;
    private Line lv3button_L1;
    private Line lv3label_L4;
    private Line lv3label_L2;
    private Line lv3label_L3;
    private Label lvl3fildsetOpn;
    private Label lvl3formOpn;
    private Label lvl3fildsetCls;
    private Label lvl3formCls;
    private Label lvl3legendOpn;
    private Label lvl3legendCls;
    private Label lvl3selectOpn;
    private Label lvl3option2Cls;
    private Label lvl3buttonOpn;
    private Label lvl3option2Opn;
    private Label lvl3selectCls;
    private Label lvl3buttonCls;
    private Label lvl3option1Cls;
    private Label lvl3option1Opn;
    private Label lvl3labelCls;
    private Label lvl3labelOpn;
    private Label lv3_score;
    @FXML
    private Button lvl21btn28;
    @FXML
    private Button lvl21btn14;
    @FXML
    private Button lvl21btn15;
    @FXML
    private Button lvl21btn18;
    @FXML
    private Button lvl21btn20;
    @FXML
    private Button lvl21btn21;
    @FXML
    private Button lvl21btn24;
    @FXML
    private Button lvl21btn26;
    @FXML
    private Button lvl21btn27;
    @FXML
    private Button lvl21btn23;
    @FXML
    private Button lvl21btn30;
    @FXML
    private Button lvl21btn32;
    @FXML
    private Button lvl21btn33;
    @FXML
    private Button lvl21btn36;
    @FXML
    private Button lvl21btn9;
    @FXML
    private Button lvl21btn10;
    @FXML
    private Button lvl21btn11;
    @FXML
    private Button lvl21btn16;
    @FXML
    private Button lvl21btn22;
    @FXML
    private Button lvl21btn29;
    @FXML
    private Button lvl21btn34;
    @FXML
    private Button lvl21btn35;
    @FXML
    private Button lvl21btn17;
    @FXML
    private Button lvl21btn12;
    @FXML
    private Button lvl21btn8;
    @FXML
    private Button lvl21btn4;
    @FXML
    private Button lvl21btn7;
    @FXML
    private Button lvl21btn5;
    @FXML
    private Button lvl21btn13;
    @FXML
    private Button lvl21btn31;
    @FXML
    private Button lvl21btn6;
    @FXML
    private Button lvl21btn3;
    @FXML
    private Button lvl21btn1;
    @FXML
    private Button lvl21btn19;
    @FXML
    private Button lvl21btn2;
    @FXML
    private Button lvl21btn25;
    @FXML
    private Label lvl2textareaOpn;
    @FXML
    private Label lvl2textareaCls;
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
      //________________________________________________level_two_______________________________________

    @FXML
    private void lvl21btn13(ActionEvent event) {
        flagTextarea2++;
         lv2textarea_L1.setVisible(true);
    }
    @FXML
    private void lvl21btn7(ActionEvent event) {
        if (flagTextarea2==1) {
            lv2textarea_L2.setVisible(true);
            flagTextarea2++;           
        }
    }
    @FXML
    private void lvl21btn1(ActionEvent event) {
        if (flagTextarea2==2) {
            lv2textarea_L3.setVisible(true);
            flagTextarea2++;           
        }
    }
    @FXML
    private void lvl21btn2(ActionEvent event) {
        if (flagTextarea2==3) {
            lv2textarea_L4.setVisible(true);
            flagTextarea2++;           
        }
    }
    @FXML
    private void lvl21btn3(ActionEvent event) {
        if (flagTextarea2==4) {
            lvl2_score +=1;
            lv2_score.setText("" + lvl2_score);
            lvl2_textareaOpn.setVisible(true);
            lvl2_textareaCls.setVisible(true); 
        }
        flagTextarea2++;           
        
    }
    
    
    @FXML
    private void lvl21btn21(ActionEvent event) {
        flagOl2++;
        
    }
    @FXML
    private void lvl21btn15(ActionEvent event) {
        if (flagOl2==1) {
           lv2ol_L1.setVisible(true);
           flagOl2++;
        }
    }
    @FXML
    private void lvl21btn16(ActionEvent event) {
         if (flagOl2==2) {
           lv2ol_L2.setVisible(true);
           flagOl2++;
        }
    }
    @FXML
    private void lvl21btn17(ActionEvent event) {
         if (flagOl2==3) {
           lv2ol_L3.setVisible(true);
           flagOl2++;
        }
    }
    @FXML
    private void lvl21btn18(ActionEvent event) {
         if (flagOl2==4) {
           lv2ol_L4.setVisible(true);
           flagOl2++;
        }
    }
    @FXML
    private void lvl21btn12(ActionEvent event) {
         if (flagOl2==5) {
           lv2ol_L5.setVisible(true);
           flagOl2++;
        }
    }
    @FXML
    private void lvl21btn6(ActionEvent event) {
         if (flagOl2==6) {
           lv2ol_L6.setVisible(true);
           flagOl2++;
        }
    }
    @FXML
    private void lvl21btn5(ActionEvent event) {
         if (flagOl2==7) {
           lv2ol_L7.setVisible(true);
           flagOl2++;
        }
    }
    @FXML
    private void lvl21btn4(ActionEvent event) {
         if (flagOl2==8) {
           lv2ol_L8.setVisible(true);
           lvl2olOpn.setVisible(true);
           lvl2olCls.setVisible(true);
           lvl2_score +=2;
           lv2_score.setText("" + lvl2_score);
           
        }
         flagOl2++;
    }
    
    
    @FXML
    private void lvl21btn8(ActionEvent event) {
        flagLabel2++;
    }
    @FXML
    private void lvl21btn9(ActionEvent event) {
        if (flagLabel2==1) {
            lv2label_L1.setVisible(true);
            flagLabel2++;           
        }
    }
    @FXML
    private void lvl21btn10(ActionEvent event) {
        if (flagLabel2==2) {
            lv2label_L2.setVisible(true);
            flagLabel2++;           
        }
    }
    @FXML
    private void lvl21btn11(ActionEvent event) {
        if (flagLabel2==3) {
            lvl2labelOpn.setVisible(true);
            lvl2labelCls.setVisible(true);   
            lvl2_score +=1;
            lv2_score.setText("" + lvl2_score);
        }
        flagLabel2++;
    }

    
    @FXML
    private void lvl21btn14(ActionEvent event) {
        flagUl2++;
        lv2ul_L1.setVisible(true);
    }
    @FXML
    private void lvl21btn20(ActionEvent event) {
        if (flagUl2==1) {
            lv2ul_L2.setVisible(true);
            flagUl2++;
        }
        
    }
    @FXML
    private void lvl21btn26(ActionEvent event) {
        if (flagUl2==2) {
            lv2ul_L3.setVisible(true);
            flagUl2++;
        }
    }
    @FXML
    private void lvl21btn27(ActionEvent event) {
        if (flagUl2==3) {
            lv2ul_L4.setVisible(true);
            flagUl2++;
        }
    }
    @FXML
    private void lvl21btn28(ActionEvent event) {
        if (flagUl2==4) {
            lv2ul_L5.setVisible(true);
            flagUl2++;
        }
    }
    @FXML
    private void lvl21btn22(ActionEvent event) {
        if (flagUl2==5) {
            lv2ul_L6.setVisible(true);
            lvl2ulOpn.setVisible(true);
            lvl2ulCls.setVisible(true);
            lvl2_score +=2;
            lv2_score.setText("" + lvl2_score);
        }
        flagUl2++;
    }
    
    
    @FXML
    private void lvl21btn24(ActionEvent event) {
        flagHtml2++;
         lv2html_L1.setVisible(true);
    }
    @FXML
    private void lvl21btn23(ActionEvent event) {
        if (flagHtml2==1) {
            lv2html_L2.setVisible(true);
            flagHtml2++;
        }
        
    }
    @FXML
    private void lvl21btn29(ActionEvent event) {
        if (flagHtml2==2) {
            lvl2htmlOpn.setVisible(true);
            lvl2htmlCls.setVisible(true);
            lvl2headOpn.setVisible(true);
            lvl2headCls.setVisible(true);
            lvl2titleOpn.setVisible(true);
            lvl2titleCls.setVisible(true);
            lvl2_score +=1;
            lv2_score.setText("" + lvl2_score);
        }
         flagHtml2++;
    }

    
    @FXML
    private void lvl21btn19(ActionEvent event) {
        flagBody2++;
        lv2body_L1.setVisible(true);
    }
    @FXML
    private void lvl21btn25(ActionEvent event) {
        if (flagBody2==1) {
            lv2body_L2.setVisible(true);
             flagBody2++;
        }
    }
    @FXML
    private void lvl21btn31(ActionEvent event) {
        if (flagBody2==2) {
            lv2body_L3.setVisible(true);
             flagBody2++;
        }
    }
    @FXML
    private void lvl21btn32(ActionEvent event) {
        if (flagBody2==3) {
            lvl2bodyOpn.setVisible(true);
            lvl2bodyCls.setVisible(true);
            lvl2_score +=1;
            lv2_score.setText("" + lvl2_score);
        }
       flagBody2++;
    }

    
    @FXML
    private void lvl21btn30(ActionEvent event) {
        flagLi2++;
        lv2li_L1.setVisible(true);
    }
    @FXML
    private void lvl21btn36(ActionEvent event) {
        if ( flagLi2==1) {
            lv2li_L2.setVisible(true);
             flagLi2++;
        }
    }
    @FXML
    private void lvl21btn35(ActionEvent event) {
        if ( flagLi2==2) {
            lv2li_L3.setVisible(true);
             flagLi2++;
        }
    }
    @FXML
    private void lvl21btn34(ActionEvent event) {
        if ( flagLi2==3) {
             lv2li_L4.setVisible(true);
             flagLi2++;
        }
    }
    @FXML
    private void lvl21btn33(ActionEvent event) {
        if (flagLi2==4) {
             lvl2li1Opn.setVisible(true);
              lvl2li1Cls.setVisible(true);
              lvl2li2Opn.setVisible(true);
              lvl2li2Cls.setVisible(true);
             lvl2_score +=2;
             lv2_score.setText("" + lvl2_score);
        }
        flagLi2++;
        
    }  
    
    @FXML
       private void lvl2ConnectTagBackBtn(ActionEvent event) throws IOException {
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLPlayPage.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void lvl2ConnectTagFinishBtn(ActionEvent event) throws IOException {
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        //Player p = ControllerLogIn_.currentPlayer;
        int currentScore = player.getPscore();
        player.setPscore(currentScore+lvl2_score);
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


