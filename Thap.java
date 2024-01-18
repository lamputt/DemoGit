import java.util.Scanner ;
public class Thap 
{
    public static void main (String [] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap chieu cao cua kim tu thap");
        int a ; 
        a = sc.nextInt();
        for (int i = 0 ; i < a ; i ++) 
        {
            
            for (int j = 1 ; j + 2  < a  ; j ++)
            {
                System.out.print("*");
            }
            System.out.println ();
        }
    }
}