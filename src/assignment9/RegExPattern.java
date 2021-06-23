package assignment9;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegExPattern {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String");
        String input=scanner.nextLine();
        Boolean matches= Pattern.matches("^[A-z].*[.]$",input);
        if(matches){
            System.out.println("sentence begin with a capital and ends with a period.");
        }
        else {
            System.out.println("sentence either does not begin with a capital or end with a period");
        }
    }
}
