import java.util.Scanner;
class Bonus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of year employed");
        int year=sc.nextInt();
        if(year>5)
        {
            System.out.println("We get the bonus of 5000");
        }
        else if(year>3 || year<5)
        {
            System.out.println("We get the bonus of 3000");
        }
        else
        {
            System.out.println("We do not get the bonus ");
        }
    }
}