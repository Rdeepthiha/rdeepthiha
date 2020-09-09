/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgpa_sort;
import java.util.*;
/**
 *
 * @author deepthiha
 */
public class Cgpa_sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList al=new ArrayList();
        al.add(new student(90,"sathya",(float)9.0));
        al.add(new student(91,"vicky",(float)9.8));
        al.add(new student(92,"kathir",(float)9.7));
        al.add(new student(93,"vijay",(float)9.6));
        al.add(new student(90,"jeeva",(float)9.0));
        al.add(new student(91,"raghul",(float)9.8));
        al.add(new student(92,"rakesh",(float)9.7));
        al.add(new student(93,"raju",(float)9.6));
        al.add(new student(90,"siva",(float)9.0));
        al.add(new student(91,"aakash",(float)9.8));
        al.add(new student(92,"ram",(float)9.7));
        al.add(new student(93,"ravi",(float)9.6));
        al.add(new student(90,"virat",(float)9.0));
        al.add(new student(91,"dhoni",(float)9.8));
        al.add(new student(92,"surya",(float)9.7));
        al.add(new student(93,"prabha",(float)9.6));
        
        System.out.println("sorting by cgpa");
        
        Collections.sort(al,new cgpaComparator());
        Iterator itr2=al.iterator();
        while(itr2.hasNext())
        {
            student st=(student)itr2.next();
            System.out.println(st.rollno+""+st.name+""+st.cgpa);
        }
        
    }
    
}
class student
{
    int rollno;
    String name;
    float cgpa;
    student(int rollno, String name,float cgpa)
    {
        this.rollno=rollno;
        this.cgpa=cgpa;
        this.name=name;
    }
}
class cgpaComparator implements Comparator{
 @Override
 public int compare(Object o1,Object o2)
 {
  student s1=(student)o1;
  student s2=(student)o2;
  
  if(s1.cgpa==s2.cgpa)
      return 0;
  else if(s1.cgpa>s2.cgpa)
      return 1;
  else
      return -1;
 }
}
