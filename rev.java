import java.util.*;
class rev
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=n-1;i>=0;i--)
        {
            for(int j=i-1;j>=0;j--)
            {
                System.out.print("  ");
            }
            
            for(int k=0;k<n;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        
        
    }
}