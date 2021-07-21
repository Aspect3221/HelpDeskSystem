import java.io.File;

/**
 * Main
 */

public class Main {

    public static void main(String[] args) {
        
        //objects
        Desk desk = new Desk();
        File usersFolder = new File("Users");
        File ticketFolder = new File("Tickets");

        //check availability of folders
        if (usersFolder.exists()==false) {
            usersFolder.mkdirs();
        }
        if (ticketFolder.exists()==false) {
            ticketFolder.mkdirs();
        }

        //start the system from the login screen
        desk.startup();

    }

}