/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perimeter;
import java.util.Scanner;
/**
 *
 * @author deepthiha
 */
public class Perimeter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter side of a square");
        int a=obj.nextInt();
        System.out.println("perimeter of the square"+(4*a));
        // TODO code application logic here
    }
    
}
