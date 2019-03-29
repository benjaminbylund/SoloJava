
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
    public static String dbName = "SoloJava";
    public static int port = 3306;
    public static final String DEFAULT_URL = "jdbc:mysql://"+ hostname +":"+port+"/"+dbName;
    private static final String DEFAULT_USERNAME = "benjaminbylund";
    private static final String DEFAULT_PASSWORD = "skola1234";

    public static void main(String[] args) {
        Connection connection = null;
        int id = 1;

        try {
            Class.forName(DEFAULT_DRIVER_CLASS);
            connection = DriverManager.getConnection(DEFAULT_URL, DEFAULT_USERNAME, DEFAULT_PASSWORD);

            // SQL queries goes here
            PreparedStatement ps = null;
            ResultSet rs = null;
            while(true) {
                ps = connection.prepareStatement("SELECT * FROM story WHERE id = " + id);
                rs = ps.executeQuery();
                String story = "";

                while (rs.next()) {
                    story = rs.getString("text");
                    System.out.println(story);
                }

                ps = connection.prepareStatement("SELECT text FROM storylinks WHERE storyid = " + id);
                rs = ps.executeQuery();
                String[] storylinks = new String[3]; //rs.getLenght ish kolla längden

                int i = 0;
                while (rs.next() && i < storylinks.length) {
                    storylinks[i] = rs.getString("text");
                    i++;
                }
                String input = (String) JOptionPane.showInputDialog(null, story,
                        "The Choice of a Lifetime", JOptionPane.QUESTION_MESSAGE, null, // Use
                        // default
                        // icon
                        storylinks, // Array of choices
                        storylinks[0]); // Initial choice
                System.out.println(input);

                ps = connection.prepareStatement("SELECT target FROM storylinks WHERE text = '" + input + "'");
                rs = ps.executeQuery();

                while (rs.next()) id = rs.getInt("target");

            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {

        }
    }
}