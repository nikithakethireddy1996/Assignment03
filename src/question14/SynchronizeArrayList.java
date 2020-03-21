/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Nikitha Kethireddy
 */
public class SynchronizeArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> drama = new ArrayList<String>();

        drama.add("Korean");
        drama.add("Japanese");
        drama.add("Chinese");
        drama.add("Thailand");
        drama.add("Taiwan");

        // Synchronizing ArrayList in Java  
        drama = Collections.synchronizedList(drama);

        // we must use synchronize block to avoid non-deterministic behavior  
        synchronized (drama) {
            Iterator<String> itr = drama.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        }

    }

}
