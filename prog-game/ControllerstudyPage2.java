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
public class ControllerstudyPage2 implements Initializable {

  //  @FXML
   // private MediaView Slvl1;
    
    @FXML
    private MediaView Slvl2;
    
   // @FXML
   // private MediaView Slvl3;

    //@FXML
    //private Button Plvl1;

 //   @FXML
  //  private Button stoplvl1;
    
     @FXML
    private Button Plvl2;

    @FXML
    private Button stoplvl2;
    
    //  @FXML
   // private Button Plvl3;

    //@FXML
   // private Button stoplvl3;
    
    

   /* private File f1;
    private Media m1;
    private MediaPlayer r1;*/
    
    private File f2;
    private Media m2;
    private MediaPlayer r2;
    
    /* private File f3;
    private Media m3;
    private MediaPlayer r3;*/
    
    
   /* @FXML
    ImageView lv1star1;
    @FXML
    ImageView lv1star2;
    @FXML
    ImageView lv1star3;
    @FXML
    ImageView lv1star4;
    @FXML
    ImageView lv1star5;

    @FXML
    ImageView lv2star1;
    @FXML
    ImageView lv2star2;
    @FXML
    ImageView lv2star3;
    @FXML
    ImageView lv2star4;
    @FXML
    ImageView lv2star5;

    @FXML
    ImageView lv3star1;
    @FXML
    ImageView lv3star2;
    @FXML
    ImageView lv3star3;
    @FXML
    ImageView lv3star4;
    @FXML
    ImageView lv3star5;
    @FXML
    TextArea txtArea1;
    @FXML
    TextArea txtArea2;
    @FXML
    TextArea txtArea3;

    Study s1 = new Study();
   Study s2 = new Study();
    Study s3 = new Study();
    
    int flag1;
    int flag2;
    int flag3;*/

     Player player;
  /* @FXML
   private Label score_label_study_page1;
    @FXML
    private Label level_label_study_page1;*/
    @FXML
   private Label score_label_study_page2;
    @FXML
    private Label level_label_study_page2;
   /*  @FXML
 /*  private Label score_label_study_page3;
    @FXML
    private Label level_label_study_page3;
     @FXML
    private Label level_label_review_page1;
      @FXML
    private Label level_label_review_page2;
       @FXML
    private Label level_label_review_page3;*/
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        player = ControllerLogIn_.currentPlayer;
       /* score_label_study_page1.setText(player.getPscore().toString());
        level_label_study_page1.setText(player.getPlevel().toString());*/
       score_label_study_page2.setText(player.getPscore().toString());
         level_label_study_page2.setText(player.getPlevel().toString());
        /*score_label_study_page3.setText(player.getPscore().toString());
        level_label_study_page3.setText(player.getPlevel().toString());
        level_label_review_page1.setText(player.getPlevel().toString());
        level_label_review_page2.setText(player.getPlevel().toString());
        level_label_review_page3.setText(player.getPlevel().toString());*/
        
        /* f1 =new File( "C:\\Users\\Jonab\\Desktop\\vidLevelone.mp4");
        m1 = new Media(f1.toURI().toString());
        r1 = new MediaPlayer(m1);
        Slvl1.setMediaPlayer(r1); */
        
       // f2 =new File( "C:\\Users\\cmmm6\\Desktop\\lvl2.mp4");
        f2 = new File("C:\\Users\\Jonab\\Desktop\\vidLevelTwo.mp4");
        m2 = new Media(f2.toURI().toString());
        r2 = new MediaPlayer(m2);
        Slvl2.setMediaPlayer(r2);
        
        /* f3 =new File( "\"C:\\Users\\Jonab\\Desktop\\vidThree.mp4\"");
        m3 = new Media(f3.toURI().toString());
        r3 = new MediaPlayer(m3);
        Slvl3.setMediaPlayer(r3);*/
    }
    
   /* @FXML
    private void lvl2btnStar1(ActionEvent event) {
        flag2=1;
        lv2star1.setVisible(true);
    }

    @FXML
    private void lvl2btnStar2(ActionEvent event) {
        flag2=2;
        lv2star1.setVisible(true);
        lv2star2.setVisible(true);
    }

    @FXML
    private void lvl2btnStar3(ActionEvent event) {
        flag2=3;
        lv2star1.setVisible(true);
        lv2star2.setVisible(true);
        lv2star3.setVisible(true);


    }

    @FXML
    private void lvl2btnStar4(ActionEvent event) {
        flag2=4;
        lv2star1.setVisible(true);
        lv2star2.setVisible(true);
        lv2star3.setVisible(true);
        lv2star4.setVisible(true);

    }

    @FXML
    private void lvl2btnStar5(ActionEvent event) {
        flag2=5;
        lv2star1.setVisible(true);
        lv2star2.setVisible(true);
        lv2star3.setVisible(true);
        lv2star4.setVisible(true);
        lv2star5.setVisible(true);

    }*/

  /*  @FXML
    private void lvl2reviewFinish(ActionEvent event) throws IOException {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction tr = s.beginTransaction();
        
        switch (flag2) {
            case 1:
                s2.setSrate(1);
                break;
            case 2:
                s2.setSrate(2);
                break;
            case 3:
                s2.setSrate(3);
                break;
            case 4:
                s2.setSrate(4);
                break;
            case 5:
                s2.setSrate(5);
                break;
            default:
                break;
        }
        
        StudyId ss = new StudyId(player.getPid(), 2);
        s2.setId(ss);
        s2.setScomment(txtArea2.getText());
        s.save(s2);
        tr.commit();
        s.close();

        Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLstudy_play.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void lvl2reviewBack(ActionEvent event) throws IOException {
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLstudyPage2.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    */
    
    @FXML
    private void lvl2studyPlay(ActionEvent event) {
        r2.play();
    }

    @FXML
    private void lvl2studyPush(ActionEvent event) {
        r2.pause();
    }

    @FXML
    private void lvl2studyReview(ActionEvent event) throws IOException {
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLreview.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void lvl2studyBack(ActionEvent event) throws IOException {
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLstudy_play.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}