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
class AnimalRunnable implements Runnable{
    public void run() {
for (int x = 1; x < 4; x++) {
System.out.println("Run by " +Thread.currentThread().getName());
try {
Thread.sleep(1000);
}
 catch (InterruptedException ex) {
ex.printStackTrace();
}
}
System.out.println("Thread State: "+ Thread.currentThread().getName()+ " - "+Thread.currentThread().getState());

System.out.println("Exit Thread: "+Thread.currentThread().getName());

}
} 
