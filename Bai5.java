import java.util.Scanner ;
public class Bai5 
{
    public static void main (String[]args)
    {
           Scanner sc = new Scanner(System.in); 
           System.out.println("moi ban nhap so thu nhat") ;
           int a = sc.nextInt();
           System.out.println("moi ban nhap so thu hai");
           int b = sc.nextInt();
           int c = 0 ;
           c = a ;
           a = b ; 
           b = c ;  
             
           System.out.println("so sau khi hoan doi se la ");
           System.out.println( a + " " + b );
    }
    
}