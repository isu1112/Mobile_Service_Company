
package mobile_service_company;

import java.sql.Connection;
import java.sql.DriverManager;

public class database {
    public static Connection connection(){
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile", "root", "1234");
            return con;
            
            
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    
    }
}
