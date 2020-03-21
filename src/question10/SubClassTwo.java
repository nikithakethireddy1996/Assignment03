/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

import java.io.FileNotFoundException;

/**
 *
 * @author Nikitha Kethireddy
 */
public class SubClassTwo extends SuperClass {

    void methodSuperClass() throws NullPointerException, ArrayIndexOutOfBoundsException, FileNotFoundException {
        System.out.println("Able to override with any UCE and CE having less scope");
    }

}
