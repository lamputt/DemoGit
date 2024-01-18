
import java.util.Scanner;

class Bai2 
{
 
 // boolean kttg (int a , int b , int c ) 
  //{
    //if (a + b > c && a+c > b && b+c > a ) 
    //{
      //return true ;
    //}
      //return false ;
  //}
  boolean kttgv (int a , int b , int c ) 
  {
    if (a*a +b*b == c*c || b*b+c*c == a*a || a*a+c*c == b*b) 
    {
      return true;
    }
    return false ; 
  }

  public static void main(String[] args)
  {
       //bai1 :
    Scanner Input = new Scanner(System.in);
    // Bai2 bai2 = new Bai2();
     //int a = Input.nextInt();
     //int b = Input.nextInt();
     //int c = Input.nextInt();  
     //if (bai2.kttg(a , b , c) )
     // {
        //System.out.println("tam giac");
     // }
      //else 
      //{
        //System.out.println("k phai tam giac");
      //} 
      // bai2 : 
  //   Bai2 b2 = new Bai2();
  //   int a = Input.nextInt();
  //   int b = Input.nextInt();
  //   int c = Input.nextInt();
  //   if (b2.kttgv(a, b, c))
  //   {
  //     System.out.println("tam giac v");
  //   }  
  //   else 
  //   {
  //     System.out.println("k phai tam giac v");
  //   } 
  // bai3: 
    //  
    // int a = Input.nextInt();
    // if (a % 4 == 0 && a % 100 == 1 ) 
    // {
    //   System.out.println ("nam nhuan");
    // }
    // else 
    // {
    //   System.out.println("k phai nam nhuan");
    // }
    //bai 4 
    // int a = Input.nextInt();
    //  int b = (a % 100) / 10 ; 
    //  System.out.println(b);
    // int i = 1 ;
    // int n = Input.nextInt();
 
    // while (i < n ) 
    // {
    //   if (i % 2 != 0) 
    //   {
    //     total += i ;
    //   }
    //   i++;
    // }
  //   for ( int i =1 ; i < n ; i+=2  ) 
  //  {
  //   total += i ;
  //  }
  //  System.out.println(total);
    // for (int i = 0 ; i < n ; i ++) 
    // {
    //   for (int j = 1 ; j <= n-i ; j ++  ) 
    //   {
    //     System.out.print("  ");
    //   }
    //   for (int k = 1 ; k <= 2 * i -1 ; k ++  ) 
    //   {
    //     System.out.print(" * ");
    //   }
    //   System.out.println();
    // }
    // for (int i = 1 ; i <= n ; i ++)
    //  {
    //    for (int j = 1 ; j < 2 * i  ; j ++ ) 
    //    {
    //     System.out.print(" * ");
    //    }
    //    System.out.println();
    //  }

    int a = Input.nextInt();
    int b = 0; 
    int c = 1;
    int sum = 1  ; 
    for (int i = 2 ; i < a ; i ++) 
    {
      if (a == 0 ) 
      {
        System.out.println(b);
      }
      if (a== 1 ) 
      {
        System.out.println(c);
      }
      else 
      {
        b = c ; 
        c = sum ; 
        sum = b+c ;
      }
    }
    System.out.println(c);
   } 
  
    
  
}