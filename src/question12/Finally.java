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
public class Finally {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            int x = 3;
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            System.out.println("finally executed");
        }

    }

}
