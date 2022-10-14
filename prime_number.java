import java.util.*;
public class prime_number {
    public static void main(String[] args)
    {
        int i,j,n;
        System.out.print("Enter total input: ");
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        for(i = 0;i < n;i++)
        {
            int x = scn.nextInt();
            int count = 0;
            for(j = 2;j * j <= x;j++)
            {
                if(x % j == 0)
                {
                    count++;
                    break;
                }
            }
            if(count == 0 && x != 1 || x == 2)
            {
                System.out.println("Prime");
            }
            else
            {
                System.out.println("Not prime");
            }
        }
    }
}
