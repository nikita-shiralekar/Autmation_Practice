package Day1_read;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileRead1 {
	
	public void readLast()throws IOException{
        FileReader file=new FileReader("C:\\Users\\Niku\\Desktop\\Interview_question_java_testing_selenium.txt");  //address of the file 
        List<String> Lines=new ArrayList<>();  //to store all lines
        Scanner sc=new Scanner(file);
        while(sc.hasNextLine()){  //checking for the presence of next Line
            Lines.add(sc.nextLine());  //reading and storing all lines
        }
        sc.close();  //close the scanner
        System.out.print(Lines.get(Lines.size()-1)); //displaying last one..
    }
}
