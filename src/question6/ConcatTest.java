/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

/**
 *
 * @author Nikitha Kethireddy
 */
public class ConcatTest {

    /**
     * @param args the command line arguments
     */
    public static String withString() {
        String s = "MS";
        for (int i = 0; i < 10000; i++) {
            s = s + "ACS";
        }
        return s;
    }

    public static String withStringBuffer() {
        StringBuffer sb = new StringBuffer("MS");
        for (int i = 0; i < 10000; i++) {
            sb.append("ACS");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // TODO code application logic here

        long st = System.currentTimeMillis();
        withString();
        System.out.println("Time by String: " + 
                (System.currentTimeMillis() - st) + "ms");
        st = System.currentTimeMillis();
        withStringBuffer();
        System.out.println("Time by StringBuffer: " + 
                (System.currentTimeMillis() - st) + "ms");

    }

}
