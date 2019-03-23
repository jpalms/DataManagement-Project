import GUI_Interfaces.*;

import javax.swing.*;

public class Application {

    public static void main(String[] args) throws InterruptedException {

        //The main GUI that you first see with the different buttons to go to a different view
        HomePageGUI homeGUI = new HomePageGUI();
        homeGUI.setVisible(true);

        //Keep checking until a button for a view was clicked
        while(homeGUI.getView() == View.NONE) {
            Thread.sleep(1);
        }

        //The new GUI of the new view
        JFrame newGUI;

        //Create the new GUI according to which button was selected
        switch (homeGUI.getView()) {
            case ADMIN:
                newGUI = new AdminGUI();
                break;

            case LOCATOR:
                newGUI = new LocatorGUI();
                break;

            case CUSTOMER:
                newGUI = new CustomerGUI();
                break;

            case MARKETING:
                newGUI = new MarketingGUI();
                break;

            default:
                newGUI = null;
        }

        //Make the transition appear as if it's the same GUI (it really isn't)
        newGUI.setVisible(true);
        homeGUI.setVisible(false);

        //Break off into a separate function to continue runtime specifically for the view selected
        switch (homeGUI.getView()) {
            case ADMIN:
                adminMain((AdminGUI)newGUI);
                break;

            case LOCATOR:

                break;

            case CUSTOMER:

                break;

            case MARKETING:

                break;

            default:
                System.out.println("There was a massive error somehow...");
        }

    }

    /**
     * This function is where the application shifts to whenever we are in the admin view
     * @param gui - the GUI that contains the SQL command to execute
     * @throws InterruptedException because of Thread.sleep()
     */
    private static void adminMain(AdminGUI gui) throws InterruptedException {
        //Basically just loops forever
        while(gui.getSqlCommand().equals("")) {

            //Added in to allow a break for the button listener to actually set the value
            Thread.sleep(0);

            //If something was entered
            if(!gui.getSqlCommand().equals("")) {

                String sqlCommand = gui.getSqlCommand();

                /*

                DO SOMETHING WITH THE SQL COMMAND HERE RATHER THAN PRINTING OUT

                 */
                System.out.println(sqlCommand);

                //Reset the SQL command, so a new one can be entered again
                gui.setSqlCommand("");
            }
        }

    }


}
