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
public class SingletonTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SingletonClass instance1 = SingletonClass.getInstance();

        SingletonClass instance2 = SingletonClass.getInstance();

        System.out.println("Instance 1 hash:" + instance1.hashCode());
        System.out.println("Instance 2 hash:" + instance2.hashCode());

    }

}
