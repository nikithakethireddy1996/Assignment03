/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question24;

/**
 *
 * @author Nikitha Kethireddy
 */
public class GCTestDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        GC d = new GC("orange");
        d = null;
        Runtime.getRuntime().gc();
    }

}
