package Standardclass;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author hojornogiovanna
 */
public class Timestamp
{
    
    public static void main(String[] args) 
    {
        Calendar cl = Calendar.getInstance();
        Date date = new Date();
        
        cl.set(2016, 0, 1, 0, 0, 0);
        date = cl.getTime();
        
        System.out.println(date);
        System.out.println(date.getTime());
    }
}
