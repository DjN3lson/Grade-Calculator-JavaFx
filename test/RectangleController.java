package test;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.Rectangle;

public class RectangleController {

    private static final int PERIMETER_FACTOR = 2;

    @FXML
    private TextField widthField;

    @FXML
    private TextField heightField;

    @FXML
    private Label resultLabel;

    @FXML
    private Rectangle rectangle;

    @FXML
    private void handleAreaButtonAction() {
        calculateArea();
    }

    @FXML
    private void handlePerimeterButtonAction() {
        calculatePerimeter();
    }

    private void updateResult(double result, String message) {
        if (result <= 0) {
            resultLabel.setText("Invalid value(s)");
            rectangle.setVisible(false);
        } else {
            resultLabel.setText(message + String.format("%.2f", result));
            rectangle.setWidth(result);
            rectangle.setHeight(result);
            rectangle.setVisible(true);
        }
    }

    public void calculateArea() {
        try {
            double width = Double.parseDouble(widthField.getText());
            double height = Double.parseDouble(heightField.getText());
            double area = width * height;
            updateResult(area, "Area: ");
        } catch (NumberFormatException e) {
            resultLabel.setText("Invalid value(s)");
            rectangle.setVisible(false);
        }
    }

    public void calculatePerimeter() {
        try {
            double width = Double.parseDouble(widthField.getText());
            double height = Double.parseDouble(heightField.getText());
            double perimeter = PERIMETER_FACTOR * (width + height);
            updateResult(perimeter, "Perimeter: ");
        } catch (NumberFormatException e) {
            resultLabel.setText("Invalid value(s)");
            rectangle.setVisible(false);
        }
    }
}
