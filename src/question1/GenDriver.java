/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;
/**
 *
 * @author Nikitha Kethireddy
 */
public class GenDriver {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
        GenDriver<String> t = new GenDriver<>();
        t.set("Nikitha");

        GenDriver t1 = new GenDriver();
        t1.set("Nikitha");
        t1.set(10);
    }

    private void set(String nikitha) {
   throw new UnsupportedOperationException("Not supported yet."); 
//To change body of generated methods, choose Tools | Templates.
    }

    private void set(int i) {
        throw new UnsupportedOperationException("Not supported yet."); 
//To change body of generated methods, choose Tools | Templates.
    }
    
}
