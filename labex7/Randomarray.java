/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomarray;
import java.util.ArrayList;
/**
 *
 * @author deepthiha
 */
public class Randomarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList original=new ArrayList();
        ArrayList list1=new ArrayList();
        ArrayList list2=new ArrayList();
        int min=10;int max=90;int avg=0;
        for(int j=0;j<20;j++)
        {
            int pick=(int)(Math.random()*(max-min+1)+min);
            list1.add(pick);
            avg=avg+pick;
        }
        avg=avg/20;
        System.out.println("content of original list:"+original);
        System.out.println("the average is"+avg);
        for(int j=0;j<20;j++)
        {
            int a=(int)original.get(j);
            if(a>avg)
            {
                list1.add(a);
            }
            else
            {
                list2.add(a);
            }
            
        }
        System.out.println("\ncontents of the original array:"+original);
        System.out.println("\ncontents greater than average:"+list1);
        System.out.println("\ncontents less than average:"+list2);
    }
    
}
