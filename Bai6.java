import java.util.Scanner;
class KiemTraSoNguyenTo
{
    public static void main(String args[])
    {
        int n,count=0;
        int status = 1;
        int num = 3;
        System.out.println("100 số nguyên tố đầu tiên là:");
        System.out.println(2);
        for ( int i = 2 ; i <=100 ;  )
        {
            for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
            {
                if ( num%j == 0 )
                {
                    status = 0;
                    break;
                }
            }
            if ( status != 0 )
            {
                System.out.println(num);
                 i++;
                 num++;
            }
            status = 1;
            num++;
        }
    }
}