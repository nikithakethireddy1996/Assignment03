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
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // lambda expression to implement above Test interface. This interface by default implements abstractFun() 

        Test t = (int x) -> System.out.println(2 * x);
        t.abstractFun(5);
    }
}
