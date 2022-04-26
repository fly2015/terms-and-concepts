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
public class EncodingISO88591Demo
{
    public static void main(String[] args) throws Exception
    {
         File file = new File("./resources/eu_text.txt");
         if(!file.exists())
         {
             throw new Exception("File does not exist.");
         }
         
         Reader reader = new FileReader(file, Charset.forName("ISO-8859-1"));
         Writer write = new FileWriter(new File("./resources/eu_text_out.txt"), Charset.forName("ISO-8859-1"));
         
         char [] cbuf = new char [2048];
         int numberOfbytes;
         while ((numberOfbytes = reader.read(cbuf)) != -1)
         {
             System.out.println(cbuf);
             write.write(cbuf, 0, numberOfbytes);
         }
        // write.flush();
         write.close();
         reader.close();
        
     }
}



/*
 * Changes:
 * $Log: $
 */