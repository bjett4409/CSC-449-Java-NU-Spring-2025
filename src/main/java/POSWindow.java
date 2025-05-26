import javax.swing.*;

public class POSWindow extends JFrame {

    public POSWindow() {
        setTitle("POS-R-Us");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // UI Components
        JLabel barcodeLabel = new JLabel("Product ID:");
        barcodeLabel.setBounds(30, 30, 100, 25);
        add(barcodeLabel);

        JTextField barcodeField = new JTextField();
        barcodeField.setBounds(130, 30, 150, 25);
        add(barcodeField);

        JButton scanButton = new JButton("Scan");
        scanButton.setBounds(300, 30, 100, 25);
        add(scanButton);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(30, 70, 100, 25);
        add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(130, 70, 150, 25);
        add(nameField);

        // Add more UI components and logic here...
    }
}
