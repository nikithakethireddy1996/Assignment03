/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question19;

/**
 *
 * @author Nikitha Kethireddy
 */
public class ExtThread1 implements Runnable{

    /**
     * @param args the command line arguments
     */
    public void run(){  
	System.out.println("Try to run the thread");  
	}
    public static void main(String[] args) {
        // TODO code application logic here
        ExtThread1 imp2=new ExtThread1();  
        Thread imp1=new Thread();
	imp1.start();  

    }
    
}
