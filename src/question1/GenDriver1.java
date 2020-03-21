/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author Nikitha Kethireddy
 */
public class GenDriver1<T> {

    /**
     * @param args the command line arguments
     */
    private T t;
	
	public T get(){
		return this.t;
	}
	
	public void set(T t1){
		this.t=t1;
	}
	
    public static void main(String[] args) {
        // TODO code application logic here
        
		GenDriver1<String> type = new GenDriver1<>();
		type.set("Nikitha"); //valid
		
		GenDriver1 type1 = new GenDriver1(); //raw type
		type1.set("Nikitha"); //valid
		type1.set(10); //valid and autoboxing support
   
	}
    
}
