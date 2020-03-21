/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question20;

/**
 *
 * @author Nikitha Kethireddy
 */
public class AnimalThreadStatesDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        AnimalRunnable anr = new AnimalRunnable();
        Thread cheetah = new Thread(anr);
        cheetah.setName("Cat");

        Thread donkey = new Thread(anr);
        donkey.setName("Donkey");

        Thread cow = new Thread(anr);
        cow.setName("Cow");

        System.out.println("Thread State of Cheetah before calling start: " + cheetah.getState());
        cheetah.start();
        donkey.start();
        cow.start();
        System.out.println("Thread State of Cheetah before Sleep: " + cheetah.getState());

        System.out.println("Thread State of Donkey before Sleep: " + donkey.getState());

        System.out.println("Thread State of Cow before Sleep: " + cow.getState());

        Thread.sleep(10000);

        System.out.println("Thread State of Cheetah after sleep: " + cheetah.getState());

        System.out.println("Thread State of Donkey after sleep: " + donkey.getState());

        System.out.println("Thread State of Cow after sleep: " + cow.getState());
    }
}
