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
import java.util.List;
import java.util.ResourceBundle;
import static javafx.collections.FXCollections.observableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;
import javafx.collections.*;
import static javafx.collections.FXCollections.observableList;
import org.hibernate.Query;

/**
 * FXML Controller class
 *
 * @author Jonab
 */
public class ControllerstudyPage1 implements Initializable {

    @FXML
    private MediaView Slvl1;

    @FXML
    private Button Plvl1;

    @FXML
    private Button stoplvl1;
    

    private File f1;
    private Media m1;
    private MediaPlayer r1;
    

     Player player;

    @FXML
    private Label level_label_study_page1;
    @FXML
    private Label score_label_study_page1;
      private ListView<?> Rlvl1;
   

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        player = ControllerLogIn_.currentPlayer;
        ObservableList<String> r = FXCollections.observableArrayList();
        Rlvl1 = new ListView<>(r);
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Study> List = null;
        String qStr = "from Study";
        Query query = session.createQuery(qStr);
        List = query.list();
        session.close();
       for(Study s: List)
        {
            r.add( s.getScomment());

        }
     
       /* ObservableList<String> r = FXCollections.observableArrayList();
        Rlvl1 = new ListView<>(r);
        Session session1 = HibernateUtil.getSessionFactory().openSession();
        List<Study> sList = null;
        String queryStr = "from Study";
        Query query = session1.createQuery(queryStr);
        sList = query.list();
        
        session1.close();
      
        for(Study s: sList)
        {
          r.add(s.getScomment());
     
        }*/
        score_label_study_page1.setText(player.getPscore().toString());
        level_label_study_page1.setText(player.getPlevel().toString());
      
        f1 =new File( "C:\\Users\\Jonab\\Desktop\\vidLevelone.mp4");
        m1 = new Media(f1.toURI().toString());
        r1 = new MediaPlayer(m1);
        Slvl1.setMediaPlayer(r1);

    }
    
    @FXML
    private void lvl1studyPlay(ActionEvent event) {
        r1.play();
    }

    @FXML
    private void lvl1studyPush(ActionEvent event) {
        r1.pause();
    }

    @FXML
    private void lvl1studyReview(ActionEvent event) throws IOException {
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLreview.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void lvl1studyBack(ActionEvent event) throws IOException {
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("FXMLstudy_play.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    

}