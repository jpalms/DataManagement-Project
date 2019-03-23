package GUI_Interfaces;

import javax.swing.*;
import java.awt.*;

public class MarketingGUI extends JFrame {

    //All the labels to show the result of a selection
    private JLabel brandResult = new JLabel();
    private JLabel dealerResult = new JLabel();

    /**
     * Constructor
     */
    public MarketingGUI() {
        //Basic GUI set-up stuff
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Marketing Page");
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout(4, 1));

        //All the arrays of options - this will eventually be derived from the database
        String[] yearOptions = {"2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010",
                "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019"};

        String[] brandOptions = {"Buick", "Cadillac", "Chevrolet", "GMC"};

        String[] dealerOptions = {"Pittsburgh, PA", "Rochester, NY", "Buffalo, NY"};

        //Labels, drop-down menus, buttons and their functionalities
        JLabel brandLabel = new JLabel("Sales by month for year of ");
        JComboBox yearBrand = new JComboBox(yearOptions);
        JLabel brandLabel2 = new JLabel(" for brand ");
        JComboBox selectBrand = new JComboBox(brandOptions);
        JButton submitBrand = new JButton("Submit");
        submitBrand.addActionListener( e -> brandResult.setText("Finding sales in " + yearBrand.getSelectedItem() + " for " +
                selectBrand.getSelectedItem() + "..."));

        JLabel dealerLabel = new JLabel("Sales by month for year of ");
        JComboBox yearDealer = new JComboBox(yearOptions);
        JLabel dealerLabel2 = new JLabel(" for dealer ");
        JComboBox selectDealer = new JComboBox(dealerOptions);
        JButton submitDealer = new JButton("Submit");
        submitDealer.addActionListener( e -> dealerResult.setText("Finding sales in " + yearDealer.getSelectedItem() + " for " +
                selectDealer.getSelectedItem() + "..."));


        //Grouping labels and drop-down menus for cleaner, more organized look
        JPanel brand = new JPanel();
        brand.add(brandLabel);
        brand.add(yearBrand);
        brand.add(brandLabel2);
        brand.add(selectBrand);
        brand.add(submitBrand);

        JPanel dealer = new JPanel();
        dealer.add(dealerLabel);
        dealer.add(yearDealer);
        dealer.add(dealerLabel2);
        dealer.add(selectDealer);
        dealer.add(submitDealer);

        //Add all components/panels to GUI
        this.add(brand);
        this.add(brandResult);
        this.add(dealer);
        this.add(dealerResult);

    }
}
