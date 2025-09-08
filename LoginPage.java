import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage extends JFrame implements ActionListener {
    private JTextField userField;
    private JPasswordField passField;
    private JButton loginButton;
    private JLabel statusLabel;

    public LoginPage() {
        setTitle("Login Page");
        setSize(300, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(3, 2));

        panel.add(new JLabel("Username:"));
        userField = new JTextField();
        panel.add(userField);

        panel.add(new JLabel("Password:"));
        passField = new JPasswordField();
        panel.add(passField);

        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        panel.add(loginButton);

        statusLabel = new JLabel("");
        panel.add(statusLabel);

        add(panel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = userField.getText();
        String password = new String(passField.getPassword());

        // Simple authentication logic (replace with your own)
        if(username.equals("admin") && password.equals("password")) {
            statusLabel.setText("Login successful!");
        } else {
            statusLabel.setText("Invalid credentials.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginPage frame = new LoginPage();
            frame.setVisible(true);
        });
    }
}