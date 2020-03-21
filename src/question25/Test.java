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
public interface Test {

    void abstractFun(int x);

    default void normalFun() {
        System.out.println("Hello");
    }

}
