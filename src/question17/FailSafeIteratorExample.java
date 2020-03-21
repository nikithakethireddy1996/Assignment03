package question17;


import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nikitha Kethireddy
 */
public class FailSafeIteratorExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();

        //Adding elements to map
        map.put("ME", 10);
        map.put("YOU", 20);
        map.put("SHE", 30);
        map.put("HE", 40);

        //Getting an Iterator from map
        Iterator<String> it = map.keySet().iterator();

        while (it.hasNext()) {
            String key = (String) it.next();
            System.out.println(key + " : " + map.get(key));

            map.put("THEY", 50);
            //This will not be reflected in the Iterator because we called put method after get method. So the elements which are present before calling put are printed.
        }

    }

}
