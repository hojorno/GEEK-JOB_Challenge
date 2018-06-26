package Standardclass;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author hojornogiovanna
 */
public class Standardprocessing 
{
    public static void main(String[] args) 
    {
        Date now1 = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss 開始");
        
        String dataString1 = sdf1.format(now1);
        System.out.println(dataString1);
        
        for (int i = 1; i < 10; i++) {          
            for (int j = 1; j < 10; j++) {
                //１〜９までの数字を１〜９で累乗。
                System.out.println("「" + i + "」の「" + j + "」乗は");
                System.out.println("「" + Math.pow(i, j) + "」です。");          
            }   
        }   
        Date now2 = new Date();
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss 終了");
        
        String dataString2 = sdf2.format(now2);
        System.out.println(dataString2); 
    }
}
