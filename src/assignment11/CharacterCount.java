package assignment11;
import java.io.*;
import java.nio.Buffer;
import java.util.*;
public class CharacterCount {
    public static void main(String[] args) throws IOException {
        Map<Character,Integer> characterOccurences= new HashMap<Character,Integer>();
        FileReader fileReader=new FileReader("src/assignment11/input.txt");
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String line=bufferedReader.readLine();
        while(line!=null){
            for(char c:line.toCharArray()){
                characterOccurences.put(c,characterOccurences.getOrDefault(c,0)+1);
            }
            line=bufferedReader.readLine();
        }
        System.out.println(characterOccurences);
        FileWriter fileWriter=new FileWriter("src/assignment11/output.txt");
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        bufferedWriter.append(characterOccurences.toString());
        bufferedWriter.close();
        fileWriter.close();
    }
}
