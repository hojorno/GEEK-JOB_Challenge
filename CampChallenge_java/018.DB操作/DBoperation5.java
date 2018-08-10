package DBoperation;

import java.sql.*;

public class DBoperation5 
{
    public static void main(String[] args)
    {
        Connection db_con = null;
        
        try{
            //JDBCドライバーのロード
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            //MySQLに接続
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/Challenge_db","hojorno","hk0129");
            
            Statement stm = db_con.createStatement();
            String sql = "select* from profiles where name like '%茂%';";
            ResultSet rs = stm.executeQuery(sql);
            
            while(rs.next()){
                int id = rs.getInt("profileID");
                String name = rs.getString("name");
                String tel = rs.getString("tel");
                int age = rs.getInt("age");
                String birth = rs.getString("birthday");
                System.out.println("取得結果 -> " + id + ":" + name + ":" + tel + ":" + age + ":" + birth);
            }
            
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
