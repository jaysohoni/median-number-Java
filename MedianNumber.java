import java.util.*;
public class MedianNumber
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int[] num = new int[n];
        for(int i = 0; i < n; i++)
        {
            num[i] = sc.nextInt();
        } int temp = 0;
        for(int i = 1; i < n; i++)
        {
            for(int j = 0; j < n-1; j++)
            {
                if(num[j]>num[j+1])
                {
                    temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        if(n%2==0)
        {
            double x = num[(n/2)-1];
            double y = num[(n/2)];
            double f = (x+y)/2;
            System.out.println(f);
        }
        else
        {
            System.out.println(num[(n-1)/2]);
        }
    }
}
