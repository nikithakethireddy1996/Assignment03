/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question25;

/**
 *
 * @author Nikitha Kethireddy
 */
public class TestA implements Test2 {

    /**
     * @param args the command line arguments
     */
    public void square(int a) {
        System.out.println(a * a);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        TestA d = new TestA();
        d.square(3);

        // default method executed 
        d.show();
    }

}
