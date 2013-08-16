/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class db {
    public static Connection con() throws Exception {
         Class.forName("com.mysql.jdbc.Driver");
         Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3308/neelagiri","root","123");
         Statement s = c.createStatement();
         return c;
        
    }
}
