/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;
/**
 *
 * @author kusha
 */
public class ConnectionProvider {
    public static Connection getCon() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Check your JDBC driver
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/HOSTEL", "root", "123456");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}

