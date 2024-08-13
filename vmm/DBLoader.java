package vmm;

import java.sql.*;

public class DBLoader 
{
   public static ResultSet executeSql(String sql) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded successfully!!");
        
        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/movie_central","root", "System@2023");
        System.out.println("Connection build");
            
        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        System.out.println("Statement created");
            
        ResultSet rs = stmt.executeQuery(sql);
        System.out.println("ResultSet created");
        
        return rs;
    }
}
