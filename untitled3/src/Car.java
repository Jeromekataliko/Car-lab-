import java.awt.*;
import javax.swing.*;

public class Car {
    private int year;
    private Model model;
    private Color color;

    // Constructor
    public Car(int year, Model model, Color color) {
        this.year = year;
        this.model = model;
        this.color = color;
    }

    // Display method
    public String getDetails() {
        return "Year: " + year + "\nModel: " + model + "\nColor: " + color;
    }
}

