/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question21;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Nikitha Kethireddy
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Demo object = new Demo(1, "Hello Serializable Class"); 
        String filename = "file.ser";           
        // Serialization  
 try
{  
//Saving of object in a file 
    FileOutputStream fileOS = new FileOutputStream(filename); 
    ObjectOutputStream outOS = new ObjectOutputStream(fileOS);
            // Method of performing the serialization of object 
            outOS.writeObject(object); 
            outOS.close(); 
            fileOS.close();               
       System.out.println("Object  serialized");   
        }           
        catch(IOException ex) 
        { 
            System.out.println("Caught Exception");         
} 

    }
    
}
