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
public class TestDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StaticA o1 = new StaiticB();

// As per overriding rules this should call to class StaticB’s 
//static overridden method. Since static method cannot be overridden, 
//it calls StaticA's show()
        o1.show();

// Overriding works and StaticB's print() is called  
        o1.print();

    }

}
