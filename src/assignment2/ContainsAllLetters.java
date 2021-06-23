package assignment2;

import java.util.*;

public class ContainsAllLetters {
    public  void containsAllLetters(String string){
        boolean[] letters = new boolean[26];
        for (int i=0;i<string.length();i++){
            char ch=string.charAt(i);
            if(ch>='a'&&ch<='z'){
                letters[ch-'a']=true;
            }
        }
        for(boolean letter:letters){
            if(!letter){
                System.out.println("Doesn't contain all the letters");
                return;
            }

        }
        System.out.println("Contains all the letters");
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String string = sc.nextLine();
        ContainsAllLetters containsAllLetters=new ContainsAllLetters();
        containsAllLetters.containsAllLetters(string);

    }
}
