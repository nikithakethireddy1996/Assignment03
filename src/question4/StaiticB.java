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
public class StaiticB extends StaticA {

    public static void show() {
        System.out.println("Static of B");
    }

// This method overrides print() in StaticA
    public void print() {
        System.out.println("Non-static of B");
    }
}
