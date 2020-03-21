/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question13;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author Nikitha Kethireddy
 */
public class TestDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         ArrayList<String> a = new ArrayList<String>(); 

//adding object to arraylist

a.add("Nikitha");
a.add("Sushma");
a.add("Deepthi"); 
a.add("Alekya");   

// traversing elements using Iterator System.out.println(Elements of ArrayList class are:");
Iterator iterator = a.iterator(); 
while (iterator.hasNext()) 
System.out.println(iterator.next()); 

// creating Vector 
Vector<String> vec = new Vector<String>(); 
vec.addElement("Kethireddy");
vec.addElement("Yedugani");
vec.addElement("Chokka"); 
vec.addElement("Pochampally"); 

// traversing elements using Enumeration 
System.out.println("\nElements of Vector class are:");
Enumeration enum1 = vec.elements(); 
while(enum1.hasMoreElements()) {
    System.out.println(enum1.nextElement()); 
}
    }
    
}
