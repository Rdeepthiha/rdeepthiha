/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract;
import java.util.Scanner;
/**
 *
 * @author deepthiha
 */
public class Abstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        System.out.println("for transportvehicle enter 1");
        System.out.println("for privatevehicle enter 2");
        int n=obj.nextInt();
        switch(n)
        {
            case 1:
                car obj1=new transportvehicles(5.2023,4.2018,5);
                obj1.display();
                obj1.getdata1();
                break;
            case 2:
                obj1=new privatevehicle("aaa","kk nagar");
                obj1.display();
                obj1.getdata1();
            default:
                System.out.println("enter the correct input");
                break;
        }
        
    }
    
}
abstract class car
{
    int reg_no;
    String model;
    double reg_date;
    
    public void display()
    {
        Scanner obj2=new Scanner(System.in);
        System.out.println("enter the register number:");
        reg_no=obj2.nextInt();
        System.out.println("enter the model of the vehicle: ");
        model=obj2.next();
        System.out.println("enter the registered month and year in(x.yyyy)format:");
        reg_date=obj2.nextDouble();
        System.out.println("\nregister number:"+reg_no+"\nmodel:"+model+"\nreg_date:"+reg_date);
        
    }
    abstract public void getdata1();
}
class transportvehicles extends car
{
    double validity_no;
    double start_date;
    int period;
    transportvehicles(double vn,double sd,int p)
    {
        validity_no=vn;
        start_date=sd;
        period=p;
    }
    public void getdata1()
    {
        System.out.println("validity_no:"+validity_no);
        System.out.println("start_date:"+start_date);
        System.out.println("period:"+period);
    }
}
class privatevehicle extends car
{
 String ow_name;
 String ow_address;
 privatevehicle(String own,String owad)
 {
     ow_name=own;
     ow_address=owad;
 }
 public void getdata1()
 {
     System.out.println("owner name:"+ow_name);
     System.out.println("owner address:"+ow_address);
 }
 
}
