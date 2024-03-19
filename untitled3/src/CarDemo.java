import javax.swing.*;

public class CarDemo extends JFrame {
    public CarDemo() {
        setTitle("Car Details");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create two car objects
        Car car1 = new Car(2022, Model.SEDAN, Color.RED);
        Car car2 = new Car(2023, Model.CONVERTIBLE, Color.BLUE);

        // Create text area for displaying car details
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.append("Car 1 Details:\n" + car1.getDetails() + "\n\n");
        textArea.append("Car 2 Details:\n" + car2.getDetails());

        // Add text area to frame
        add(new JScrollPane(textArea));

        setVisible(true);
    }

    public static void main(String[] args) {
        new CarDemo();
    }
}
