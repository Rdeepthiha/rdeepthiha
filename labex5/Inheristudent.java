/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheristudent;
import java.util.Scanner;
/**
 *
 * @author deepthiha
 */
public class Inheristudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=0;i<3;i++)
        {
            sports obj1=new sports();
            obj1.calculate();
            obj1.display();
        }
        // TODO code application logic here
    }
    
}
class student
{
    String sname;
    int roll_no;
    Scanner obj=new Scanner(System.in);
    static int i=1;
     public void read()
     {
         System.out.println("\nenter the student name:"+i);
         sname=obj.next();
         System.out.println("enter the roll no:");
         roll_no=obj.nextInt();
         i++;
     }
     public void display()
     {
         System.out.println("\nstudent details");
         System.out.println("\nName:"+sname);
         System.out.println("\nRollno:"+roll_no);
         
     }
}
class result extends student
{
    int m1,m2,m3;
    public void read()
    {
        super.read();
        System.out.println("\nenter the mark 1:");
        m1=obj.nextInt();
        System.out.println("\nenter the mark 2:");
        m2=obj.nextInt();
    }
    public void display()
    {
        super.display();
        System.out.println("\nstudent mark details");
        System.out.println("mark1:"+m1+"\nmark2:"+m2);
        
    }
}
class sports extends result
{
    double total;
    int point;
    public void calculate()
    {
        super.read();
        System.out.println("enter the sports point:");
        point=obj.nextInt();
        total=m1+m1;
       
    }
    public void display()
    {
        super.display();
        System.out.println("total:"+total);
        if(m1>=50 && m2>=50)
            System.out.println("PASS");
        else
            System.out.println("FAIL");
        System.out.println("point:"+point);
    }
}