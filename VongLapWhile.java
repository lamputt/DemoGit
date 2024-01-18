import java.util.Scanner;
public class VongLapWhile 
{
  public static void main (String [] args ) 
  {
     Scanner input = new Scanner (System.in) ;
     int n = input.nextInt();
     int i = 1 ;
     int total = 1 ; 
     while (n >= i ) 
     {
       total = total * i ; 
       System.out.println (total); 
       i = i + 1 ; 
     } 
     System.out.println (total); 
     input.close(); 
  }
}