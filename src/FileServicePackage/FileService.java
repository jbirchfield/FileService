/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FileServicePackage;

/**
 *
 * @author jamesb
 */
public class FileService {
    private FileReaderStrategy read;
    private FileWriterStrategy write;
    
    public FileService(FileReaderStrategy read, FileWriterStrategy write){
        this.read = read;
        this.write = write;
    }
}
    

