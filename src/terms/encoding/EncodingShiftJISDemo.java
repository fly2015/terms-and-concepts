/*
 * EncodingShiftJISDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package terms.encoding;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class EncodingShiftJISDemo
{
    public static void main(String[] args) throws Exception
    {
         File file = new File("./resources/japan_text.txt");
         if(!file.exists())
         {
             throw new Exception("File does not exist.");
         }
         
         Reader reader = new FileReader(file, Charset.forName("Shift-JIS"));
         Writer write = new FileWriter(new File("./resources/japan_text_out.txt"), Charset.forName("Shift-JIS"));
         
         char [] cbuf = new char [4096];
         int numberOfbytes;
         while ((numberOfbytes = reader.read(cbuf)) != -1)
         {
             //byte[] bytes = new String(cbuf).getBytes("Shift-JIS");
             //System.out.println(bytes[1]);
             write.write(cbuf, 0, numberOfbytes);
         }
         write.flush();
         reader.close();
         write.close();
     }
}



/*
 * Changes:
 * $Log: $
 */