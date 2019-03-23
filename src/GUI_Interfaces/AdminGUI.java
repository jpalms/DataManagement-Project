package GUI_Interfaces;

import javax.swing.*;
import java.awt.*;

public class AdminGUI extends JFrame {

    //The text field on the GUI in which to enter the SQL command
    private JTextField text;

    //The string to store the command into
    private String sqlCommand = "";

    /**
     * Constructor
     */
    public AdminGUI() {
        //Basic GUI set-up stuff
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Admin Page");
        this.setSize(500, 400);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());

        //All the necessary components for the GUI
        JLabel label = new JLabel("Enter a SQL Command: ");
        text = new JTextField(20);
        JButton submit = new JButton("Submit");

        //Add functionality to the button
        submit.addActionListener( e -> sqlCommand = text.getText() );

        //Add the components to the actual view
        this.add(label);
        this.add(text);
        this.add(submit);
    }

    /**
     * @return sqlCommand
     */
    public String getSqlCommand() {
        return sqlCommand;
    }

    /**
     * Set the SQL Command
     * @param sqlCommand - what to set this.sqlCommand to
     */
    public void setSqlCommand(String sqlCommand) {
        this.sqlCommand = sqlCommand;
    }
}
