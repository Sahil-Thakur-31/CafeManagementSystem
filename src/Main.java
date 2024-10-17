/**
 * The main driver program of the books account application that instantiate
 * and display the login window for user to login to the system.
 * 
 * @author
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // instantiate the DB class for database connectivity and operations
       DataBaseHandler db = new DataBaseHandler();
        //initialize the database
       db.init();
        
        // instantiate the BooksAccountManager object
     //   BooksAccountManager booksAccountManager = new BooksAccountManager();
        
        // instantiate LoginFrame for user login window
       LoginFrame loginFrame =new LoginFrame();
        
        // set the size and position at center screen
       //loginFrame.setSize(850,600);
       loginFrame.setLocation(200,100);
       //loginFrame.setLocationRelativeTo(null);
        loginFrame.setVisible(true);
       loginFrame.setResizable(false);
       
       
    }
    
}
