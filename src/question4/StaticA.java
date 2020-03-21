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
public class StaticA {

// Static method in this class which will be hidden in subclass
    public static void show() {
        System.out.println("Static of A");
    }

// Non-static method which will be overridden in StaticB class  
    public void print() {
        System.out.println("Non-static of A");
    }
}
