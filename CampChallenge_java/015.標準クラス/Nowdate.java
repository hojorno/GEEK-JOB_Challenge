package Standardclass;

import java.util.Calendar;

/**
 *
 * @author hojornogiovanna
 */
public class Nowdate {
    
    public static void main(String[] args) {
        
        Calendar cl = Calendar.getInstance();
        
        cl.set(1988, 5, 21, 1, 23, 45);
        
        System.out.print(cl.get(Calendar.YEAR)+"年");
        System.out.print(cl.get(Calendar.MONTH)+"月");
        System.out.print(cl.get(Calendar.DAY_OF_MONTH)+"日");
        System.out.print(cl.get(Calendar.HOUR_OF_DAY)+"時");
        System.out.print(cl.get(Calendar.MINUTE)+"分");
        System.out.print(cl.get(Calendar.SECOND)+"秒");
    }
}
