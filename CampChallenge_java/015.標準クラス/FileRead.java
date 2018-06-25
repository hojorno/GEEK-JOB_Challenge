package Standardclass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author hojornogiovanna
 */
public class FileRead 
{
    public static void main(String[] args)
    {
        try {
            File fp = new File("file.txt");
            FileReader fr = new FileReader(fp);
            BufferedReader br = new BufferedReader(fr);
            
            System.out.println(br.readLine());
            
            fr.close();
        } catch (IOException e) {
        }
    }
}
