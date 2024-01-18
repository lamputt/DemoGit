import java.util.Scanner ; 
class PhuongThuc

{
int number (int a , int b ) 

  {

    int sum = a + b;

    return sum ;

  } 

 public static void main(String [] args) 

 {

Scanner input = new Scanner(System.in);

int a = input.nextInt();

int b = input.nextInt(); 

PhuongThuc Pt = new PhuongThuc();

int sum = Pt.number(a , b);

System.out.println(sum); 

 }

}