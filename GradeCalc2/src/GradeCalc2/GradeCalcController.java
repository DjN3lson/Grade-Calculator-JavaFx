package GradeCalc2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class GradeCalcController {

    @FXML
    private Button calculate;

    @FXML
    private TextField grade1Box;

    @FXML
    private Label grade1Credit;

    @FXML
    private Label grade2Credit;

    @FXML
    private TextField grade2box;

    @FXML
    private TextField grade3Box;

    @FXML
    private Label grade3Credit;

    @FXML
    private TextField grade4Box;

    @FXML
    private Label grade4Credit;

    @FXML
    private TextField grade5Box;

    @FXML
    private Label grade5Credit;

    @FXML
    private Label gradeAverageBox;

    @FXML
    void Value1Credit(ActionEvent event) 
    {
        double value1 = Double.parseDouble(grade1Box.getText());
        if (value1 >= 50)
        {
            grade1Credit.setText("1");
        }
        else
        {
            grade1Credit.setText("0");
        }
    }

    @FXML
    void Value2Credit(ActionEvent event) 
    {
        double value2 = Double.parseDouble(grade2box.getText());
        if (value2 >= 50)
        {
            grade2Credit.setText("1");
        }
        else
        {
            grade2Credit.setText("0");
        }
    }

    @FXML
    void Value3Credit(ActionEvent event) 
    {
        double value3 = Double.parseDouble(grade3Box.getText());
        if (value3 >= 50)
        {
            grade3Credit.setText("1");
        }
        else
        {
            grade3Credit.setText("0");
        }
    }

    @FXML
    void Value4Credit(ActionEvent event) 
    {
        double value4 = Double.parseDouble(grade4Box.getText());
        if (value4 >= 50)
        {
            grade4Credit.setText("1");
        }
        else
        {
            grade4Credit.setText("0");
        }
    }

    @FXML
    void Value5Credit(ActionEvent event) 
    {
        double value5 = Double.parseDouble(grade5Box.getText());
        if (value5 >= 50)
        {
            grade5Credit.setText("1");
        }
        else
        {
            grade5Credit.setText("0");
        }
    }
    
        

    @FXML
    void calculateAverage(ActionEvent event) 
    {
        //Parsing the Entered Values from the TextBoxes to Double:
        double value1 = Double.parseDouble(grade1Box.getText());
        double value2 = Double.parseDouble(grade2box.getText());
        double value3 = Double.parseDouble(grade3Box.getText());
        double value4 = Double.parseDouble(grade4Box.getText());
        double value5 = Double.parseDouble(grade5Box.getText());

        double sum = value1 + value2 + value3 + value4 + value5;
        double average = sum / 5;

        gradeAverageBox.setText("Average Grade: " + average + " %");

    }


}
