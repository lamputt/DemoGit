
public class Program 
{
public static void main (String [] args) 
 {
  int count = 0 ;
  int t = 100 ; 
  System.out.println("Những số nguyên tố nhỏ hơn một trăm đó là ");
    for (int i = 2 ; i <= t ; i ++ ) 
    {
      if (t % i != 0 )  
      {
        count = i ;
        System.out.println(count);
      } 
      else {}
     }  
 }    
}