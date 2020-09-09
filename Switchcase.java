/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchcase;
import java.util.Scanner;
/**
 *
 * @author deepthiha
 */
public class Switchcase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        switch(a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println(a+"valid");
                break;
            default:
                System.out.println(a+"not valid");
        }
        // TODO code application logic here
    }
    
}
