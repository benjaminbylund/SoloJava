
import javax.swing.*;
import java.sql.*;
/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
*/
public class Databas{

    public static final String DEFAULT_DRIVER_CLASS = "com.mysql.jdbc.Driver";
    public static String hostname = "127.0.0.1";
    public static String dbName = "grabStory";
    public static int port = 3306;
    public static final String DEFAULT_URL = "jdbc:mysql://"+ hostname +":"+port+"/"+dbName;
    private static final String DEFAULT_USERNAME = "benjaminbylund";
    private static final String DEFAULT_PASSWORD = "skola1234";

    public static void main(String[] args) {
        Connection connection = null;
        int id = 150; //random id

        try {
            Class.forName(DEFAULT_DRIVER_CLASS);
            connection = DriverManager.getConnection(DEFAULT_URL, DEFAULT_USERNAME, DEFAULT_PASSWORD);

            // SQL queries goes here
            PreparedStatement ps = null;
            ResultSet rs = null;
            int j = 0;

//            String[] commands = {"adjective_words",};
//            String[] story = new String[5];
            while(true) {
                ps = connection.prepareStatement("SELECT word FROM adjective_words WHERE id= " + id); //adjective word
                rs = ps.executeQuery();
                String adjective = ""; //adjective has 173 words

                while (rs.next() && j == 0) { //adjective
                    adjective = rs.getString("word");
                    System.out.println("adjective: " +adjective);
                    j++;
                }

                ps = connection.prepareStatement("SELECT word FROM object_words WHERE id= " + id); //object word
                rs = ps.executeQuery();
                String object = ""; //Object has 361 words
                while (rs.next() && j == 1) { //object
                    object = rs.getString("word");
                    System.out.println("object: " +object);
                    j++;
                }

                ps = connection.prepareStatement("SELECT word FROM action_words WHERE id= " + id); //action word
                rs = ps.executeQuery();
                String action = ""; // action has
                while (rs.next() && j == 2) { //action
                    action = rs.getString("word");
                    System.out.println("action: " + action);
                    j++;
                }

                ps = connection.prepareStatement("SELECT word FROM object2_words WHERE id= " + id); //object2 word
                rs = ps.executeQuery();
                String object2 = ""; //object 2 has 361 words
                while (rs.next() && j == 3) { //object2
                    object2 = rs.getString("word");
                    System.out.println("object2: " + object2);
                    j++;
                }

                ps = connection.prepareStatement("SELECT word FROM location_words WHERE id= " + id); //location word
                rs = ps.executeQuery();

                String location = ""; // location has 296 words

                while (rs.next() && j == 4) { //location
                    location = rs.getString("word");
                    System.out.println("location: " + location);
                    j++;
                }
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {

        }
    }
}