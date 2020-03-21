/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question25;

import java.util.stream.Stream;

/**
 *
 * @author Nikitha Kethireddy
 */
public class StreamBuilders {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        stream.forEach(p -> System.out.println(p));

         Stream<Date> stream = Stream.generate(() -> { return new Date(); });
         stream.forEach(p -> System.out.println(p));
    }

}
