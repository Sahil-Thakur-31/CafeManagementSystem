import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * This class implements the opening and closing of connection with the back end
 * MySQL database for books account application and has operations for query and
 * update on bills and stock items.
 * 
 * @author
 */
 class DataBaseHandler {
    
    
    // username to connect MySQL database
    private String dbUser = "root";
    // password to connect MySQL database
    private String dbPasswd = "admin";
    // name of the database
    private String dbName = "cms";
    // connection to the database
   private static Connection dbConn = null;

    public static Connection getDbConn() {
        return dbConn;
    }

    public static Statement getStmt() {
        return stmt;
    }

    public ResultSet getRs() {
        return rs;
    }
    private static Statement stmt = null;
    private ResultSet rs = null;
    
    /**
     * Class constructor that establishes connection with the underlying
     * MySQL database running locally.
     */
    public DataBaseHandler()
    {
    
    }
        
    
        public void init()
        {
        try 
        {
            // register the JDBC driver to work with
            Class.forName("com.mysql.cj.jdbc.Driver");
            // establish connection with MySQL database
            String driverUrlFormat = "jdbc:mysql://localhost/%s?user=%s&password=%s";
            String dbUrl = String.format(driverUrlFormat, dbName, dbUser, dbPasswd);
            dbConn = DriverManager.getConnection(dbUrl);
            // console log for successfull database connection
            System.out.println("Successfully connected to the database.");
            //dbConn.close();
        } 
        catch(Exception e) 
        {
            // console log the error and exit application
            System.out.println("Database connection FAILED!");
            System.out.println("ERROR: " + e.getMessage());
            System.exit(0);
        }    
        }
    
    
    /**
     * Create all the required database tables if they do not already
     * exists.
     */
   
    
    /**
     * Execute an UPDATE statement in the database.
     * @param sql The SQL update statement
     * @return true if statement was successfully executed, otherwise return false
     */
    public static boolean update(String sql) {
        try {
            stmt = dbConn.createStatement();
            stmt.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            System.out.println("SQL ERROR: " + ex.getMessage());
            return false;
        } finally {
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException ex) {
                }
            }
        }        
    }
    /**
     * Execute an QUERY statement in the database.
     * @param sql The SQL query statement
     * @return The ResultSet of the query statement
     */
    public ResultSet query(String sql) {
        try {
            stmt = dbConn.createStatement();
            rs = stmt.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            System.out.println("SQL ERROR: " + ex.getMessage());
            return null;
        } finally {
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException ex) {
                }
            }
        }
    }
    /**
     * Close the database connection.
     */
    public void close(){
        if(dbConn != null) {
            try {
                dbConn.close();
            } catch (SQLException ex) {
            }
        }
    }
}
