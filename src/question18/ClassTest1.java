/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question18;

/**
 *
 * @author Nikitha Kethireddy
 */
public class ClassTest1 extends Thread{

    /**
     * @param args the command line arguments
     */
    	 public void run(){  
	   System.out.println("While we run the thread");  
	 }  

    public static void main(String[] args) {
        // TODO code application logic here
        ClassTest1 t1=new ClassTest1();  
	  t1.start();  
	  t1.start();  

    }
    
}
