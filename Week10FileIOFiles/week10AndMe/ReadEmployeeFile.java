package week10AndMe;

import java.nio.file.*;
import java.io.*;

public class ReadEmployeeFile
{
   public static void main(String[] args)
   {
      Path file =
         Paths.get("C:\\Users\\scotto\\Java\\MyDirectory\\Data Files\\Employees.txt");
      String s = "";
      try
      {
         InputStream input = new BufferedInputStream(Files.newInputStream(file));
         BufferedReader reader = new BufferedReader(new InputStreamReader(input));
         
         s = reader.readLine();
         while(s != null)
         {
            System.out.println(s);
            s = reader.readLine();           
         }
         reader.close();
      }
      catch(Exception e)
      {
        System.out.println("Message: " + e);
      }
   }
}