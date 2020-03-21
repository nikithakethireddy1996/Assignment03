/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question24;

/**
 *
 * @author Nikitha Kethireddy
 */
public class GC {
private String color;
public GC(String color) {
this.color = color;
	}
 @Override
public void finalize() {
System.out.println(this.color + " removed and cleaned");
	}

}
