import GUI_Interfaces.*;

import javax.swing.*;

public class Application {

    public static void main(String[] args) throws InterruptedException {

        HomePageGUI homeGUI = new HomePageGUI();
        homeGUI.setVisible(true);

        while(homeGUI.getView() == View.NONE) {
            Thread.sleep(1);
        }

        System.out.println("reached");
        JFrame gui;

        switch (homeGUI.getView()) {
            case ADMIN:
                gui = new AdminGUI();
                break;

            case LOCATOR:
                gui = new LocatorGUI();
                break;

            case CUSTOMER:
                gui = new CustomerGUI();
                break;

            case MARKETING:
                gui = new MarketingGUI();
                break;

            default:
                gui = null;
        }

        homeGUI.setVisible(false);
        gui.setVisible(true);
    }
}
