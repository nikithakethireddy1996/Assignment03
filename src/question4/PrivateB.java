/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;

/**
 *
 * @author Nikitha Kethireddy
 */
public class PrivateB extends PrivateA {

    @Override
    private void happy() {
        System.out.println("PrivateB happy");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PrivateA o = new PrivateB();
        o.happy();
    }
}
