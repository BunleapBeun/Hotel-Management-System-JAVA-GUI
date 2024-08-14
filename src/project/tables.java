package project;
import java.sql.*;
import javax.swing.JOptionPane;

public class tables {

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        try {
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            st.executeUpdate("CREATE TABLE users (name VARCHAR(200), email VARCHAR(200), password VARCHAR(50), securityQuestion VARCHAR(500), answer VARCHAR(200), address VARCHAR(200), status VARCHAR(20))");
            st.executeUpdate("CREATE TABLE room(roomNo VARCHAR(10), roomType VARCHAR(200), bed VARCHAR(200), price INT, status VARCHAR(20))");
            st.executeUpdate("CREATE TABLE customer (id INT, name VARCHAR(200), mobileNumber VARCHAR(20), nationality VARCHAR(200), gender VARCHAR(50), email VARCHAR(200), idProof VARCHAR(200), address VARCHAR(500), checkIn VARCHAR(50), roomNo VARCHAR(10), bed VARCHAR(200), roomType VARCHAR(200), pricePerDay DECIMAL(10, 2), numberOfDaysStay INT, totalAmount DECIMAL(10, 2), checkout VARCHAR(50));");
            JOptionPane.showMessageDialog(null, "Table Created successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (st != null) {
                    st.close();
                }
            } catch (Exception e) {
                // Do nothing
            }
        }
    }
}