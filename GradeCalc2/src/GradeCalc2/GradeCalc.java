package GradeCalc2;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GradeCalc extends Application
//Main App class to Load and Display the GUI:
{
    @Override
    public void start(Stage stage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("GradeCalcFXML.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Grade Average Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}

