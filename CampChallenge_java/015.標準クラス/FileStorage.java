package Standardclass;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author hojornogiovanna
 */
public class FileStorage 
{
    public static void main(String[] args) 
    {
        try{
            File fp = new File("file.txt");
            FileWriter fw = new FileWriter(fp);
            
            fw.write("私の名前はHojornoGiovannaです");
            fw.close();
        }
        catch(IOException e){    
        }
    }
}
