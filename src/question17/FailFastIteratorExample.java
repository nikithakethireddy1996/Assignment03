/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question17;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Nikitha Kethireddy
 */
public class FailFastIteratorExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> list = new ArrayList<Integer>();

//Adding elements to list
        list.add(123);
        list.add(456);
        list.add(789);
        list.add(987);
        list.add(654);

//Getting an Iterator from list
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer integer = (Integer) it.next();

            list.add(321);
//This will throw ConcurrentModificationException
        }

    }

}
