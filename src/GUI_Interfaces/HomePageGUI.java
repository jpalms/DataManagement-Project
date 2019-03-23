package GUI_Interfaces;

import javax.swing.*;
import java.awt.*;

public class HomePageGUI extends JFrame {

    private View view;

    /**
     * Constructor
     * Sets View to default NONE, then sets up GUI
     */
    public HomePageGUI() {
        view = View.NONE;
        setUpHomeGUI();
    }

    /**
     * Getter function for View
     * @return current View
     */
    public View getView() {
        return view;
    }

    /**
     * Basic set up of GUI
     */
    private void setUpHomeGUI() {
        //Basic GUI set-up stuff
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Home Page");
        this.setSize(500, 400);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());

        //All the buttons
        JButton databaseAdmin = new JButton("Database Admin View");
        JButton vehicleLocator = new JButton("Vehicle Locator View");
        JButton onlineCust = new JButton("Online Customer View");
        JButton marketingDept = new JButton("Marketing Department View");

        //Add functionality to all the buttons
        databaseAdmin.addActionListener( e -> view = View.ADMIN );

        vehicleLocator.addActionListener( e -> view = View.LOCATOR );

        onlineCust.addActionListener( e -> view = View.CUSTOMER );

        marketingDept.addActionListener( e -> view = View.MARKETING );

        //Add all the buttons to the GUI to actually display it
        this.add(databaseAdmin);
        this.add(vehicleLocator);
        this.add(onlineCust);
        this.add(marketingDept);
    }
}
