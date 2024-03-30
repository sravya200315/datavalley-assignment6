import java.util.Scanner;
class Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int qu,qu1,rem,rem1;
        if(num%7==0 && num%13==0)
        {
            qu=num/7;
            rem=num%7;
            qu1=num/13;
            rem1=num%13;
        System.out.println("The quotient of 7 is"+qu+"and  reminder is"+rem);
         System.out.println("The quotient of 13 is"+qu1+"and reminder is"+rem1);
        }
        else
        {
            System.out.println(num+" is not divisible by 7 and 13");
        }
    }
}