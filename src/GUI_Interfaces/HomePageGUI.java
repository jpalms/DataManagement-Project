package GUI_Interfaces;

import javax.swing.*;
import java.awt.*;

public class HomePageGUI extends JFrame {

    private View view;


    public HomePageGUI() {
        view = View.NONE;
        setUpHomeGUI();
    }

    public View getView() {
        return view;
    }

    private void setUpHomeGUI() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Home Page");
        this.setSize(500, 400);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());

        JButton databaseAdmin = new JButton("Database Admin View");
        JButton vehicleLocator = new JButton("Vehicle Locator View");
        JButton onlineCust = new JButton("Online Customer View");
        JButton marketingDept = new JButton("Marketing Department View");

        databaseAdmin.addActionListener( e -> view = View.ADMIN );

        vehicleLocator.addActionListener( e -> view = View.LOCATOR );

        onlineCust.addActionListener( e -> view = View.CUSTOMER );

        marketingDept.addActionListener( e -> view = View.MARKETING );

        this.add(databaseAdmin);
        this.add(vehicleLocator);
        this.add(onlineCust);
        this.add(marketingDept);
    }
}
