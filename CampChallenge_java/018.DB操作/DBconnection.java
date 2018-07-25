package DBoperation;

import java.sql.*;

public class DBconnection 
{
    public static void main(String[] args)
    {
        Connection db_con = null;
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/Challenge_db","hojorno","hk0129");
        } catch (SQLException e_sql) {
            System.out.println("接続時にエラーが発生しました：" + e_sql.toString());
        } catch (Exception e) {
            System.out.println("接続時にエラーが発生しました" + e.toString());
        } finally{
            if (db_con != null) {
                try{
                    db_con.close();
                } catch (Exception e_con){
                    System.out.println(e_con.getMessage());
                }
            }
        }
    }
}