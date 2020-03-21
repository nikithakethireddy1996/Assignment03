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
public interface Test2 {

    public void square(int a);

    // default method 
    default void show() {
        System.out.println("Default Method ");
    }

}
