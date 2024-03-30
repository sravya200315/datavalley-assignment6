import java.util.Scanner;

public class Vowel{
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        int vowelCount = 0;
        
        for (int i = 0; i < input.length(); i++) {
            
           char ch=input.charAt(i);
            if ( ch== 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'|| ch=='A' || ch=='E'|| ch=='I'||ch=='O'||ch=='U') {
                vowelCount++;
            }
        }
        
        if (vowelCount!=0) {
            System.out.println("Vowels are present in the string.");
            System.out.println("Total number of vowels: " + vowelCount);
        } else {
            System.out.println("No vowels are present in the string.");
        }
    }
}