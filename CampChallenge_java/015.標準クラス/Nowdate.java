package Standardclass;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author hojornogiovanna
 */
public class Nowdate 
{    
    public static void main(String[] args) 
    {    
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
        
        String dataString = sdf.format(now);
        System.out.println(dataString);
    }
}
