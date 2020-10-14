/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadtesting;

/**
 *
 * @author deepthiha
 */
public class Threadtesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        threadtesting1 t1,t2,t3,t4;
        
        t1=new threadtesting1("Thread #1");
        t2=new threadtesting1("Thread #2");
        t3=new threadtesting1("Thread #3");
        t4=new threadtesting1("Thread #4");
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
    
}
class threadtesting1 extends Thread {
    public threadtesting1 (String s) {
        super(s);
    }
    @Override
    public void run(){
        System.out.println("hello I am"+getName());
    }
    
}
