package assignment1;

import java.io.File;
import java.util.Scanner;

public class FileSearch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("Enter Regular Expression: ");
            String regularExpression=scanner.nextLine();
            FileSearch fileSearch=new FileSearch();
            fileSearch.search("/home",regularExpression);

        }

    }
    public void search(String filePath,String regularExpression) throws  NullPointerException{
        File directory=new File(filePath);
        File[] files=directory.listFiles();
        //System.out.println(files.length);
        //System.out.println(regularExpression);
        if(files!= null){
        for(File file:files){
            //System.out.println(file.getName());
            if(file.isDirectory()){
                search(file.getAbsolutePath(),regularExpression);
            }
            //using string method matches with regular expression
            else if(file.getName().matches(regularExpression)){
                System.out.println(file.getAbsolutePath());
            }
        }}
    }
}
