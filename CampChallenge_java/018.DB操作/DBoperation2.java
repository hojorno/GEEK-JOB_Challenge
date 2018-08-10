package DBoperation;

import java.sql.*;

public class DBoperation2 
{
    public static void main(String[] args)
    {
        Connection db_con = null;
        
        try{
            //JDBCドライバのロード
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            //MySQLに接続
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/Challenge_db","hojorno","hk0129");
            
            Statement stm = db_con.createStatement();
            String sql = "INSERT INTO profiles VALUES(6,'田中 茂','0120-828-828',33,'1991-02-22');";
            
            stm.executeUpdate(sql);
            
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
