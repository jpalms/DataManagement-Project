package GUI_Interfaces;

import javax.swing.*;
import java.awt.*;

public class LocatorGUI extends JFrame {

    //Label showing the result of the query
    private JLabel result = new JLabel("");

    /**
     * Constructor
     */
    public LocatorGUI() {
        //Basic GUI set-up stuff
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Locator Page");
        this.setSize(500, 400);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout(6,1));

        //All the arrays of options - this will eventually be derived from the database
        String[] dealerOptions = {"Pittsburgh, PA", "Rochester, NY", "Buffalo, NY"};
        String[] brandOptions = {"Buick", "Cadillac", "Chevrolet", "GMC"};
        String[] modelOptions = {"Camaro", "Corvette", "Cruze", "Suburban", "Tahoe", "Volt"};
        String[] colorOptions = {"Red", "Orange", "Yellow", "Green", "Blue", "Purple"};

        //Labels and drop-down menus
        JLabel dealerLabel = new JLabel("Select home dealer");
        JComboBox selectDealer = new JComboBox(dealerOptions);

        JLabel brandLabel = new JLabel("Select brand");
        JComboBox selectBrand = new JComboBox(brandOptions);

        JLabel modelLabel = new JLabel("Select model");
        JComboBox selectModel = new JComboBox(modelOptions);

        JLabel colorLabel = new JLabel("Select color");
        JComboBox selectColor = new JComboBox(colorOptions);

        //Button and its functionality
        JButton submit = new JButton("Submit");

        submit.addActionListener( e -> {
            String dealerSelected = (String)selectDealer.getSelectedItem();
            String brandSelected = (String)selectBrand.getSelectedItem();
            String modelSelected = (String)selectModel.getSelectedItem();
            String colorSelected = (String)selectColor.getSelectedItem();
            result.setText("Looking for a " + colorSelected + " " + brandSelected + " " + modelSelected + " at or near "
            + dealerSelected + "...");
        });

        //Grouping labels and drop-down menus for cleaner, more organized look
        JPanel dealer = new JPanel();
        JPanel brand = new JPanel();
        JPanel model = new JPanel();
        JPanel color = new JPanel();

        dealer.add(dealerLabel);
        dealer.add(selectDealer);
        brand.add(brandLabel);
        brand.add(selectBrand);
        model.add(modelLabel);
        model.add(selectModel);
        color.add(colorLabel);
        color.add(selectColor);

        //Add all components/panels to GUI
        this.add(dealer);
        this.add(brand);
        this.add(model);
        this.add(color);
        this.add(submit);
        this.add(result);
    }
}
