package Standardclass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author hojornogiovanna
 */
public class Timestamp2 
{
    public static void main(String[] args) 
    {      
        Calendar cl = Calendar.getInstance();
        //カレンダーで指定した日時をタイムスタンプに変換
        cl.set(2016, 10, 4, 10, 0, 0);
        Date date = cl.getTime();
        //タイムスタンプを出力
        System.out.println(date.getTime());
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        String dataString = sdf.format(date);
        System.out.println(dataString);
    }
}
