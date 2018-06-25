package Standardclass;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author hojornogiovanna
 */
public class Timestamp3 
{
    public static void main(String[] args) 
    {
        Calendar cl = Calendar.getInstance();
        Calendar cl2 = Calendar.getInstance();
        
        cl.set(2015, 0, 1, 0, 0, 0);
        cl2.set(2015, 11, 31, 23, 59, 59);
        Date date = cl.getTime();
        Date date2 = cl2.getTime();
        
        System.out.println(date2.getTime()-date.getTime());
    }
}
