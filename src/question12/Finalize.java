/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question12;

/**
 *
 * @author Nikitha Kethireddy
 */
public class Finalize {

    /**
     * @param args the command line arguments
     */
    public void finalize() {
        System.out.println("Call Finalize");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Finalize fe = new Finalize();

        Finalize fe1 = new Finalize();
        fe = null;
        fe1 = null;
        System.gc();

    }

}
