import java.util.*;
import java.lang.*;
import java.io.*;
class Calci
{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter two numbers");
      int a=sc.nextInt();
      int b=sc.nextInt();
      System.out.println("Choose operation to be formed ");
      System.out.println("1.Add");
      System.out.println("2.Subtraction");
      System.out.println("3.Multiply");
      System.out.println("4.Div");
      int c=sc.nextInt();
      int z=0;
      if(c==1){
       z=a+b;
       System.out.println("addition of "+a+" and "+b+" is "+z);
            }
       else if(c==2){
       z=a-b;
       System.out.println("subtratcion of "+a+" and "+b+" is "+z); 
            }
        else if(c==3){
            z=a*b;
             System.out.println("Product of "+a+" and "+b+" is "+z); 
               }
          else if(c==4)
                      {
                         z=a/b;
                   System.out.println("Division of "+a+" and "+b+" is "+z);   
                 }    
              else{
System.out.println("No operation");
                 }                        
      
    }
}