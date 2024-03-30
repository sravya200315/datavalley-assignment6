import java.util.Arrays;
import java.util.Scanner;
class Sum {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int length=arr.length;
        System.out.println("The smallest number is "+arr[0]+"  and largest number is "+arr[length-1]);


   }
}
