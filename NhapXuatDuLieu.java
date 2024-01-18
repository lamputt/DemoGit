import java.util.Scanner;

public class NhapXuatDuLieu 
{
  public static void main (String[]args) 
 {
   Scanner input = new Scanner (System.in); 	
   System.out.println ("Chuong trinh nhap du lieu cua hoc sinh");
   System.out.println ("Moi ban nhap cac du lieu sau");
   System.out.println ("Nhap ho va ten hoc sinh");
   String name = input.nextLine();
   System.out.println ("nhap tuoi cua hoc sinh ");
   int age = input.nextInt();
   System.out.println("Nhap diem mon toan"); 
   int toan = input.nextInt();
   System.out.println("Nhap diem mon van");
   int van = input.nextInt(); 
   System.out.println ("Nhap diem mon anh");
   int anh = input.nextInt(); 
   double trungbinh =(toan + van + anh ) / 3;
  System.out.printf("ho va ten hoc sinh la " + name +  " tuoi cua hoc sinh la  "  + age +  "diem mon toan la "  + toan +  "diem mon van la " + van + " diem mon anh la "  + anh + "diem trung binh mon la" +  trungbinh );
   
 }
}