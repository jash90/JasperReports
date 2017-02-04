/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasperreports;

import java.io.File;
import java.io.FileFilter;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import net.sf.jasperreports.engine.JRException;
import org.apache.commons.logging.Log;

/**
 *
 * @author ZimnY
 */
public class FXMLDocumentController implements Initializable {

    final DirectoryChooser directoryChooser = new DirectoryChooser();
    @FXML
    private Label folderdocelowy;
    @FXML
    private Label raport1;
    @FXML
    private Label raport2;
    @FXML
    private Label raport3;
    @FXML
    private Label raport4;
    @FXML
    private Label raport5;
    @FXML
    private Label raport6;
    @FXML
    private Button toHTML1;
    @FXML
    private Button toPDF1;
    @FXML
    private Button toHTML2;
    @FXML
    private Button toPDF2;
    @FXML
    private Button toHTML3;
    @FXML
    private Button toPDF3;
    @FXML
    private Button toHTML4;
    @FXML
    private Button toPDF4;
    @FXML
    private Button toHTML5;
    @FXML
    private Button toPDF5;
    @FXML
    private Button toHTML6;
    @FXML
    private Button toPDF6;
    @FXML
    private TextField destination;
    @FXML
    private GridPane pane;
    static Preferences prefs = Preferences.userRoot();

    @FXML
    public void handleButtonAction(ActionEvent event) {
    
        Button b = (Button) event.getSource();
        if (destination.getText().length() > 0) {
            String destinationFileName = destination.getText();

            switch (b.getId()) {
                case "toPDF1":
                    Generowanieraportow.generowanieraportu1pdf(destinationFileName);
                    break;
                case "toHTML1":
                    Generowanieraportow.generowanieraportu1html(destinationFileName);
                    break;
                case "toPDF2":
                    Generowanieraportow.generowanieraportu2pdf(destinationFileName);
                    break;
                case "toHTML2":
                    Generowanieraportow.generowanieraportu2html(destinationFileName);
                    break;
                case "toPDF3":
                    Generowanieraportow.generowanieraportu3pdf(destinationFileName);
                    break;
                case "toHTML3":
                    Generowanieraportow.generowanieraportu3html(destinationFileName);
                    break;
                case "toPDF4":
                    Generowanieraportow.generowanieraportu4pdf(destinationFileName);
                    break;
                case "toHTML4":
                    Generowanieraportow.generowanieraportu4html(destinationFileName);
                    break;
                case "toPDF5":
                    Generowanieraportow.generowanieraportu5pdf(destinationFileName);
                    break;
                case "toHTML5":
                    Generowanieraportow.generowanieraportu5html(destinationFileName);
                    break;
                case "toPDF6":
                    Generowanieraportow.generowanieraportu6pdf(destinationFileName);
                    break;
                case "toHTML6":
                    Generowanieraportow.generowanieraportu6html(destinationFileName);
                    break;
            }

        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Błąd");
            alert.setHeaderText(null);
            alert.setContentText("Proszę wybrać folder docelowy!");
            alert.showAndWait();
        }
        
      

    }

    @FXML
    public void handle(MouseEvent event) throws BackingStoreException {
        File directory = directoryChooser.showDialog(((Node) event.getTarget()).getScene().getWindow());
        if (directory != null) {
            if (directory.exists() && directory.canRead()) {
                destination.setText(directory.getPath());
                prefs.put("path", directory.getPath());
                prefs.flush();
            }
        }
    }
    @FXML
    public void close(ActionEvent event)
    {
       Stage stage =(Stage)pane.getScene().getWindow();
       stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        destination.setText(prefs.get("path", ""));
    }

}
