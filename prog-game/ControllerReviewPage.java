/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap_project_;

import static ap_project_.ControllerLevelPage.levelBtn;
import ap_project_.ControllerLogIn_;
import ap_project_.ControllerLogIn_;
import ap_project_.ControllerLogIn_;
import ap_project_.HibernateUtil;
import ap_project_.HibernateUtil;
import ap_project_.HibernateUtil;
import ap_project_.Player;
import ap_project_.Player;
import ap_project_.Player;
import ap_project_.Study;
import ap_project_.Study;
import ap_project_.Study;
import ap_project_.StudyId;
import ap_project_.StudyId;
import ap_project_.StudyId;
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
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Jonab
 */
public class ControllerReviewPage implements Initializable {


    @FXML
    ImageView lv1star1;
    @FXML
    ImageView lv1star2;
    @FXML
    ImageView lv1star3;
    @FXML
    ImageView lv1star4;
    @FXML
    ImageView lv1star5;

    Study s1 = new Study();

    int flag1;
    Player player;

    @FXML
    TextArea txtArea1;

    @FXML
    private Label level_label_review_page1;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        player = ControllerLogIn_.currentPlayer;
        level_label_review_page1.setText(player.getPlevel().toString());

    }
    
    @FXML
    private void lvl1btnStar1(ActionEvent event) {

        flag1=1;
        lv1star1.setVisible(true);
        lv1star2.setVisible(false);
        lv1star3.setVisible(false);
        lv1star4.setVisible(false);
        lv1star5.setVisible(false);

    }

    @FXML
    private void lvl1btnStar2(ActionEvent event) {
        flag1=2;
        lv1star1.setVisible(true);
        lv1star2.setVisible(true);
        lv1star3.setVisible(false);
        lv1star4.setVisible(false);
        lv1star5.setVisible(false);


    }

    @FXML
    private void lvl1btnStar3(ActionEvent event) {
        flag1=3;
       lv1star1.setVisible(true);
        lv1star2.setVisible(true);
        lv1star3.setVisible(true);
        lv1star4.setVisible(false);
        lv1star5.setVisible(false);


    }

    @FXML
    private void lvl1btnStar4(ActionEvent event) {
        flag1=4;
        lv1star1.setVisible(true);
        lv1star2.setVisible(true);
        lv1star3.setVisible(true);
        lv1star4.setVisible(true);
        lv1star5.setVisible(false);


    }

    @FXML
    private void lvl1btnStar5(ActionEvent event) {
        flag1=5;
        lv1star1.setVisible(true);
        lv1star2.setVisible(true);
        lv1star3.setVisible(true);
        lv1star4.setVisible(true);
        lv1star5.setVisible(true);

    }

    @FXML
    private void lvl1reviewFinish(ActionEvent event) throws IOException {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction tr = s.beginTransaction();

        switch (flag1) {
            case 1:
                s1.setSrate(1);
                break;
            case 2:
                s1.setSrate(2);
                break;
            case 3:
                s1.setSrate(3);
                break;
            case 4:
                s1.setSrate(4);
                break;
            case 5:
                s1.setSrate(5);
                break;
            default:
                break;
        }

        StudyId ss = new StudyId(player.getPid(), levelBtn);
        s1.setId(ss);
        s1.setScomment(txtArea1.getText());
        s.save(s1);
        tr.commit();
        s.close();

        Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLstudy_play.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void lvl1reviewBack(ActionEvent event) throws IOException {
        if(levelBtn==1){
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLstudyPage1.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        }else if (levelBtn==2){
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLstudyPage2.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        }else if (levelBtn==3){
       Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLstudyPage3.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    
        }
    }

}
