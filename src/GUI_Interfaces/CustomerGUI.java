package GUI_Interfaces;

import javax.swing.*;
import java.awt.*;

public class CustomerGUI extends JFrame {

    //All the labels to show the result of a selection
    private JLabel stateResult = new JLabel();
    private JLabel brandResult = new JLabel();
    private JLabel dealerResult = new JLabel();

    /**
     * Constructor
     */
    public CustomerGUI() {
        //Basic GUI set-up stuff
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Customer Page");
        this.setSize(500, 400);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout(6,1));

        //All the arrays of options - this will eventually be derived from the database
        String[] states = {"Alabama, AL", "Alaska, AK", "Arizona, AZ", "Arkansas, AR", "California, CA", "Colorado, CO",
        "Connecticut, CT", "Delaware, DE", "District of Columbia, DC", "Florida, FL", "Georgia, GA", "Hawaii, HI",
        "Idaho, ID", "Illinoi, IL", "Indiana, IN", "Iowa, IA", "Kansas, KS", "Kentucky, KY", "Louisiana, LA",
        "Maine, ME", "Montana, MT", "Nebraska, NE", "Nevada, NV", "New Hampshire, NH", "New Jersey, NJ", "New Mexico, NM",
        "New York, NY", "North Carolina, NC", "North Dakota, ND", "Ohio, OH", "Oklahoma, OK", "Oregon, OR", "Maryland, MD",
        "Massachusetts, MA", "Michigan, MI", "Minnesota, MN", "Mississippi, MS", "Missouri, MO", "Pennsylvania, PA",
        "Rhode Island, RI", "South Carolina, SC", "South Dakota, SD", "Tennessee, TN", "Texas, TX", "Utah, UT", "Vermont, VT",
        "Virginia, VA", "Washington, WA", "West Virginia, WV", "Wisconsin, WI", "Wyoming, WY"};

        String[] brandOptions = {"Buick", "Cadillac", "Chevrolet", "GMC"};

        String[] dealerOptions = {"Pittsburgh, PA", "Rochester, NY", "Buffalo, NY"};

        //Labels, drop-down menus and their functionalities
        JLabel statesLabel = new JLabel("Select state to find a dealer");
        JComboBox selectState = new JComboBox(states);
        selectState.addActionListener( e -> stateResult.setText("Looking for dealers in " + selectState.getSelectedItem() + "..."));

        JLabel brandLabel = new JLabel("Select brand to list all products");
        JComboBox selectBrand = new JComboBox(brandOptions);
        selectBrand.addActionListener( e -> brandResult.setText("Listing all models of " + selectBrand.getSelectedItem() + "..."));

        JLabel dealerLabel = new JLabel("Select dealer to see full inventory");
        JComboBox selectDealer = new JComboBox(dealerOptions);
        selectDealer.addActionListener( e -> dealerResult.setText("Listing all vehicles available at " + selectDealer.getSelectedItem() + "..."));


        //Grouping labels and drop-down menus for cleaner, more organized look
        JPanel state = new JPanel();
        JPanel brand = new JPanel();
        JPanel dealer = new JPanel();

        state.add(statesLabel);
        state.add(selectState);
        brand.add(brandLabel);
        brand.add(selectBrand);
        dealer.add(dealerLabel);
        dealer.add(selectDealer);

        //Add all components/panels to GUI
        this.add(state);
        this.add(stateResult);
        this.add(brand);
        this.add(brandResult);
        this.add(dealer);
        this.add(dealerResult);
    }
}
