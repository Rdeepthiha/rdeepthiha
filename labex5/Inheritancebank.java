/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancebank;
import java.util.Scanner;
/**
 *
 * @author deepthiha
 */
public class Inheritancebank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("\nenter 1 for bankA amount");
        System.out.println("\nenter 2 for bankB amount");
        System.out.println("\nenter 3 for bankC amount");
        int n=obj.nextInt();
        switch(n)
        {
            case 1:
                bankA obj1=new bankA();
                System.out.println(obj1.getbalance());
                break;
            case 2:
                bankB obj2=new bankB();
                System.out.println(obj2.getbalance());
                break;
            case 3:
                bankC obj3=new bankC();
                System.out.println(obj3.getbalance());
                break;
            default:
                bank ba=new bank();
                System.out.println(ba.getbalance());
        }
        // TODO code application logic here
    }
    
}
class bank
{
    int getbalance()
    {
        return 0;
    }
}
class bankA
{
    public int getbalance()
    {
        return 1000;
    }
}
class bankB
{
    public int getbalance()
    {
     return 2000;   
    }
}
class bankC
{
    public int getbalance()
    {
        return 3000;
    }
}
