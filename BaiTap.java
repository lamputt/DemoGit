 
import java.util.Scanner;
public class BaiTap
{
    public static void main (String [] args )
    {
      Scanner input = new Scanner (System.in);
      System.out.println ("nhap ten");
      String ten; 
      ten = input.nextLine();
      System.out.println ("Nhap tuoi");
      int tuoi ; 
      tuoi = input.nextInt();
      System.out.println(" ten la " +  ten  + " tuoi la " +  tuoi  );
    }
}