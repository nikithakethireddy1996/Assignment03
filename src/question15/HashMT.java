/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question15;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author Nikitha Kethireddy
 */
public class HashMT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hashtable<Integer,String> ht=new Hashtable<Integer,String>(); 
        ht.put(1," Nikitha"); 
        ht.put(2,"Sushma"); 
        ht.put(3,"Deepthi"); 
         
        System.out.println("Hash table elements"); 
        for (Map.Entry me:ht.entrySet()) { 
            System.out.println(me.getKey()+" "+me.getValue()); 
        } 
   
        HashMap<Integer,String> hm=new HashMap<Integer,String>(); 
        hm.put(10,"Kethireddy"); 
        hm.put(20,"Yedugani");  
       hm.put(30,"Kethireddy");
        System.out.println("Hash map elements"); 
        for (Map.Entry me:hm.entrySet()) { 
        System.out.println(me.getKey()+" "+me.getValue()); 
        } 

    }
    
}
