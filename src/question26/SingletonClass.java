/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question26;

/**
 *
 * @author Nikitha Kethireddy
 */
public class SingletonClass {

    private static SingletonClass sSoleInstance;

    private SingletonClass() {
    }  //private constructor.

    public static SingletonClass getInstance() {
        if (sSoleInstance == null) {
            sSoleInstance = new SingletonClass();
        }

        return sSoleInstance;
    }

}
