/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

/**
 *
 * @author Nikitha Kethireddy
 */
public  class FinalConstA{
public final int age;
public final String name;
public final FinalConstA(){
this.age=23;
this.name="Nikitha";
}
public void show(){
System.out.println("Age of the person is:"+ age);
System.out.println("Name of the person is:"+ name);
}
public static void main(String args[]){
new FinalConstA().show();
}
}


