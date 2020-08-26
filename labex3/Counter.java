/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counter;
import pack.*;
/**
 *
 * @author deepthiha
 */
public class Counter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mn obj=new mn();
        obj.incr();
        mn obj1=new mn();
        obj1.incr();
        mn obj2=new mn();
        obj2.incr();
        // TODO code application logic here
    }
    
}
class mn
{
    static int i=20;
    int j=10;
    void incr()
    {
        i=i+10;
        j=j+10;
        System.out.println(i);
        System.out.println(j);
    }
}
