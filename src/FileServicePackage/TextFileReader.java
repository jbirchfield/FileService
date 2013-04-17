/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FileServicePackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author jamesb
 */
public class TextFileReader implements FileReaderStrategy {

    private String readFileName;
    @Override
    public void setFilePath(String filePath) {
        readFileName = filePath;
    }
    
    File data = new File(readFileName);

    // check if file exists, and if so, loop through and read each line of text
//    if (data.exists()){
    BufferedReader in = null;
    try {
	 in = new BufferedReader(new FileReader(data));
         char[] charBuffer = new char[20];
         int bytes = in.read(charBuffer);

         for(int i=0; i < bytes; i++) {
            if(charBuffer[i] == '\n') {
                System.out.println("CR: " + (0 + '\n'));
            } else {
                System.out.println(charBuffer[i]);
            }
         }
	    
    }  catch(FileNotFoundException fnfe) {
	     System.out.println("File not found:" + readFileName);
    } finally {
        try {
            in.close();
        } catch(Exception e){
        }
    }    
}
